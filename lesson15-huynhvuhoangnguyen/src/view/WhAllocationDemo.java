package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;
import bean.Store;
import model.DataModel;

public class WhAllocationDemo {

    public static void main(String[] args) {
    	Map<Item, List<Store>> storeData = DataModel.mockStoresOfRefItemA55();
    	List<Store> stores = storeData.get(new Item(55, "Item A55"));
    	
    	BigDecimal planningAmountContry = BigDecimal.valueOf(DataModel.planningAmount);
    	Map<Integer, BigDecimal> demandByWh = sumDemandByWh(stores);
    	Map<Integer, BigDecimal> sharesBywh = calculateShareWH(demandByWh);
    	Map<Integer, BigDecimal> allocationByWh = allocatedByShares(sharesBywh, planningAmountContry);
    	Map<Integer, BigDecimal> finalAllocationByWh = applyMinimum(allocationByWh, 
    							BigDecimal.valueOf(DataModel.requiredMinPlanningAmount), stores.size());
    	Map<Integer, BigDecimal> newSharesByWh = recalculateShares(allocationByWh, finalAllocationByWh);
    	Map<Integer, BigDecimal> reallocatedaAmountByWh = reallocate(newSharesByWh, planningAmountContry);
    	Map<Integer, Integer> roundedAllocationByWh = roundUp(reallocatedaAmountByWh);
    	
    	roundedAllocationByWh.forEach((whId, amount) -> 
    			System.out.println("Wharehouse ID: " + whId + " Allocated amount: " + amount));
    	
    }

    private static boolean checkPanningAmount(BigDecimal planningAmount) {
        return planningAmount != null
                && planningAmount.compareTo(BigDecimal.valueOf(DataModel.requiredMinPlanningAmount)) > 0;
    }

    private void processStorePotentials(List<Store> stores) {
        List<BigDecimal> ownPotentials = new ArrayList<>();
        for (Store store : stores) {
            if (store.getPotential() != null && store.getPotential().compareTo(BigDecimal.ZERO) > 0) {
                ownPotentials.add(store.getPotential());
            }
        }

        BigDecimal averagePotential = BigDecimal.ZERO;
        if (!ownPotentials.isEmpty()) {
            BigDecimal sum = BigDecimal.ZERO;
            for (BigDecimal potential : ownPotentials) {
                sum = sum.add(potential);
            }
            averagePotential = sum.divide(new BigDecimal(ownPotentials.size()), RoundingMode.HALF_UP);
        }

        for (Store store : stores) {
            if (store.getPotential() == null || store.getPotential().compareTo(BigDecimal.ZERO) <= 0) {
                Store referenceStore = findReferenceStore(stores, store);
                store.setPotential(referenceStore != null && referenceStore.getPotential() != null
                        ? referenceStore.getPotential() : averagePotential);
            }
        }
    }

    private Store findReferenceStore(List<Store> stores, Store store) {
        for (Store potentialReferenceStore : stores) {
            if (!potentialReferenceStore.equals(store) && potentialReferenceStore.getPotential() != null) {
                return potentialReferenceStore;
            }
        }
        return null;
    }

    private static BigDecimal calculateStoreDemand(Store store) {
        Map<Integer, BigDecimal> weightRefs = DataModel.mockRefWeights();
        BigDecimal storeTrend = DataModel.mockStoreTrendFactors().getOrDefault(store.getId(), BigDecimal.ONE);
        BigDecimal weightref = weightRefs.getOrDefault(store.getId(), BigDecimal.ONE);
        return store.getPotential().multiply(weightref).multiply(storeTrend).setScale(1,RoundingMode.HALF_UP);
    }

    private static Map<Integer, BigDecimal> sumDemandByWh(List<Store> stores) {
        Map<Integer, BigDecimal> demandByWh = new HashMap<>();
        stores.forEach(store -> {
        	BigDecimal demand = calculateStoreDemand(store);
        	demandByWh.merge(store.getWhId(), demand, BigDecimal::add);
        }); 
        return demandByWh;
    }

