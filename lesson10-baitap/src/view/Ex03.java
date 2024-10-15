package view;

import bean.Item;
import functional.ItemComparator;
import model.DataModel;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItem();
		prinf("Initial items ", items);

		bubbleSort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreID();
			Integer storeId2 = i2.getStoreID();

			Integer salesPrice1 = i1.getSalesPrice();
			Integer salesPrice2 = i2.getSalesPrice();

			if (storeId1 != storeId2) {
				return storeId1.compareTo(storeId2);
			}
			return salesPrice2.compareTo(salesPrice1);

		});
		prinf("Sorting by storeId(asc),salesPrice(decs)", items);
		System.out.println("StoreId 101: ");
		printFirst(items, 101, 1);
		System.out.println("StoreId 102: ");
		printFirst(items, 102, 1);

	}
	public static void printFirst(Item[] items,int storeId,int n) {
		int count =0;
		for(Item item : items) {
			if(item.getStoreID() == storeId) {
				System.out.println(item);
				count ++;
			}
			if(count ==n) {
				break;
			}
		}
	}

	private static void bubbleSort(Item[] items, ItemComparator itemComp) {
		int length = items.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (itemComp.strategy(items[j], items[j + 1]) > 0) {
					Item temp = items[j];
					items[j] = items[j + 1];
					items[j + 1] = temp;
				}
			}
		}
	}

	private static void prinf(String prefix, Item[] items) {
		System.out.println(prefix + " --> {");
		for (Item item : items) {
			System.out.println("  +" + item);
		}
		System.out.println("}\n");
	}
}
