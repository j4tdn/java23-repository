package view;

import java.awt.Stroke;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



import bean.Item;
import bean.Store;
import model.DataModel;

public class WhAllocationDemo {
	
	public static BigDecimal bd(double val) {
		return new BigDecimal(String.valueOf(val));
	}
	
	public static void main(String[] args) {
		// use data from DataModel
		
		// do calculation
		
		// print result step by step
		Map<Item, List<Store>> itemA55 = DataModel.mockStoresOfRefItemA55();
		Map<Item, List<Store>> itemA77 =DataModel.mockStoresOfRefItemA77();

		Map<Integer, Integer> refStore = DataModel.mockRefStores();
		Map<Integer, BigDecimal> trendStores = DataModel.mockStoreTrendFactors();
		Map<Integer, BigDecimal> weightItems = DataModel.mockRefWeights();
		
		
		//step1
		System.out.println("step 1");
		if(!step1(88,50)) {
			System.out.println("stop calcution");
			System.exit(0);
		}
		System.out.println("Continue");
		//step 2
		System.out.println("step2");
		Map<Store, BigDecimal> mapStep2A55 = step2(itemA55, refStore);
		Map<Store, BigDecimal> mapStep2A77 = step2(itemA77, refStore);
		
		mapStep2A77.entrySet().forEach(entry -> System.out.println(entry));
		
		System.out.println("step3");
		var mapDemand = step3(trendStores,weightItems ,mapStep2A55,mapStep2A77);
		mapDemand.entrySet().forEach(entry -> System.out.println(entry));
		
		System.out.println("step 4");
		
		
		
	}
	//1
	private static boolean step1(Integer planningAmount, Integer requiredMinPlanningAmount) {
		if (planningAmount > requiredMinPlanningAmount)
			return true;
		return false;
	}
	//2 
	private static  Map<Store, BigDecimal> step2 (Map<Item, List<Store>> item,Map<Integer, Integer> refStores){
		Map<Store, BigDecimal> mapStorePotential = new LinkedHashMap<Store, BigDecimal>();	
		for(var entry :item.entrySet()) {
			long  count = entry.getValue()
							 .stream()
							 .filter(subStore -> subStore.getPotential().compareTo(BigDecimal.ZERO) !=0).map(storeMap -> storeMap.getPotential()).count();
			var avaragePotentialValue = entry.getValue().stream()
					 .filter(subStore -> subStore.getPotential().compareTo(BigDecimal.ZERO) !=0)
					 .map(storeMap -> storeMap.getPotential())
					 .reduce(bd(0),(a,b) -> a.add(b));
			
			avaragePotentialValue = avaragePotentialValue.divide(bd(count),1,RoundingMode.HALF_UP);
			if(store.getPotential().compareTo(BigDecimal.ZERO) !=0) {
				mapStorePotential.put(store, store.getPotential().setScale(1,RoundingMode.HALF_UP));
			}else {
				for(var subEntry : refStores.entrySet()) {
					if(store.getId().equals(subEntry.getKey())){ // 10,1
						//
						var listStore = entry.getValue().stream().filter(tempStore ->tempStore.getId().equals(subEntry.getValue()) && tempStore.getPotential().compareTo(BigDecimal.ZERO) !=0)
						if(listStore.get(0).getPotential().compareTo(BigDecimal.ZERO)!=0) {
							mapStorePotential.put(store, listStore.get(0).getPotential().setScale(1,RoundingMode.HALF_UP));
						}else {
							mapStorePotential.put(store, avaragePotentialValue);
						}
								
					}else {
						mapStorePotential.put(store, avaragePotentialValue);
					}
				}
			}
		}
		return mapStorePotential;
	}
	//3
	private static Map<Store,BigDecimal>step3(Map<Integer, BigDecimal>
												trendStores ,
												Map<Integer,BigDecimal> weightItems,
												Map<Store, BigDecimal> mapStep2A55,Map<Store, BigDecimal> mapStep2A77){
		Map<Store, BigDecimal> mapStorePotential = new LinkedHashMap<>();
		List<Integer> itemId = weightItems.entrySet().stream().map(entry -> entry.getKey()).collect(Collectors.toList());
		
		List<BigDecimal> storeTrendList = trendStores.entrySet().stream().map(e ->bd(e.getKey())).collect(Collectors.toList());
		BigDecimal totalWeight= weightItems.entrySet()
				.stream().map(entry -> entry
						.getValue()).
				reduce(bd(0), (a,b)->a.add(b));
		
		for(var entry : mapStep2A55.entrySet()) {
			boolean isContain = storeTrendList.contains(entry.getKey().getId());
			BigDecimal temp = null;
			if(isContain) {
				temp = trendStores.get(entry.getKey().getId());
				
			}else {
				temp = bd(1);
			}
			BigDecimal refA55 =mapStep2A55.entrySet().stream().filter(en ->en.getKey().equals(entry.getKey()))
					.map(store -> store.getValue()).reduce(bd(0), (a,b)-> a.add(b));
			
			BigDecimal refA77 =mapStep2A77.entrySet().stream().filter(en ->en.getKey().equals(entry.getKey()))
					.map(store -> store.getValue()).reduce(bd(0), (a,b)-> a.add(b));
			
			BigDecimal trendVal = trendStores.get(entry.getKey().getId());
			if(trendVal == null ) {
				trendVal = bd(1);
			}
			BigDecimal demand = bd((refA55.doubleValue()*weightItems.get(itemId.get(0)).doubleValue()
					+refA77.doubleValue() * weightItems.get(itemId.get(1)).doubleValue())
					/ (totalWeight.doubleValue()*trendVal.doubleValue())).setScale(1,RoundingMode.HALF_UP);
			
			mapStorePotential.put(entry.getKey(), demand);
			
		}
		return mapStorePotential;
	}

