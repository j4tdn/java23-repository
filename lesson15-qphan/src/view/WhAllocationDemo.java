package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import bean.Item;
import bean.Store;
import model.DataModel;

public class WhAllocationDemo {

	public static void main(String[] args) {
		// Step 1: Check for planning amount
		int planningAmount = DataModel.planningAmount;
		int requiredMinPlanningAmount = DataModel.requiredMinPlanningAmount;

		if (planningAmount < requiredMinPlanningAmount) {
			System.out.println("Planning ammount is below minimum!");
			return;
		}

		// Step 2: Filling gaps by references or average
		Map<Integer, Store> storeMap = fillStorePotentials();

		// Step 3: Reference data
		List<Item> referenceItems = List.of(new Item(55, "Reference Item A55"), new Item(77, "Reference Item A77"));

		Map<Integer, BigDecimal> weights = DataModel.mockRefWeights();
		Map<Item, List<Store>> allReferencePotentials = Map.of(new Item(55, "Reference Item A55"),
				DataModel.mockStoresOfRefItemA55().get(new Item(55, "Reference Item A55")),
				new Item(77, "Reference Item A77"),
				DataModel.mockStoresOfRefItemA77().get(new Item(77, "Reference Item A77")));

		Map<Integer, BigDecimal> trendFactors = DataModel.mockStoreTrendFactors();

		// --> Calculate Store Demand
		Map<Integer, BigDecimal> storeDemandMap = calculateStoreDemand(storeMap, referenceItems, weights,
				allReferencePotentials, trendFactors);

		// Step 4: Sum up Demand to WH Level
		Map<Integer, BigDecimal> whDemandMap = sumUpDemandToWH(storeMap, storeDemandMap);

		// Step 5: Calculate Shares
		Map<Integer, BigDecimal> whSharesMap = calculateWHShares(whDemandMap);

		// Step 6: Allocate by Shares
		Map<Integer, BigDecimal> whAllocationMap = allocateByShares(whSharesMap, planningAmount);

		// Step 7-11:
		Map<Integer, Integer> finalAllocation = applyMinimumAndFixRounding(whAllocationMap, storeMap);
		
		// Print results
		System.out.println("Final Allocation to Warehouses");
		whAllocationMap.forEach((whId, allocation) -> System.out.println("WH " + whId + ": " + allocation + " items"));
	}

	// Step 2 method:
	private static Map<Integer, Store> fillStorePotentials() {
		Map<Integer, Store> result = new HashMap<>();

		// Merge potentials from mock Data
		DataModel.mockStoresOfRefItemA55().values()
				.forEach(stores -> stores.forEach(store -> result.put(store.getId(), store)));
		DataModel.mockStoresOfRefItemA77().values().forEach(stores -> stores.forEach(store -> {
			result.putIfAbsent(store.getId(), store);
			if (result.get(store.getId()).getPotential() == null
					|| result.get(store.getId()).getPotential().compareTo(BigDecimal.ZERO) == 0) {
				result.get(store.getId()).setPotential(store.getPotential());
			}
		}));

		// Fill missing potentials by references or average
		Map<Integer, Integer> refStores = DataModel.mockRefStores();
		BigDecimal avgPotential = result.values().stream()
				.filter(store -> store.getPotential() != null && store.getPotential().compareTo(BigDecimal.ZERO) > 0)
				.map(Store::getPotential).reduce(BigDecimal.ZERO, BigDecimal::add)
				.divide(BigDecimal.valueOf(result.size()), RoundingMode.HALF_UP);
		result.forEach((storeId, store) -> {
			if (store.getPotential() == null || store.getPotential().compareTo(BigDecimal.ZERO) == 0) {
				Integer refStoreId = refStores.get(storeId);
				if (refStoreId != null && result.containsKey(refStoreId)) {
					store.setPotential(result.get(refStoreId).getPotential());
				} else {
					store.setPotential(avgPotential);
				}
			}
		});

		return result;
	}

