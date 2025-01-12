package view;

import static model.DataModel.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;

public class WhAllocationDemo {
	
	public static void main(String[] args) {
		// use data from DataModel
				
		Item itemA1 = new Item(1, "A1");
		
		// Item A1 - ref A55
		// Item A1 - ref A77
		Map<Item, List<Map<Item, List<Store>>>> itemMapping = new HashMap<>();
		
		itemMapping.put(itemA1, new ArrayList<>(List.of(mockStoresOfRefItemA55()
														, mockStoresOfRefItemA77())));
		
		if (planningAmount <= requiredMinPlanningAmount) {
			System.out.println("error");
			return;
		}
		// do calculation
		itemMapping.forEach((item, refItems) -> {
			System.out.println("Item : " + item.getName());
			calculationGap(refItems);
			calculateStoreDemand(refItems);
		});
		
		
		
		
		// print result step by step
		//List<Map<Item, List<Store>>> referenceItems = itemMapping.stream().flatMap(List::stream)
//		.collect(Collectors.toList());

	}
	// Thực hiện tính toán lên List reference items của từng Item
	private static void calculationGap(List<Map<Item, List<Store>>> referenceItems) {
		
		referenceItems.forEach(refItem -> {
			try {
				fillingGaps(refItem, mockRefStores());
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		referenceItems.forEach(refItem -> {
			generate("Filling gaps", refItem);
		});
		
	}

	private static void fillingGaps(Map<Item, List<Store>> storesOfRefItem, Map<Integer, Integer> refStoresMapping) throws Exception {
		// nếu store k có ptt nhưng có ref store có ptt -> lấy ptt của ref store
	
		// nếu store k có ptt và có rfstore, nhưng rfstore k có ptt
		// hoặc store k có ptt và k có rf store, lấy ptt trugn bình 
		
		// tính tổng ptt của các cửa hàng có ptt
		List<Store> allStores = storesOfRefItem.values().stream()
											.flatMap(List::stream)
											.collect(Collectors.toList());

		BigDecimal sum = allStores.stream()
								.filter(s -> (s.getPotential().compareTo(BigDecimal.ZERO) != 0))
								.filter(s -> s.getPotential() != null)
								.map(s -> s.getPotential())
								.reduce(BigDecimal.ZERO, BigDecimal::add);
		long count = allStores.stream()
							.filter(s -> s.getPotential().compareTo(BigDecimal.ZERO) != 0)
							.filter(s -> s.getPotential() != null)
							.count();
		// tính trung bình
		BigDecimal averagePotentials = count > 0 ? sum.divide(BigDecimal.valueOf(count), 1, BigDecimal.ROUND_HALF_UP) : null;
		
		for (Store store : allStores) {
			if ((store.getPotential().compareTo(BigDecimal.ZERO) == 0 )|| store.getPotential() == null) {
				// nếu potential = 0 ||| null -> sử dụng refStore ptt nếu có
				if (refStoresMapping.containsKey(store.getId())) {
					Store refStore = allStores.stream()
												.filter(s -> s.getId() == refStoresMapping.get(store.getId()) 
																&& s.getPotential() != null
																&& s.getPotential().compareTo(BigDecimal.ZERO) != 0)
												.findFirst()
												.orElse(null);
					if (refStore != null) {
						store.setPotential(refStore.getPotential());
					}
				}
				// nếu không có refStore, hoặc refstore có potential là 0 || null
				// ptt = average của own store
				if (averagePotentials != null) {
					store.setPotential(averagePotentials);
				} else throw new Exception("no potention found");
			}
		}
	}
	
	private static void calculateStoreDemand(List<Map<Item, List<Store>>> referenceItems) {

		var refWeight = mockRefWeights();
		// ở đây, refItems là A55 và A77 
		List<Store> allStores =  referenceItems.get(0).values()
				.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		
		Map<Store, BigDecimal> demand = new LinkedHashMap<>();
		
		for (Store store : allStores) {
			for (Map<Item, List<Store>> refItem : referenceItems) {
				BigDecimal potential = refItem.values().stream()
												.flatMap(List::stream)
												.filter(refStore -> refStore.getId() == store.getId())
												.map(rs -> rs.getPotential())
												.findFirst()
												.orElse(null);
				
			}
			
		}
		
		// phải duyệt từng store, -> sau đó mới duyệt qua từng refItem
		
		
		

		referenceItems.forEach(refItem -> {
			generate("Filling gaps", refItem);
		});
		
	}
	

	
	private static void generate(String prefix, Map<Item, List<Store>> maps) {
		System.out.println(prefix + "{");
		maps.forEach((item, stores) -> {
			System.out.println("Item: " + item);
			System.out.println("Store: " );
			stores.forEach(store -> System.out.println(" - " + store));
		});
		System.out.println("}\n");
	}
	
}


