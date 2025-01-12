package view;

import static model.DataModel.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import model.DataModel;
import utils.NumberUtils;

public class WhAllocationDemo {
	
	public static void main(String[] args) {
		Integer planningAmountCountry = DataModel.planningAmount;
		Integer minPerStore = DataModel.minPerStore;
		Integer requiredMinPlanningAmount = DataModel.requiredMinPlanningAmount;
		
		Map<Item, List<Store>> refItemA55 = DataModel.mockStoresOfRefItemA55();
		Map<Item, List<Store>> refItemA77 = DataModel.mockStoresOfRefItemA77();
		Map<Integer, Integer> refStores = DataModel.mockRefStores();
		Map<Integer, BigDecimal> refWeights = DataModel.mockRefWeights();
		Map<Integer, BigDecimal> trenFactors = DataModel.mockStoreTrendFactors();
	
		System.out.println("Step1: ");
		checkPlanningAmount(planningAmountCountry, requiredMinPlanningAmount);
		
		System.out.println("Step2: ");
	}
	
	public static void checkPlanningAmount(Integer planningAmountCountry, Integer requiredMinPlanningAmount) {
		if(planningAmountCountry <= requiredMinPlanningAmount) {
			System.out.println("Stop calculation");
			System.exit(0);
		}else
			System.out.println("Continue with Step 2");
	}
	
	public static Map<Store, BigDecimal> fillingForRefItem(Map<Item, List<Store>> refItem, Map<Integer, Integer> refStores){
		Map<Store, BigDecimal> res = new HashMap<>();
		
	}

	public static BigDecimal calAvgPotential(Map<Item, List<Store>> refItem) {
		List<Store> stores = refItem.values()
									.stream()
									.flatMap(List::stream)
									.filter(store -> store.getPotential() != null && store.getPotential().compareTo(BigDecimal.ZERO) > 0)
									.collect(Collectors.toList());
		double sum = stores.stream()
						   .mapToDouble(store -> store.getPotential().doubleValue())
						   .sum();
		int count = stores.size();
		return BigDecimal.valueOf(sum / count).setScale(1, RoundingMode.HALF_UP);
	}
	
	public static Store findStoreById(Map<Item, List<Store>> refItem, Integer storeId) {
		for(List<Store> stores : refItem.values()) {
			for(Store store : stores) {
				if(store.getId().equals(storeId)) {
					return store;
				}
			}
		}
		return null;
	}
}

