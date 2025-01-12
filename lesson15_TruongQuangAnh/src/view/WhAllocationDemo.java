package view;

import static model.DataModel.*;

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
		/*
		 * nemu  =========
		 */
		System.out.println("step  ----1----");
		if(checkPlanamount()) {
			System.out.println("stop");
		}else {
			System.out.println("continu");
		}
		System.out.println("step -----2----");
		filing(mockStoresOfRefItemA55());
		
		
	}
	public static boolean checkPlanamount() {
		return DataModel.planningAmount < DataModel.requiredMinPlanningAmount;
	}
	public static void filing(Map<Item, List<Store>> mockStores) {
		Map<Integer, Integer> Rmap = mockRefStores();
		List<Store> ams = new ArrayList<>();
		Item temitem = mockStores.keySet().iterator().next();
		System.out.println("kq sau  "+ temitem);
		for(Store store : mockStores.get(temitem)) {
			System.out.println("store :"+store.getId() + " ---> " +store.getPotential());
		}
		Map<Integer, Store> Rmap2 = new HashMap<Integer, Store>();
		for(Map.Entry<Integer, Integer> entry :Rmap.entrySet()) {
			for(Store store : mockStores.get(temitem)) {
				if(store.getId().equals(entry.getValue())) {
					Rmap2.put(entry.getKey(), store);
					System.out.println("============");
					break;
				}
			}	
		}
		for(Store store : mockStores.get(temitem)){
			if(store.getPotential() == null || store.getPotential().compareTo(BigDecimal.ZERO)==0) {
				ams.add(store);
				Integer storeid = store.getId();
				store.setPotential(Rmap2.get(storeid).getPotential());
			
			}else {
				store.setPotential((store.getPotential().setScale(1, RoundingMode.HALF_EVEN));
			}

		}
		for(Store mstore : mockStores.get(temitem)){
			System.out.println("store :"+mstore.getId() + " ---> " +mstore.getPotential());
			
		}
	
	}

}
