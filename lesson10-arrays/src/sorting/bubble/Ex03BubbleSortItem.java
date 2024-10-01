package sorting.bubble;

import bean.Item;
import functional.ItemComparator;
import model.DataModel;

public class Ex03BubbleSortItem {

	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		printf("Initial items", items);
		// Bat ky KDL doi tuong nao co san cua JAVA deu implements Comparable<T>
		// Override san ham compareTo(o) --> int
		//				    so sanh this va o
		
		// 1. Sap xep tang dan theo id
		
		bubbleSort(items, (i1, i2) -> {
			return i1.getId() - i2.getId();
		});
		printf("1. Sorting by id(asc)", items);
		
		// 2. Sap xep tang dan theo name
		
		bubbleSort(items, (i1, i2) -> {
			return i1.getName().compareTo(i2.getName());
		});
		printf("2. Sorting by name(asc)", items);
		
		// 3. Sap xep giam dan theo salesPrice
		
		bubbleSort(items, (i1, i2) -> {
			return i2.getSalesPrice().compareTo(i1.getSalesPrice());
		});
		printf("3. Sorting by salesPrice(desc)", items);
		
		// 4. Sap xep giam dan theo storeId
		
		bubbleSort(items, (i1, i2) -> {
			return i2.getStoreId().compareTo(i1.getStoreId());
		});
		printf("4. Sorting by storeId(desc)", items);
		
		// 5. Sap xep giam dan theo storeId, tang dan theo expiredDate
		
		bubbleSort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			
			if(storeId1 != storeId2)
				return storeId2.compareTo(storeId1);
			
			return i1.getExpiredDate().compareTo(i2.getExpiredDate());
		});
		printf("5. Sorting by storeId(desc), expiredDate(asc)", items);
		
		// 6. Sap xep tang dan theo storeId, giam dan theo salesPrice, giam dan theo expiredDate
		
		Double s1 = items[0].getSalesPrice();
		Double s2 = items[1].getSalesPrice();
		
		System.out.println("\n\ni1 salesPrice --> " + s1);
		System.out.println("i2 salesPrice --> " + s2);
		
		System.out.println("isEquals --> " + (s1 == s2));
		System.out.println("isEquals --> " + s1.compareTo(s2));
		
		// so sanh
		
		bubbleSort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			Double salesPrice1 = i1.getSalesPrice();
			Double salesPrice2 = i2.getSalesPrice();
			
			if(storeId1 != storeId2)
				return storeId1.compareTo(storeId2);
			
			int salesPriceCp = salesPrice2.compareTo(salesPrice1);
			if(salesPriceCp != 0)
				return salesPriceCp;
			
			return i2.getExpiredDate().compareTo(i1.getExpiredDate());
		});
		printf("6. Sorting by storeId(asc), salesPrice(desc), expiredDate(desc)", items);
	}
	
	private static void printf(String prefix, Item[] items) {
		System.out.println(prefix + " --> {");
		for(Item item: items)
			System.out.println("    + " + item);
		System.out.println("}\n");
	}
	
	private static void bubbleSort(Item[] items, ItemComparator itemComp) {
		int length = items.length;
		for(int i = 0; i < length; i++)
			for(int j = 0; j < length - i - 1; j++)
				if(itemComp.strategy(items[j], items[j + 1]) > 0) {
					Item temp = items[j];
					items[j] = items[j + 1];
					items[j + 1] = temp;
				}
	}
}
