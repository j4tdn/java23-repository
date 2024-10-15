package sorting.quick;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

import java.util.Arrays;

import bean.Item;
import model.DataModel;

public class Ex04SortingItems {
	public static void main(String[] args) {

		Item[] items = DataModel.mockItems();
		printf("Items: ", items);

		// 1. Sort asc by id;
		Arrays.sort(items, (item1, item2) -> item1.getId().compareTo(item2.getId()));
	
		printf("Sort (ASC) by id: ", items);
		
		// 2. Sort asc by name:
		Arrays.sort(items, (item1, item2) -> item1.getName().compareTo(item2.getName()));
		
		printf("Sort (ASC) by name: ", items);
		
		// 3. Sort desc by salesPrice;
		Arrays.sort(items, (item1, item2) -> item2.getSalesPrice().compareTo(item1.getSalesPrice()));
		
		printf("Sort (DESC) by price: ", items);
		
		// 4. Sort desc by storeId, asc by time:
		Arrays.sort(items, (item1, item2) -> {
			if(!item1.getStoreId().equals(item2.getStoreId())){
				return item2.getStoreId().compareTo(item1.getStoreId());
			}
			
			return item1.getExpiredDate().compareTo(item2.getExpiredDate());
		}) ;

		printf("Sort by store and time: ", items);

		// 5. Sort storeId(asc), salesPrice (desc), expiredDate(desc):
//		Arrays.sort(items, (i1, i2) -> {
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


}