	// Step 3 method:
	private static Map<Integer, BigDecimal> calculateStoreDemand(Map<Integer, Store> storeMap,
			List<Item> referenceItems, Map<Integer, BigDecimal> weights, Map<Item, List<Store>> allReferencePotentials,
			Map<Integer, BigDecimal> trendFactors) {
		Map<Integer, BigDecimal> storeDemandMap = new HashMap<>();

		// Duyệt qua từng Store trong storeMap
		storeMap.forEach((storeId, store) -> {
			BigDecimal trendFactor = trendFactors.getOrDefault(storeId, BigDecimal.ONE);
			BigDecimal weightedPotentialSum = BigDecimal.ZERO; // Tổng (Potential * Weight)
			BigDecimal weightSum = BigDecimal.ZERO; // Tổng trọng số

			// Tính toán Weighted Potential Sum và Weight Sum
			for (Item refItem : referenceItems) {
				BigDecimal weight = weights.getOrDefault(refItem.getId(), BigDecimal.ONE);

				// Lấy Potential của Store cho Reference Item hiện tại
				List<Store> refStores = allReferencePotentials.getOrDefault(refItem, Collections.emptyList());
				Optional<Store> matchingStore = refStores.stream().filter(refStore -> refStore.getId() == storeId)
						.findFirst();

				if (matchingStore.isPresent()) {
					BigDecimal potential = matchingStore.get().getPotential();
					weightedPotentialSum = weightedPotentialSum.add(potential.multiply(weight));
					weightSum = weightSum.add(weight);
				}
			}

			// Tính Demand = (Weighted Potential Sum / Weight Sum) * Trend Factor
			BigDecimal demand = weightSum.compareTo(BigDecimal.ZERO) > 0
					? weightedPotentialSum.divide(weightSum, 6, RoundingMode.HALF_UP).multiply(trendFactor)
					: BigDecimal.ZERO;

			storeDemandMap.put(storeId, demand);
		});

		return storeDemandMap;
	}

	// Step 4 method:
	private static Map<Integer, BigDecimal> sumUpDemandToWH(Map<Integer, Store> storeMap,
			Map<Integer, BigDecimal> storeDemandMap) {
		Map<Integer, BigDecimal> whDemandMap = new HashMap<>();

		storeMap.forEach((storeId, store) -> {
			BigDecimal demand = storeDemandMap.get(storeId);
			whDemandMap.merge(store.getWhId(), demand, BigDecimal::add);
		});

		return whDemandMap;
	}

	// Step 5 method:
	private static Map<Integer, BigDecimal> calculateWHShares(Map<Integer, BigDecimal> whDemandMap) {
		BigDecimal totalDemand = whDemandMap.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);
		Map<Integer, BigDecimal> whShares = new HashMap<>();

		whDemandMap.forEach((whId, demand) -> {
			whShares.put(whId, demand.divide(totalDemand, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100)));
		});

		return whShares;
	}

	// Step 6 method:
	private static Map<Integer, BigDecimal> allocateByShares(Map<Integer, BigDecimal> whShares, int planningAmount) {
		Map<Integer, BigDecimal> whAllocation = new HashMap<>();

		whShares.forEach((whId, share) -> {
			BigDecimal allocation = share.divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP)
					.multiply(BigDecimal.valueOf(planningAmount));
			whAllocation.put(whId, allocation);
		});

		return whAllocation;
	}

	// Step 7-11 method:
	private static Map<Integer, Integer> applyMinimumAndFixRounding(Map<Integer, BigDecimal> whAllocation,
			Map<Integer, Store> storeMap) {
		Map<Integer, Integer> finalAllocation = new HashMap<>();

		// Minimum allocation
		int minPerStore = DataModel.minPerStore;
		storeMap.values().forEach(store -> {
			int whId = store.getWhId();
			finalAllocation.putIfAbsent(whId, 0);
			finalAllocation.put(whId, finalAllocation.get(whId) + minPerStore);

		});

		// Rounding
		BigDecimal totalPlanned = whAllocation.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);
		BigDecimal planningAmountCountry = BigDecimal.valueOf(DataModel.planningAmount);

		// If Planning Amount Country = SUM(Allocation Amount Rounded WH of all WH of
		// the country)
		if (totalPlanned.compareTo(planningAmountCountry) == 0) {
			// --> Allocation is done: Display Demand and Wh Allocation Results to console)
			return finalAllocation;
		}

		// If Planning Amount Country < SUM(Allocation Amount Rounded WH of all WH of
		// the country)
		while (totalPlanned.compareTo(planningAmountCountry) != 0) {
			Optional<Map.Entry<Integer, BigDecimal>> maxDeviationWH = whAllocation.entrySet().stream()
					.filter(entry -> finalAllocation.containsKey(entry.getKey()))
					.max(Map.Entry.comparingByValue((v1, v2) -> v1.subtract(v2).compareTo(BigDecimal.ZERO)));

			if (maxDeviationWH.isPresent()) {
				int whId = maxDeviationWH.get().getKey();
				BigDecimal deviation = maxDeviationWH.get().getValue();

				Store store = storeMap.get(whId);
				BigDecimal storePotential = store.getPotential();
				if (deviation.compareTo(BigDecimal.valueOf(minPerStore * storePotential.intValue())) == 0) {
					continue;
				}

				finalAllocation.put(whId, finalAllocation.get(whId) - 1);
			}

			totalPlanned = whAllocation.entrySet().stream()
					.map(entry -> BigDecimal.valueOf(finalAllocation.get(entry.getKey())))
					.reduce(BigDecimal.ZERO, BigDecimal::add);
			
			if(totalPlanned.compareTo(planningAmountCountry) == 0) {
				break;
			}
		}
		
		return finalAllocation;
	}

}
