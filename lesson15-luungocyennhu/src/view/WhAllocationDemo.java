package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static model.DataModel.*;
import static utils.NumberUtils.*;

import bean.Item;
import bean.Store;

public class WhAllocationDemo {
	
	public static void main(String[] args) {
		// use data from DataModel
		Map<Item, List<Store>> storeItem77 = mockStoresOfRefItemA77();
		List<Store> stores = convert(storeItem77);
		List<Store> s55 = convert(mockStoresOfRefItemA55());
		List<Store> s77 = convert(mockStoresOfRefItemA77());
		Map<Integer, BigDecimal> trendsFactor = mockStoreTrendFactors();
		Map<Integer, BigDecimal> refWeight = mockRefWeights();
		// do calculation
		
		// step 1
		System.out.println("\n=========== STEP 1 =============\n");
		if(!isPlanningAmount(planningAmount, requiredMinPlanningAmount)) {
			System.out.println("Stop calculation");
			return;
		}
		System.out.println("Continue step 2");
		
		// step 2
		System.out.println("\n=========== STEP 2 =============\n");
		System.out.println(fillingGaps(stores));

		// step 3
		System.out.println("\n=========== STEP 3 =============\n");
		List<Store> step3 = step3();
		System.out.println(step3);
		
		// step 4
		System.out.println("\n=========== STEP 4 =============\n");
		Map<Integer, BigDecimal> step4 = wareHouse(step3);
		System.out.println(step4);
		
		// step 5
		System.out.println("\n=========== STEP 5 =============\n");
		Map<Integer, BigDecimal> step5 = calculationShares(step4);
		System.out.println(step5);
		
		// step 6
		System.out.println("\n=========== STEP 6 =============\n");
		Map<Integer, BigDecimal> step6 = allocationShares(step5, planningAmount);
		System.out.println(step6);
		
		// step 7
		System.out.println("\n=========== STEP 7 =============\n");
		Map<Integer, BigDecimal> step7 = applyMin(step3, step6);
		System.out.println(step7);
	}
	
	// step 1
	private static boolean isPlanningAmount(Integer planningAmount, Integer requiredMinPlanningAmount) {
		return planningAmount >= requiredMinPlanningAmount;
	}
	
	// step 2
	private static List<Store> fillingGaps(List<Store> stores) {
		stores.forEach(store -> {
			if(store.getPotential() == null || store.getPotential().compareTo(BigDecimal.ZERO) == 0) {
				Integer id = mockRefStores().get(store.getId());
				if (id != null) {
					BigDecimal potentialNew = stores.stream()
						.filter(t -> t.getId().equals(id))
						
						.map(Store::getPotential)
						.findFirst()
						.orElse(BigDecimal.ZERO)
						.setScale(1, RoundingMode.HALF_UP)
						;
					store.setPotential(potentialNew);
				} else {
					store.setPotential(averageOfStores(stores));
				}
			}
		});
		return stores;
	}
	private static BigDecimal averageOfStores(List<Store> stores) {
		BigDecimal total = stores.stream()
				.map(Store::getPotential)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		long count = stores.stream()
				.filter(s -> s.getPotential().compareTo(BigDecimal.ZERO) != 0)
				.count();
		
		return total.divide(bd(count), 1, RoundingMode.HALF_UP);
	}

	// step3
	private static List<Store> step3() {
		List<Store> s55 = convert(mockStoresOfRefItemA55());
		List<Store> s77 = convert(mockStoresOfRefItemA77());
		List<Store> result = new ArrayList<>();

		for (int i = 0; i < s55.size(); i++) {
		BigDecimal trends = mockStoreTrendFactors().get(i+1);
		BigDecimal p55 = s55.get(i).getPotential();
		BigDecimal p77 = s77.get(i).getPotential();
		if (p55 == null) {
			p55 = BigDecimal.ZERO;
		}
		if (p77 == null) {
			p77 = BigDecimal.ZERO;
		}
		if (trends == null) {
			trends = BigDecimal.ONE;
		}
		BigDecimal sum = p77.multiply(bd(1.5)).add(p55.multiply(bd(2.5)));
		BigDecimal avg = sum.divide(bd(4), RoundingMode.HALF_UP).multiply(trends).setScale(1, RoundingMode.HALF_UP);
		
		Store store = s77.get(i);
		store.setPotential(avg);
			result.add(store);
			
		}
		return result;
		
	}
	// step 4
	private static Map<Integer, BigDecimal> wareHouse(List<Store> stores) {
		return stores.stream()
					.collect(Collectors.groupingBy(Store::getWhId,
							Collectors.reducing(bd(0), Store::getPotential, BigDecimal::add)));
	}
	
	// step 5
	private static Map<Integer, BigDecimal> calculationShares(Map<Integer, BigDecimal> warehouse) {
		return warehouse.entrySet()
					.stream()
					.collect(Collectors.toMap(Map.Entry::getKey, t -> t.getValue().multiply(bd(100)).divide(
																							warehouse.values()
																							.stream()
																							.reduce(bd(0), BigDecimal::add), 2, RoundingMode.HALF_UP)));
	}
	
	// step 6
	@SuppressWarnings("unused")
	private static Map<Integer, BigDecimal> allocationShares(Map<Integer, BigDecimal> shares, Integer planning) {
		return shares.entrySet()
				.stream()
				.collect(Collectors.toMap(Map.Entry::getKey, t -> t.getValue().multiply(bd(planning)).divide(
																							bd(100), 8, RoundingMode.HALF_UP)));
	}
	
	// step 7
	private static Map<Integer, BigDecimal> applyMin(List<Store> stores, Map<Integer, BigDecimal> allocation) {
		Integer total = stores.stream()
				.map(Store::getWhId)
				.collect(Collectors.toSet())
				.size();
		
		return allocation.entrySet()
				.stream()
				.collect(Collectors.toMap(Map.Entry::getKey, t -> t.getValue().max(bd(minPerStore*total))));
	}
	
	private static List<Store> convert(Map<Item, List<Store>> stores) {
		return stores.values()
		.stream()
		.flatMap(List::stream)
		.collect(Collectors.toList());
	}

	
}