    private static Map<Integer, BigDecimal> calculateShareWH(Map<Integer, BigDecimal> demandByWh) {
        BigDecimal totalDemand = demandByWh.values().stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        Map<Integer, BigDecimal> sharesByWh = new HashMap<>();
        for (Map.Entry<Integer, BigDecimal> entry : demandByWh.entrySet()) {
            Integer whId = entry.getKey();
            BigDecimal demand = entry.getValue();
            BigDecimal share = demand.divide(totalDemand, 2, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100));
            sharesByWh.put(whId, share);
        }
        return sharesByWh;
    }

    private static Map<Integer, BigDecimal> allocatedByShares(Map<Integer, BigDecimal> sharesByWh,
                                                       BigDecimal planningAmountCountry) {
        Map<Integer, BigDecimal> allocationByWh = new HashMap<>();
        for (Map.Entry<Integer, BigDecimal> entry : sharesByWh.entrySet()) {
            Integer whId = entry.getKey();
            BigDecimal share = entry.getValue();
            BigDecimal allocationAmount = share.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP)
                    .multiply(planningAmountCountry);
            allocationByWh.put(whId, allocationAmount);
        }
        return allocationByWh;
    }

    private static Map<Integer, BigDecimal> applyMinimum(Map<Integer, BigDecimal> allocationByWh, 
    		 										BigDecimal minimumPerStore, int numberOfStore) {
        Map<Integer, BigDecimal> finalAllocationByWh = new HashMap<>();
        for (Map.Entry<Integer, BigDecimal> entry : allocationByWh.entrySet()) {
            Integer whId = entry.getKey();
            BigDecimal allocationAmount = entry.getValue();
            BigDecimal minimumAmount = minimumPerStore.multiply(BigDecimal.valueOf(numberOfStore));
            finalAllocationByWh.put(whId, allocationAmount.compareTo(minimumAmount) < 0 ? minimumAmount : allocationAmount);
        }
        return finalAllocationByWh;
    }

    private static Map<Integer, BigDecimal> recalculateShares(Map<Integer, BigDecimal> allocationByWh,
                                                      Map<Integer, BigDecimal> finalAllocationByWh) {
    	BigDecimal totalAllocationWithoutMinimum = finalAllocationByWh.values().stream()
    			.filter(amount -> checkPanningAmount(amount))
    			.reduce(BigDecimal.ZERO, BigDecimal::add);
    	Map<Integer, BigDecimal> newSharesByWh = new HashMap<>();
    	finalAllocationByWh.forEach((whId, allocationAmount) -> {
    		if(checkPanningAmount(allocationAmount)) {
        		BigDecimal newShare = allocationAmount.divide(totalAllocationWithoutMinimum, 2, RoundingMode.HALF_UP)
        				.multiply(BigDecimal.valueOf(100));
        		newSharesByWh.put(whId, newShare);
    		}
    	});
        return newSharesByWh;
    }

    private static Map<Integer, BigDecimal> reallocate(Map<Integer, BigDecimal> newSharesByWh,
                                                BigDecimal planningAmountByCountry) {
        BigDecimal totalAppliedMinimum = newSharesByWh.values().stream()
                .filter(amount -> amount.compareTo(BigDecimal.ZERO) == 0)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal adjustedPlanningAmount = planningAmountByCountry.subtract(totalAppliedMinimum);
        Map<Integer, BigDecimal> reallocatAmountByWh = new HashMap<>();
        for (Map.Entry<Integer, BigDecimal> entry : newSharesByWh.entrySet()) {
            Integer whId = entry.getKey();
            BigDecimal newShare = entry.getValue();
            if (newShare.compareTo(BigDecimal.ZERO) != 0) {
                BigDecimal reallocatedAmount = newShare.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP)
                        .multiply(adjustedPlanningAmount);
                reallocatAmountByWh.put(whId, reallocatedAmount);
            }
        }
        return reallocatAmountByWh;
    }

    private static Map<Integer, Integer> roundUp(Map<Integer, BigDecimal> reallocatAmountByWh) {
        Map<Integer, Integer> roundedAllocatedByWh = new HashMap<>();
        for (Map.Entry<Integer, BigDecimal> entry : reallocatAmountByWh.entrySet()) {
            Integer whId = entry.getKey();
            BigDecimal allocationAmount = entry.getValue();
            roundedAllocatedByWh.put(whId, allocationAmount.setScale(0, RoundingMode.UP).intValue());
        }
        return roundedAllocatedByWh;
    }
}