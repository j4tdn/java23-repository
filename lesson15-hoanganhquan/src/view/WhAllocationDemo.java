package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import bean.Item;
import bean.Store;
import model.DataModel;

public class WhAllocationDemo {

    public static void main(String[] args) {
        Map<Item, List<Store>> A55 = DataModel.mockStoresOfRefItemA55();
        Map<Item, List<Store>> A77 = DataModel.mockStoresOfRefItemA77();
        
        if (checkPlanningAmount(DataModel.planningAmount, DataModel.requiredMinPlanningAmount)) {
            fillingGapsByReferenceOrAverage(A77, DataModel.mockRefStores());
            Map<Store, BigDecimal> demands = calculateDemand(A55, A77, DataModel.weighting, DataModel.storeTrend);
            Map<Store, BigDecimal> summedDemands = sumUpWareHouse(demands);
            Map<Store, BigDecimal> shared = calcSharedWareHouse(summedDemands, demands);
            Map<Store, BigDecimal> allocations = calcAllocationWareHouse(shared);

            applyMinimum(allocations, DataModel.minimumPerStore);
            recalculateShare(allocations, DataModel.planningAmount);

            allocations.forEach((store, amount) -> System.out.println("Allocation for Store " + store.getId() + ": " + amount));
        }
        
        A55.values().stream().flatMap(List::stream).forEach(s -> System.out.println(s.toString()));
    }

    private static boolean checkPlanningAmount(Integer planningAmount, Integer minRequiredPlanning) {
        return planningAmount >= minRequiredPlanning;
    }

    private static Map<Item, List<Store>> fillingGapsByReferenceOrAverage(Map<Item, List<Store>> stores,
            Map<Integer, Integer> referenceStore) {
        if (stores.values().stream().flatMap(List::stream).noneMatch(s -> s.getPotential().compareTo(BigDecimal.ZERO) == 0)) {
            return stores; 
        }
        stores.values().stream().flatMap(List::stream).filter(s -> s.getPotential().compareTo(BigDecimal.ZERO) == 0)
                .forEach(store -> {
                    if (referenceStore.containsKey(store.getId())) {
                        BigDecimal potential = stores.values().stream().flatMap(List::stream)
                                .filter(s -> s.getId().equals(referenceStore.get(store.getId())))
                                .map(Store::getPotential)
                                .reduce(BigDecimal.ZERO, BigDecimal::add);
                        store.setPotential(potential);
                    } else {
                        BigDecimal averagePotential = stores.values().stream().flatMap(List::stream)
                                .map(Store::getPotential)
                                .reduce(BigDecimal.ZERO, BigDecimal::add)
                                .divide(BigDecimal.valueOf(stores.size()), RoundingMode.HALF_UP);
                        store.setPotential(averagePotential);
                    }
                });

        return stores;
    }

    private static Map<Store, BigDecimal> calculateDemand(Map<Item, List<Store>> storesA,
            Map<Item, List<Store>> storesB,
            Map<Integer, Integer> weighting, Map<Integer, Integer> storeTrend) {

        Map<Store, BigDecimal> results = new HashMap<>();

        List<BigDecimal> totalPotentialRefStoreAList = storesA.values().stream().flatMap(List::stream)
                .map(store -> store.getPotential()
                        .multiply(BigDecimal.valueOf(weighting.get(storesA.keySet().stream().map(Item::getId).findFirst().orElse(0)))))
                .toList();

        List<BigDecimal> totalPotentialRefStoreBList = storesB.values().stream().flatMap(List::stream)
                .map(store -> store.getPotential()
                        .multiply(BigDecimal.valueOf(weighting.get(storesB.keySet().stream().map(Item::getId).findFirst().orElse(0)))))
                .toList();

        for (int i = 0; i < Math.min(totalPotentialRefStoreAList.size(), totalPotentialRefStoreBList.size()); i++) {
            BigDecimal sum = totalPotentialRefStoreAList.get(i).add(totalPotentialRefStoreBList.get(i));
            Store storeA = storesA.values().stream().flatMap(List::stream).toList().get(i);
            results.put(storeA, sum);
        }

        return results;
    }

    private static Map<Store, BigDecimal> sumUpWareHouse(Map<Store, BigDecimal> demands) {
        Map<Store, BigDecimal> sumUpWH = new HashMap<>();

        for (Entry<Store, BigDecimal> entry : demands.entrySet()) {
            sumUpWH.merge(entry.getKey(), entry.getValue(), BigDecimal::add);
        }

        return sumUpWH;
    }

    private static Map<Store, BigDecimal> calcSharedWareHouse(Map<Store, BigDecimal> sumUp,
            Map<Store, BigDecimal> demands) {
        BigDecimal sumTotalWH = demands.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        Map<Store, BigDecimal> sharedWH = new HashMap<>();

        for (Entry<Store, BigDecimal> entry : sumUp.entrySet()) {
            Store store = entry.getKey();
            BigDecimal sumEachStore = entry.getValue();
            sharedWH.put(store, sumEachStore.divide(sumTotalWH, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100)));
        }

        return sharedWH;
    }

    private static Map<Store, BigDecimal> calcAllocationWareHouse(Map<Store, BigDecimal> shared) {
        Map<Store, BigDecimal> allocationWH = new HashMap<>();

        for (Entry<Store, BigDecimal> entry : shared.entrySet()) {
            Store store = entry.getKey();
            BigDecimal sharedValue = entry.getValue();
            allocationWH.put(store, sharedValue.divide(BigDecimal.valueOf(100)).multiply(BigDecimal.valueOf(DataModel.planningAmount)));
        }

        return allocationWH;
    }

    private static void applyMinimum(Map<Store, BigDecimal> allocations, BigDecimal minimumPerStore) {
        allocations.forEach((store, amount) -> {
            if (amount.compareTo(minimumPerStore) < 0) {
                allocations.put(store, minimumPerStore);
            }
        });
    }

    private static void recalculateShare(Map<Store, BigDecimal> allocations, Integer planningAmount) {
        BigDecimal totalAllocations = allocations.values().stream()
            .reduce(BigDecimal.ZERO, BigDecimal::add);
        
        if (totalAllocations.compareTo(BigDecimal.valueOf(planningAmount)) != 0) {
            allocations.forEach((store, amount) -> {
                BigDecimal newShare = amount.divide(totalAllocations, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100));
                allocations.put(store, newShare.divide(BigDecimal.valueOf(100)).multiply(BigDecimal.valueOf(planningAmount)));
            });
        }
    }
}