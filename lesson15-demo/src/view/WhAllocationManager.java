package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Store;
import model.DataModel;
import util.NumberUtils;
import util.StreamUtils;

public class WhAllocationManager {
	private static RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;

	public static void main(String[] args) {
		// == Input ==

		// số lượng mặt hàng.
		Integer whAllocationAmount = 300;

		// Danh sách cửa hàng cân nhắc để chuyển hàng.
		List<Store> stores = DataModel.getStore()
					.stream()
					.filter(Store::getIsSelected)
					.toList();


		Map<Long, Integer> storeAllocatedAmoounts = new LinkedHashMap<Long, Integer>();
		try {
			storeAllocatedAmoounts = doAllocation(whAllocationAmount, stores);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		storeAllocatedAmoounts.forEach((storeId, storeAllocatedAmount) -> {
//			System.out.println(storeId + " --> " + storeAllocatedAmount);
//		});

	}

	private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> stores) throws Exception {
		// Step1: Filling in missing "Expected Sales" values
		System.out.println("========== Step 1 ========");
		boolean hasNoExpectedSales = stores.stream().noneMatch(s -> s.getExpectedSales() != null);

		if (hasNoExpectedSales) {
			String msg = "Expected sales cannot be calc";
			throw new Exception(msg);
		}

		Map<Long, BigDecimal> interpolatedExpectedSalesMap = fillMissingExpectedSales(stores);
		generate(interpolatedExpectedSalesMap);

		// Step2: calc Allocation Key
		System.out.println("======== Step 2 =======");
		Map<Long, BigDecimal> allocationKeyMap = calculateAllocationKey(interpolatedExpectedSalesMap);
		generate(allocationKeyMap);

		// Step 3: calc amount allocated
		System.out.println("======= Step 3 =======");
		Map<Long, BigDecimal> stockPreviousDayMap = StreamUtils.toMap(stores, Store::getStoreId,
				Store::getStockPreviousDay);
		Map<Long, Integer> allocatedAmounts = calculateAllocatedAmounts(allocationKeyMap, stockPreviousDayMap,
				whAllocationAmount);
		generate(allocatedAmounts);

		// Step4: Fix rounding issues
		System.out.println("==== Step 4 =====");
		Map<Long, Integer> fixedAllocatedAmounts = fixRoundingIssues(interpolatedExpectedSalesMap, stockPreviousDayMap,
				allocatedAmounts, whAllocationAmount);

		return null;
	}

	private static Map<Long, Integer> fixRoundingIssues(Map<Long, BigDecimal> interpolatedExpectedSalesMap,
			Map<Long, BigDecimal> stockPreviousDayMap, Map<Long, Integer> allocatedAmounts,
			Integer whAllocationAmount) {

		Integer sumOfAllocatedAmounts = allocatedAmounts.values().stream().reduce(0, Integer::sum);

		if (sumOfAllocatedAmounts.equals(whAllocationAmount)) {
			System.out.println("Sum equal wh");
			return allocatedAmounts;
		}
		
		Map<Long, Integer> demandMap = StreamUtils.toMap(allocatedAmounts.entrySet(), Entry::getKey, e -> {
			Long storeId = e.getKey();
			return Math.max(interpolatedExpectedSalesMap.get(storeId).subtract(stockPreviousDayMap.get(storeId))
					.setScale(0, ROUNDING_MODE)
					.intValue(), 0);
		});
		
		Map<Long, Integer> fixedAllocatedAmounts = new LinkedHashMap<Long, Integer>(allocatedAmounts);

		if (sumOfAllocatedAmounts.compareTo(whAllocationAmount) > 0) {
			while(!sumOfAllocatedAmounts.equals(whAllocationAmount)) {
				//find store with biggest diff,...
				fixRoundingBiggest(fixedAllocatedAmounts, demandMap, interpolatedExpectedSalesMap);
				sumOfAllocatedAmounts -= 1;
			}
		}
		else {
			while (!sumOfAllocatedAmounts.equals(whAllocationAmount)) {
				fixRoundingSmallest(fixedAllocatedAmounts, demandMap, interpolatedExpectedSalesMap);
				sumOfAllocatedAmounts += 1;
			}
		}
		
		return fixedAllocatedAmounts;
	}

	private static void fixRoundingSmallest(Map<Long, Integer> fixedAllocatedAmounts, Map<Long, Integer> demandMap,
			Map<Long, BigDecimal> interpolatedExpectedSalesMap) {

	}

	private static void fixRoundingBiggest(Map<Long, Integer> fixedAllocatedAmounts, Map<Long, Integer> demandMap,
			Map<Long, BigDecimal> interpolatedExpectedSalesMap) {
		List<Entry<Long, Integer>> nonZeroAllocatedAmounts = fixedAllocatedAmounts.entrySet().stream()
				.filter(e -> !e.getValue().equals(0)).toList();

		// init selected stores as finding store matches conditions to subtract -1
		Entry<Long, Integer> selectedStore = nonZeroAllocatedAmounts.iterator().next();

		for (Entry<Long, Integer> store : nonZeroAllocatedAmounts) {
			Long storeId = store.getKey();

			int biggestDiff = selectedStore.getValue() - demandMap.get(selectedStore.getKey());
			int diff = store.getValue() - demandMap.get(storeId);

			if (diff > biggestDiff) {
				selectedStore = store;
				continue;
			}

			if (diff == biggestDiff) {
				int smallestDemand = demandMap.get(selectedStore.getKey());
				int demand = demandMap.get(storeId);

				if (demand < smallestDemand) {
					selectedStore = store;
					continue;
				}

				if (demand == smallestDemand) {
					BigDecimal smallestExpectedSales = interpolatedExpectedSalesMap.get(selectedStore.getKey());
					BigDecimal expectedSales = interpolatedExpectedSalesMap.get(storeId);

					if (expectedSales.compareTo(smallestExpectedSales) < 0) {
						selectedStore = store;
						continue;
					}

					if (expectedSales.compareTo(smallestExpectedSales) == 0) {
						Long smallestStoreID = selectedStore.getKey();

						if (storeId < smallestStoreID) {
							selectedStore = store;
						}
					}
				}
			}
		}
		
		selectedStore.setValue(selectedStore.getValue() - 1);
		System.out.println("Subtract 1 unit to store: " + selectedStore.getKey());
	}

	private static Map<Long, Integer> calculateAllocatedAmounts(Map<Long, BigDecimal> allocationKeyMap,
			Map<Long, BigDecimal> storePreviousDayMap, Integer whAllocationAmount) {

		BigDecimal sumOfStockPreviousDay = storePreviousDayMap.values().stream().reduce(BigDecimal.ZERO,
				BigDecimal::add);

		return	allocationKeyMap.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, e -> {
					Long storeId = e.getKey();
					BigDecimal allocationKey = e.getValue();
					int allocatedAmounts = allocationKey
							.multiply(BigDecimal.valueOf(whAllocationAmount).add(sumOfStockPreviousDay))
							.subtract(storePreviousDayMap.get(storeId))
							.setScale(0, ROUNDING_MODE)
							.intValue();
					// if allocated amount is negative, use 0 for next step
					return Math.max(allocatedAmounts, 0);
				}));
				
	}

