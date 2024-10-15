package sorting.bubble;

import static java.util.Comparator.*;

import java.util.Arrays;

import bean.Item;
import functional.ItemComparator;
import model.DataModel;

public class Ex03BubbleSortItem {
	public static void main(String[] args) {

		Item[] items = DataModel.mockItems();
		printf("Items: ", items);

		// 1. Sort asc by id;
		bubbleSort(items, (item1, item2) -> item1.getId().compareTo(item2.getId()));
	
		printf("Sort (ASC) by id: ", items);
		
		// 2. Sort asc by name:
		bubbleSort(items, (item1, item2) -> item1.getName().compareTo(item2.getName()));
		
		printf("Sort (ASC) by name: ", items);
		
		// 3. Sort desc by salesPrice;
		bubbleSort(items, (item1, item2) -> item2.getSalesPrice().compareTo(item1.getSalesPrice()));
		
		printf("Sort (DESC) by price: ", items);
		
		// 4. Sort desc by storeId, asc by time:
		bubbleSort(items, (item1, item2) -> {
			if(!item1.getStoreId().equals(item2.getStoreId())){
				return item2.getStoreId().compareTo(item1.getStoreId());
			}
			
			return item1.getExpiredDate().compareTo(item2.getExpiredDate());
		}) ;

		printf("Sort by store and time: ", items);

		// 5. Sort storeId(asc), salesPrice (desc), expiredDate(desc):
//		bubbleSort(items, (i1, i2) -> {
//			if (!i1.getStoreId().equals(i2.getStoreId())) {
//				return i1.getStoreId().compareTo(i2.getStoreId());
//			}
//			if (!i1.getSalesPrice().equals(i2.getSalesPrice())) {
//				return i2.getSalesPrice().compareTo(i1.getSalesPrice());
//			}
//			return i2.getExpiredDate().compareTo(i1.getExpiredDate());
//
//		});

		Arrays.sort(items, comparing(Item::getStoreId)
				.thenComparing(Item::getSalesPrice, reverseOrder())
				.thenComparing(Item::getExpiredDate, reverseOrder()));
		
		printf ("Sort: ", items);
	}

	private static void printf(String prefix, Item[] items) {
		System.out.println(prefix + " --> {");
		for (Item item : items) {
			System.out.println("  + " + item);
		}
		System.out.println("}\n");
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
}
