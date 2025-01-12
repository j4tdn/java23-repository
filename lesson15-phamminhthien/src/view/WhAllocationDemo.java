package view;

import static model.DataModel.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import bean.Item;
import bean.Store;
import model.DataModel;
import utils.NumberUtils.*;
import utils.CollectionUtils.*;

public class WhAllocationDemo {
	
	private static List<Store> stores = convert(mockStoresOfRefItemA77());
	public static void main(String[] args) {
		// use data from DataModel
		
		// do calculation
		
		// print result step by step
		Map<Item, List<Store>> storeA77 = mockStoresOfRefItemA77();
		Map<Item, List<Store>> storeA55 = mockStoresOfRefItemA55();
//		var refItem55 = convert(storeA55);
		var refItem77 = convert(storeA77);
		
//		Step 1:
		if(!checkPlanningAmount(80, 50))
			System.out.println("continute with step 2");
		else
			System.out.println("Số tiền tối thiểu ko đc > số tiền lập kế hoạch");
		
//		Step 2:
		fillingGaps(refItem77);
		System.out.println("Step 2:	Filling gaps by references or average");
		System.out.println(storeA77);
		
//		Step 3:
		
		
//		Step 4:
		
		
//		Step 5:
		
		
		
//		Step 6:
		
//		Step 7:
		
		
//		Step 8:
		
		
//		Step 9:
		
		
//		Step 10:
		
//		Step 11:
	}
	
	private static boolean checkPlanningAmount(Integer planningAmount, Integer minPlanningAmount) {
		if(planningAmount < minPlanningAmount)
			return false;
		return true;
	}
	
	
	public static List<Store> convert(Map<Item, List<Store>> itemStoreMap) {
		List<Store> allStores = new ArrayList<Store>();
		for (List<Store> stores: itemStoreMap.values()) {
			allStores.addAll(stores);
		}
		return allStores;
	}
	
		public static BigDecimal caculatorAverage() {
			BigDecimal totalPotential = stores.stream()
										.filter(stores -> stores.getPotential().compareTo(BigDecimal.ZERO) > 0)
										.map(Store::getPotential)
										.reduce(BigDecimal.ZERO, BigDecimal::add);
			long count = stores.stream()
					.filter(store -> store.getPotential().compareTo(BigDecimal.ZERO) > 0)
					.count();
			if(count == 0)
				return BigDecimal.ZERO;
		
			return totalPotential.divide(BigDecimal.valueOf(count), 1, RoundingMode.HALF_UP);
			
		}
	
	private static void fillingGaps(List<Store> stores) {
		for(Store store:stores) {
			if(store.getPotential().compareTo(BigDecimal.ZERO) == 0 || store.getPotential() == null) {
				Integer refStoreId = mockRefStores().get(store.getId());
				if(refStoreId != null) {
					BigDecimal refStorePotential = stores
							.stream()
							.filter(s -> s.getId().equals(refStoreId))
							.map(Store::getPotential)
							.findFirst()
							.orElse(BigDecimal.ZERO);
					refStorePotential = refStorePotential.setScale(1, RoundingMode.HALF_UP);
					store.setPotential(refStorePotential);
				}
			}
			else
				store.setPotential(caculatorAverage());
		}
	}
	
	private static List<Store> stores() {
		var ListStoreA55 = convert(mockStoresOfRefItemA55());
		var ListStoreA77 = convert(mockStoresOfRefItemA77());
		
		List<Store> result = new ArrayList<>();
		for(int i=0; i<ListStoreA55.size(); i++) {
			BigDecimal storePotential55 = ListStoreA55.get(i).getPotential();
			BigDecimal storePotential77 = ListStoreA77.get(i).getPotential();
			
		}
	}
	

}