	private static Map<Integer, BigDecimal> demandWh(List<Store> stores) {
	    var totalPotentialByWhId = new HashMap<Integer, BigDecimal>();
	    for (Store store : stores) {
	        Integer whId = store.getWhId(); 
	        BigDecimal storePotential = store.getPotential(); 
	        BigDecimal currentTotal = totalPotentialByWhId.getOrDefault(whId, BigDecimal.ZERO);
	        BigDecimal newTotal = currentTotal.add(storePotential); 
	        totalPotentialByWhId.put(whId, newTotal); 
	    }
	    return totalPotentialByWhId; 
	}

	private static Map<Integer, BigDecimal> caculatorShares(Map<Integer, BigDecimal> demandWh) {
		Map<Integer, BigDecimal> sharestagesByWhId = new HashMap<>();
		BigDecimal totalSum = BigDecimal.ZERO;
		for (BigDecimal value : demandWh.values()) {
			totalSum = totalSum.add(value);
		}
		for (var entry : demandWh.entrySet()) {
			Integer whId = entry.getKey();
			BigDecimal value = entry.getValue();
			BigDecimal percentage = value.multiply(new BigDecimal("100")).divide(totalSum, 4, RoundingMode.HALF_UP);
			sharestagesByWhId.put(whId, percentage);
		}
		return sharestagesByWhId;
	}
	private static Map<Integer, BigDecimal> allowcatedShares(Map<Integer, BigDecimal>demandWh){
		Map<Integer, BigDecimal> allowcatedShares = new HashMap<>();
		for(var entry :  demandWh.entrySet()) {
			Integer key = entry.getKey();
			BigDecimal value = entry.getValue();
																//planningAmount loix
//			BigDecimal newValue = value.multiply(new BigDecimal()).divide(new BigDecimal(100));
//			allowcatedShares.put(key, newValue);
		}
		return allowcatedShares;
	}
//	public static Map<Integer, BigDecimal> applyMinimum(Map<Integer, BigDecimal> ){
//		
//	}
	
}
