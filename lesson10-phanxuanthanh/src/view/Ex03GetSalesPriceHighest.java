package view;

import Functional.ItemComparator;
import bean.Item;

public class Ex03GetSalesPriceHighest {

	public static void main(String[] args) {
		Item[] items = mockData();
		
		bubbleSort(items, (s1, s2) -> {
			Integer storeId1 = s1.getStoreId();
			Integer storeId2 = s2.getStoreId();
			Integer salesPrice1 = s1.getSalesPrice();
			Integer salesPrice2 = s2.getSalesPrice();
			
			if (storeId1 != storeId2) {
				return storeId1.compareTo(storeId2);
			}
			return salesPrice2.compareTo(salesPrice1);
			
		});
		
		printf("mặt hàng có giá bán cao nhất mỗi cửa hàng", items);
	}
	
	private static void bubbleSort(Item[] items, ItemComparator itemComp) {
		int length = items.length;
		for (int i = 0; i < length ; i++) {
			for (int j = 0 ; j < length - i - 1; j++) {
				if (itemComp.strategy(items[j], items[j+1]) > 0) {
					Item temp = items[j];
					items[j] = items[j+1];
					items[j+1] = temp;
				}
			}
		}
	}
	
	public static Item[] mockData() {
		return new Item[] {
			new Item(1, "A", 25, 101),
			new Item(2, "B", 90, 102),
			new Item(3, "C", 88, 102),
			new Item(4, "D", 40, 101),
			new Item(5, "E", 60, 102),
			new Item(6, "F", 18, 101),
		};
	}
	
	private static void printf(String prefix, Item[] items) {
		System.out.println(prefix + "--> {");
		for (Item item : items) {
			System.out.println("     + " + item);
		}
		System.out.println("}\n");
	}
}
