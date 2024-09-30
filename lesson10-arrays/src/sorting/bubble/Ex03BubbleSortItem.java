package sorting.bubble;

import bean.Item;
import functional.ItemComparator;
import model.DataModel;

public class Ex03BubbleSortItem {

	public static void main(String[] args) {
		// int[]
		// String[]
		// Item[]: id, name, salePrice, expiredDate, storeId
		// + so sánh theo thuộc tính cần sắp xếp
		// + hoán vị đối tượng
		Item[] items = DataModel.mockItems();
		
		printf("Initial items", items);
		
		// Bất kỳ KDL đối tượng có sẵn nào của JAVA đều implements Comparable<T>
		// Override sẵn hàm comparaTo(o) --> int
		//					so sánh this và o
		
		// 1. Sắp xếp tăng dần theo id
		// Nếu id của pt trước lớn hơn id của phần tử sau thì --> hoán vị
		bubbleSort(items, (i1, i2) -> {
			return i1.getId().compareTo(i2.getId());
		});
		printf("1. Sorting by id(asc) ", items);
		
		// 2. Sắp xếp tăng dần theo name
		bubbleSort(items, (i1, i2) -> {
			return i1.getName().compareTo(i2.getName());
		});
		printf("2. Sorting by name(asc) ", items);
		
		// 3. Sắp xếp giảm dần theo salesPrice
		bubbleSort(items, (i1, i2) -> {
			return i2.getSalesPrice().compareTo(i1.getSalesPrice());
		});
		printf("3. Sorting by salesPrice(desc) ", items);

		// 4. Sắp xếp giảm dần theo storeId
		bubbleSort(items, (i1, i2) -> {
			return i2.getStoreId().compareTo(i1.getStoreId());
		});
		printf("4. Sorting by storeId(desc) ", items);
		
		// 5. Sắp xếp giảm dần theo storedId, giảm dần theo expiredDate
		bubbleSort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			
			if (storeId1 != storeId2) {
				return storeId2.compareTo(storeId1);
			}
			
			return i1.getExpiredDate().compareTo(i2.getExpiredDate());
		});
		printf("5. Sorting by storeId(desc), expiredDate(desc) ", items);
		
		// 6. Sắp xếp tăng dần theo storeId, 
		// giảm dần theo salePrice
		// giảm theo expiredDate
		
		// So sánh Float , Double dùng comparaTo để tự động compare cùng số chữ thập phân
		
		bubbleSort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			if (storeId1 != storeId2) {
				return storeId1.compareTo(storeId2);
			}
			
			Double salesPrice1 = i1.getSalesPrice();
			Double salesPrice2 = i2.getSalesPrice();
			
			int salesPriceCp = salesPrice2.compareTo(salesPrice1);
			
			if (salesPriceCp != 0) {
				return salesPriceCp;
			}
			
			return i2.getExpiredDate().compareTo(i1.getExpiredDate());
		});
		printf("6. Sorting by storeId(asc), salesPrice(desc), expiredDate(desc) ", items);
		
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
	
	private static void printf(String prefix, Item[] items) {
		System.out.println(prefix + "--> {");
		for (Item item : items) {
			System.out.println("     + " + item);
		}
		System.out.println("}\n");
	}
	
}
