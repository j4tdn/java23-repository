package view;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import static model.DataModel.*;

public class WhAllocationDemo {
	
	public static void main(String[] args) {
		// use data from DataModel
		Map<Integer,Integer> refStore = mockRefStores();
		Map<Item,List<Store>> storeA55Data =  mockStoresOfRefItemA55();
		Map<Item,List<Store>> storeA77Data =mockStoresOfRefItemA77();
		// do calculation
		// print result step by step
		System.out.println("STEP 1 ");
		if(planningAmount <= requiredMinPlanningAmount) {
			return ;
		}else {
			System.out.println("STEP 2 : Filling gaps by references or average ");
			List<Store> storeA77 = storeA77Data.values().stream().flatMap(List::stream).collect(Collectors.toList());
			filling(storeA77, refStore);
			storeA77.forEach(System.out::println);
			// Step 3:Calculate Store Demand of current Item(Item A1)
						Map<Integer, BigDecimal> storeTrends = mockStoreTrendFactors();
						Map<Item, List<Store>> storeProtentialA55 = mockStoresOfRefItemA55();
						Map<Item, List<Store>> storeProtentialA77 =mockStoresOfRefItemA77();
						Map<Integer, BigDecimal> refWeight =mockRefWeights();
						calculate(storeProtentialA55.get(new Item(55, "Item 55")),
								storeProtentialA77.get(new Item(77, "Item 77")), refWeight, storeTrends);
		}
	}
	private static void filling(List<Store> Stores, Map<Integer,Integer> refstore){
		// tinh TB
		Double aver = Stores.stream().filter(st -> st.getPotential().compareTo(BigDecimal.ZERO) > 0).
								mapToDouble(st -> st.getPotential().doubleValue()).average().orElse(0);
		for(Store store : Stores) {
			if(store.getPotential().compareTo(BigDecimal.ZERO) == 0) {
				Integer reStoreId = refstore.get(store.getId());
				if(reStoreId != null) {
					Store refStore = Stores.stream().filter(s -> s.getId().equals(reStoreId)).findFirst().orElse(null);
					if(refStore != null && refStore.getPotential().compareTo(BigDecimal.ZERO) > 0) {
						store.setPotential(refStore.getPotential());
					}else {
						store.setPotential(BigDecimal.valueOf(aver));
					}
				}else {
					store.setPotential(BigDecimal.valueOf(aver));
				}
						
			}
		}
	}
	private static void calculate(List<Store> storesA55, List<Store> storesA77, Map<Integer,BigDecimal> refWeight,Map<Integer, BigDecimal> trends) {
		for(int i = 0; i < storesA55.size(); i++ ) {
			
			Store storeA55 = storesA55.get(i);
			Store storeA77 = storesA77.get(i);
			
			BigDecimal potentialA55 = storeA55.getPotential();
			BigDecimal potentialA77 = storeA77.getPotential();
			BigDecimal refWeightA55 = refWeight.getOrDefault(55, BigDecimal.ONE);
			BigDecimal refWeightA77 = refWeight.getOrDefault(77, BigDecimal.ONE);
			
			BigDecimal storeTrend = trends.getOrDefault(storesA77.get(i).getId(), BigDecimal.ONE);
			
			BigDecimal demand = (potentialA55.multiply(refWeightA55).add(potentialA77).
					multiply(refWeightA77)).divide(refWeightA55.add(refWeightA77)).
					multiply(storeTrend);
		
			storeA77.setPotential(demand);
			System.out.println("Store" + storeA77.getId() + "Demand: " + demand );
		}
		
		
	}
	
	
	
}