	private static Map<Long, BigDecimal> calculateAllocationKey(Map<Long, BigDecimal> interpolatedExpectedSalesMap) {
		BigDecimal sumOfExpectedSales = interpolatedExpectedSalesMap.values()
				.stream()
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		return interpolatedExpectedSalesMap.entrySet().stream().collect(
				Collectors.toMap(Entry::getKey, e -> e.getValue().divide(sumOfExpectedSales, 10, ROUNDING_MODE)));
	}

	private static Map<Long, BigDecimal> fillMissingExpectedSales(List<Store> stores){
		Map<Long, BigDecimal> interpolatedExpectedSalesMap = new LinkedHashMap<Long, BigDecimal>();
		
		Map<Long, BigDecimal> initialExpectedSalesMap = StreamUtils.toMap(stores, Store::getStoreId,
				Store::getExpectedSales);

		BigDecimal average = calculateAvg(stores);

		stores.forEach(store -> {
			Long storeId = store.getStoreId();

			BigDecimal interpolatedExpectedSales = null;
			BigDecimal expectedSales = store.getExpectedSales();

			if(expectedSales == null) {
				Long refStoreId = store.getReferenceStoreId();
				if(refStoreId == null) {
					interpolatedExpectedSales = average;
					System.out.println("Store " + storeId + " has no expected Sales (no ref), use avg");
				}
				else {
					BigDecimal refStoreExpectedSales = initialExpectedSalesMap.get(refStoreId);
					if(refStoreExpectedSales == null) {
						interpolatedExpectedSales = average;
						System.out.println("Store " + storeId + " has no exp sales (has ref, but no expt), use avg");
					}
					else {
						interpolatedExpectedSales = refStoreExpectedSales;
					}
				}
			}
			else {
				interpolatedExpectedSales = expectedSales;
			}

			interpolatedExpectedSalesMap.put(storeId, interpolatedExpectedSales);
		});	

		return interpolatedExpectedSalesMap;
	}
	
	private static BigDecimal calculateAvg(List<Store> stores) {
		List<BigDecimal> nonNullExpectedSales = stores.stream()
				.map(Store::getExpectedSales)
				.filter(expectedSale -> expectedSale!=null)
				.toList();
			
			BigDecimal sum = nonNullExpectedSales.stream()
				.reduce(BigDecimal.ZERO, BigDecimal::add);
			
			return sum.divide(NumberUtils.bd(nonNullExpectedSales.size()), 1, ROUNDING_MODE);
	}

	private static <K, V> void generate(Map<K, V> entries) {
		entries.forEach((storeId, value) -> {
			System.out.println(storeId + " --> " + value);
		});
	}
}
