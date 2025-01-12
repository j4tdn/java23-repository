package view;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import bean.Item;
import bean.Store;
import model.DataModel;

public class WhAllocationDemo {
	
	public static void main(String[] args) {
		// use data from DataModel
		Map<Item, List<Store>> A55 = DataModel.mockStoresOfRefItemA55();
		Map<Item, List<Store>> A77 = DataModel.mockStoresOfRefItemA77();
		// do calculation
		if (checkPlanningAmount(DataModel.planningAmount, DataModel.requiredMinPlanningAmount))
		{
			fillingGapsByReferenceOrAverage(A77, DataModel.mockRefStores());
		}
		
		// print result step by step
		A55.values().stream().flatMap(List::stream).forEach(s->System.out.println(s.toString()));;
	}
	
	private static boolean checkPlanningAmount(Integer planningAmount, Integer minRequiredPlanning) {
		return planningAmount >= minRequiredPlanning;
	}

	private static Map<Item, List<Store>> fillingGapsByReferenceOrAverage(Map<Item, List<Store>> stores,
			Map<Integer, Integer> referenceStore) {
		if (stores.values().stream().flatMap(List::stream).noneMatch(s -> s.getPotential() == BigDecimal.ZERO))
			return stores;
		
		stores.values().stream().flatMap(List::stream).filter(s -> s.getPotential() == BigDecimal.ZERO)
				.map(store -> {
			if (referenceStore.keySet().contains(store.getId())) {
				BigDecimal potential = (BigDecimal) stores.values().stream().flatMap(List::stream)
						.filter(s -> s.getId() == referenceStore.get(store.getId())).map(Store::getPotential);
				store.setPotential(potential);
			} else {
				BigDecimal potential = stores.values().stream().flatMap(List::stream).map(s -> s.getPotential())
						.reduce(BigDecimal.ZERO, (a, b) -> a.add(b)).divide(BigDecimal.valueOf(stores.size()));
				store.setPotential(potential);
			}
			return store;
				});
		
		return stores;
	}

	// Step 3
	private static Map<Store, BigDecimal> calculateDemand(Map<Item, List<Store>> storesA,
			Map<Item, List<Store>> storesB,
			Map<Integer, Integer> weighting, Map<Integer, Integer> storeTrend) {

		Map<Store, BigDecimal> results = new HashMap<Store, BigDecimal>();

		List<BigDecimal> totalPotentialRefStoreAList = storesA.values().stream().flatMap(List::stream)
				.map(store -> store.getPotential()
						.multiply(BigDecimal.valueOf(weighting.get(storesA.keySet().stream().map(Item::getId)))))
				.toList();
		List<BigDecimal> totalPotentialRefStoreBList = storesA.values().stream().flatMap(List::stream)
				.map(store -> store.getPotential()
						.multiply(BigDecimal.valueOf(weighting.get(storesA.keySet().stream().map(Item::getId)))))
				.toList();
		
		for (int i = 0; i < storesA.size(); i++) {
			BigDecimal sum = totalPotentialRefStoreAList.get(i).add(totalPotentialRefStoreBList.get(i));

//			BigDecimal result = sum.multiply(storesA.values().stream().flatMap(List::stream).map(store -> {
//				BigDecimal storeTrendRow = storeTrend.entrySet().stream().filter(e -> e.getKey() == store.getId())
//						.map(e -> e.getValue())
//						.findFirst();
//				if (storeTrendRow != null)
//					return BigDecimal.valueOf(1);
//				return storeTrendRow;
//			}).reduce(BigDecimal.ZERO, BigDecimal::add));

			// Không biết cách interact với 2 stores cùng 1 lúc !! chịu ~~
		}
		
		return null;
	}

	// Step 4 //Giả sử đã có demands
	private static Map<Store, BigDecimal> sumUpWareHouse(Map<Store, BigDecimal> demands) {
		Map<Store, BigDecimal> sumUpWH = new HashMap<>();

		for (Entry<Store, BigDecimal> entry : demands.entrySet()) {
			Store store = entry.getKey();
			BigDecimal demand = entry.getValue();

			sumUpWH.merge(store, demand, BigDecimal::add);
		}

		return sumUpWH;
	}

	// Step 5
	private static Map<Store, BigDecimal> calcSharedWareHouse(Map<Store, BigDecimal> sumUp,
			Map<Store, BigDecimal> demands) {
		BigDecimal sumTotalWH = demands.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);

		Map<Store, BigDecimal> sharedWH = new HashMap<>();
		for (Entry<Store, BigDecimal> entry : sumUp.entrySet()) {
			Store store = entry.getKey();
			BigDecimal sumEachStore = entry.getValue();

			sharedWH.put(store, sumEachStore.divide(sumTotalWH).multiply(BigDecimal.valueOf(100)));
		}

		return sharedWH;
	}

	// Step 6
	private static Map<Store, BigDecimal> calcAllocationWareHouse(Map<Store, BigDecimal> shared) {
		Map<Store, BigDecimal> allocationWH = new HashMap<Store, BigDecimal>();

		for (Entry<Store, BigDecimal> entry : shared.entrySet()) {
			Store store = entry.getKey();
			BigDecimal sharedValue = entry.getValue();

			allocationWH.put(store,
					sharedValue.divide(BigDecimal.valueOf(100)).multiply(BigDecimal.valueOf(DataModel.planningAmount)));
		}
		
		return allocationWH;
	}
}
