package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import model.DataModel;
import utils.NumberUtils;

public class WhAllocationDemo {
	
	public static void main(String[] args) {

		// Step1:
		System.out.println("Step 1");
		if(!step1(88,50)) {
			System.out.println("Can not calculate");
			System.exit(0);
		}
		System.out.println("Can continue");
		
		// Step2:
		System.out.println("\nStep 2");
		Map<Item, List<Store>> itemA77 = DataModel.mockStoresOfRefItemA77();
		Map<Integer, Integer> refStores = DataModel.mockRefStores();
		
		getListStoresFromRefItem(itemA77, refStores);
		
		// Step3:
		System.out.println("Step 3");
		List<Store> storesA77 = DataModel.mockStoresOfRefItemA77().get(new Item(77, "Item A77"));
		Map<Item, List<Store>> storePotentialA55 = DataModel.mockStoresOfRefItemA55();
		Map<Integer, BigDecimal> refWeights = DataModel.mockRefWeights();
		
		calculateStoreDemand(storePotentialA55.get(new Item(55, "Item A55")), storesA77 , refWeights);
		
	}
	
	public static boolean step1(Integer planningAmount, Integer requiredMinPlanningAmount) {
		if (planningAmount > requiredMinPlanningAmount)
			return true;
		return false;
	}
	
	private static List<Store> getListStoresFromRefItem(Map<Item, List<Store>> mockStores, Map<Integer, Integer> mockRefStores){
		var set = mockStores.entrySet();
		List<Store> listStores = null;
		for (var entry : set) {
			listStores = entry.getValue();
		}
		
		List<Store> list0 = listStores.stream()
									  .filter(s -> s.getPotential().equals(NumberUtils.bd(0)))
									  .collect(Collectors.toList());
		
		for (int i = 0; i < list0.size(); i++) {
			for (var entry : mockRefStores.entrySet()) {
				if (list0.get(i).getId() == entry.getKey()) {
					list0.get(i)
						 .setPotential(listStores.stream()
								 				  .filter(s -> s.getId() == entry.getValue())
								 				  .collect(Collectors.toList())
								 				  .get(0)
								 				  .getPotential());
				}else if (list0.get(i).getId() == entry.getValue()) {
					list0.get(i)
					 .setPotential(listStores.stream()
							 				  .filter(s -> s.getId() == entry.getValue())
							 				  .collect(Collectors.toList())
							 				  .get(0)
							 				  .getPotential());
				}
			}
		}
		
		BigDecimal avg = listStores.stream()
								   .filter(s -> !s.getPotential().equals(NumberUtils.bd(0)))
								   .map(s -> s.getPotential())
								   .reduce(NumberUtils.bd(0), (a,b) -> a.add(b));
		
		System.out.println(avg.toString());
		System.out.println(list0 + "\n\n");
		
		return listStores;
	}
	
	
	private static void calculateStoreDemand(List<Store> storesA55, List<Store> storesA77, Map<Integer, BigDecimal> refWeights) {
		for (int i = 0; i< storesA55.size(); i++) {
			Store storeA55 = storesA55.get(i);
			Store storeA77 = storesA55.get(i);
			
			BigDecimal potentialA55 = storeA55.getPotential();
			BigDecimal potentialA77 = storeA55.getPotential();
			BigDecimal weightA55 = refWeights.getOrDefault(55, BigDecimal.ONE);
			BigDecimal weightA77 = refWeights.getOrDefault(77, BigDecimal.ONE);
			BigDecimal storeTrend = storeA77.getStoreTrend() != null ? storeA77.getStoreTrend() : BigDecimal.ONE;
			
			BigDecimal demand = (potentialA55.multiply(weightA55).add(potentialA77).multiply(weightA77))
							.divide(weightA55.add(weightA77), RoundingMode.HALF_UP).multiply(storeTrend);
			
			storeA77.setPotential(demand);
			System.out.println("Store " + storeA77.getId() + " Demand: " + demand);
		}
	}
	
}