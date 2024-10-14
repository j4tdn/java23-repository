package sorting.bubble;

import bean.Item;
import functional.ItemComparator;
import model.DataModel;

public class Ex03BubbleSortItem {

	// ctrl shift O: import hết
	public static void main(String[] args) {
		
		// Item: id, name, salesPrice, expiriedDate, storeId
		// + So sánh theo thuộc tính cần sắp xếp
		// + hoán vị đối tượng
		Item[] items = DataModel.mockItems();
		
		printf("Initial items", items);
		
		// Bất kỳ đối tượng có sẵn nào của Java đều implements Comparable<T>
		// override sẵn hàm compareto(o) --> int
		//					so sánh this và o 
		
		// 1. sắp xếp tăng dần theo id
		bubbleSort(items, (i1, i2) -> {
			return i1.getId() - i2.getId();
		});
		
		printf("1. Sorting by id(asc)", items);
		
		// 2. sắp xếp tăng dần theo name
		bubbleSort(items, (i1, i2) -> {
			return i1.getName().compareTo(i2.getName());
		});
		
		printf("2. Sorting by name(asc)", items);
		
		// 3. sắp xếp giảm dần theo salesPrice
		bubbleSort(items, (i1, i2) -> {
			return i2.getSalesPrice().compareTo(i1.getSalesPrice());
		});
		
		printf("3. Sorting by salesPrice(desc)", items);
		
		// 4. Sắp xếp giảm dần theo storeId
		bubbleSort(items, (i1, i2) -> {
			return i2.getId() - i1.getId();
		});
			
		printf("4. Sorting by storeId(desc)", items);
		
		// 5. Sắp xếp giảm dần theo storeId, tăng dần theo expriedDate
		bubbleSort(items, (i1, i2) -> {
			Integer storedId1 = i1.getStoreId();
			Integer storedId2 = i2.getStoreId();
			
			if (storedId1 != storedId2) {
				return storedId2.compareTo(storedId1);
			}
				return i1.getExpiredDate().compareTo(i2.getExpiredDate());
		});
		
		printf("5. Sorting by storeId(asc), expiriedDate(asc) ", items);
		
		// 6. Sắp xếp tăng dần theo storedId, giảm dần theo salesPrice, giảm dần expriredDate
		bubbleSort(items, (i1, i2) -> {
			Integer storedId1 = i1.getStoreId();
			Integer storedId2 = i2.getStoreId();

			if (storedId1 != storedId2) {
				return storedId1.compareTo(storedId2);
			}

			Double salesPrice1 = i1.getSalesPrice();
			Double salesPrice2 = i2.getSalesPrice();
			int salesPriceCp = salesPrice2.compareTo(salesPrice1);

			if (salesPriceCp != 0) {
				return i2.getSalesPrice().compareTo(i1.getSalesPrice());
			}
			return i2.getExpiredDate().compareTo(i1.getExpiredDate());
		});
		
		printf("6. Sorting by storeId(desc), salesPrice(asc), expiriedDate(asc) ", items);
		
		// NOTE: so sánh Float, Double dùng compareTo để tự động compare cùng số, chữ số
	}
	
	private static void bubbleSort(Item[] items, ItemComparator itemComp) {
		int length = items.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (itemComp.strategy(items[j], items[j+1]) > 0) {
					Item temp = items[j];
					items[j] = items[j+1];
					items[j+1] = temp;
				}
			}
		}
	}
	
	private static void printf(String prefix, Item[] items) {
		System.out.println(prefix + " --> {");
		for (Item item: items) {
			System.out.println("    + " + item);
		}
		System.out.println("}\n");
	}
	
}
