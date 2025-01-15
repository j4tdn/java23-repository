package view;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static model.DataModel.*;
import static utils.NumberUtils.*;
import bean.Item;
import bean.Store;

public class WhAllocationDemo {
	
	public static void main(String[] args) {
		// use data from DataModel
		Integer planningAmountCountry = planningAmount;
		Integer requiredMinPlanning = requiredMinPlanningAmount;
		Integer minEachStore = minPerStore;
		
		Map<Integer, BigDecimal> storeTrends = mockStoreTrendFactors();
		
		
		Map<Item, List<Store>> itemA55 = new HashMap<>(mockStoresOfRefItemA55());
		itemA55.replaceAll((item, store) -> new ArrayList<>(store));
		
		Map<Item, List<Store>> itemA77 = new HashMap<>(mockStoresOfRefItemA77());
		itemA77.replaceAll((item, store) -> new ArrayList<>(store));
		// do calculation
		
		// step one
		checkPlanningAmountCountry(planningAmountCountry, requiredMinPlanning);
		
		// step two
		fillingPotentialNotMaintained(itemA55);
		fillingPotentialNotMaintained(itemA77);
		
		
		
		
		// print result step by step
		
		// step two
		itemA55.forEach((item, store) -> {
			System.out.println(item);
			store.forEach(System.out::println);
		});
		
		System.out.println("\n");
		
		itemA77.forEach((item, store) -> {
			System.out.println(item);
			store.forEach(System.out::println);
		});
	}
	
	@SuppressWarnings("deprecation")
	private static void fillingPotentialNotMaintained(Map<Item, List<Store>> referenceItem) {
		BigDecimal sumOfMaintainedPotential = referenceItem
									.entrySet()
									.stream() 
									.flatMap(e -> e.getValue().stream())
									.filter(s -> s.getPotential().compareTo(BigDecimal.ZERO) != 0)
									.map(Store::getPotential)
									.reduce(BigDecimal.ZERO, BigDecimal::add);
				
		long count = referenceItem.entrySet()
							.stream()
							.flatMap(e -> e.getValue().stream())
							.filter(s -> s.getPotential() != null)
							.count();
		
		@SuppressWarnings("deprecation")
		BigDecimal average = sumOfMaintainedPotential.divide(bd(count), 1, BigDecimal.ROUND_HALF_UP);
		
		Map<Integer, BigDecimal> data = referenceItem.entrySet().stream()
								.flatMap(e -> e.getValue().stream())
								.filter(s -> s.getPotential().compareTo(BigDecimal.ZERO) != 0)
								.collect(Collectors.toMap(Store::getId, Store::getPotential));
		
		referenceItem.entrySet().stream()
								.flatMap(e -> e.getValue().stream())
								.filter(s -> s.getPotential().compareTo(BigDecimal.ZERO) == 0)
								.forEach(s -> {
									if(s.getWhId() == null || (s.getWhId() != null && data.get(s.getWhId()).compareTo(BigDecimal.ZERO) == 0))
										s.setPotential(average);
								});
		
		referenceItem.entrySet().stream()
								.flatMap(e -> e.getValue().stream())
								.filter(s -> s.getPotential().compareTo(BigDecimal.ZERO) == 0)
								.forEach(s -> s.setPotential(data.get(s.getWhId())));
		
	}
	
	private static void checkPlanningAmountCountry(Integer planningAmountCountry, Integer requiredMinPlanning) {
		if(planningAmountCountry <= requiredMinPlanning) {
			System.out.println("STOP");
			System.exit(0);
		}
		else System.out.println("Go on");;
	}
	
//	private static List<BigDecimal> calStoreDemandOfCurrentItem(Map<Item, List<Store>> referenceItem) {
//		
//	}

}