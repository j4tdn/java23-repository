package sorting.buble;

import bean.Item;
import functional.ItemComparator;
import model.DataModel;

public class Ex03BubbleSortItem {

	public static void main(String[] args) {
		// int[]
		// String[]
		// Item[]: id, name, salesPrice, expiredDate, storeId
		// + so sánh theo thuộc tính cần sắp xếp
		// + hoán vị đối tượng
		Item[] items = DataModel.mockItems();

		printf("Initial items", items);
		
		// Bất kỳ KDL đối tượng có sẵn nào của JAVA đều implements Comparable<T>
		// Override sẵn hàm compareTo(o) --> int
		//					so sánh this và o

		// 1. Sắp xếp tăng dần theo id
			// Nếu id của phần tử trc lớn hơn id của phần tử sau thì --> hoán vị (return 1)
		bubbleSort(items, (i1, i2) -> {
			// Cách 1:
//			if (i1.getId()>i2.getId()) {
//				return 1;
//			}
//			return -1
			
			// Cách 2:
//			return i1.getId() - i2.getId();
			
			// Cách 3: dùng compareTo
			return i1.getId().compareTo(i2.getId());
		});
		printf("1. Sorting by id(asc)", items);
		
		// 2. Sắp xếp tăng dần theo name
		bubbleSort(items, (i1, i2) -> {
			return i1.getName().compareTo(i2.getName()); //nếu compare i1 > i2 thì số +, ngc lại số -
		});
		printf("2. Sorting by name(asc)", items);
		
		// 3. Sắp xếp giảm dần theo salesPrice
		bubbleSort(items, (i1, i2) -> {
			// Cách 1: Dùng if
//			if (i2.getSalesPrice() > i1.getSalesPrice()) {
//				return 1;
//			}
//			return -1;
			
			// Cách 2: dùng compareTo
			return i2.getSalesPrice().compareTo(i1.getSalesPrice());
		});
		printf("3. Sorting by SalesPrice(desc)", items);
		
		// 4. Sắp xếp giảm dần theo storeID
		bubbleSort(items, (i1, i2) -> {
			return i2.getStoreId().compareTo(i1.getStoreId());
		});
		printf("4. Sorting by StoreId(desc)", items);
		
		// 5. Sắp xếp giảm dần theo storeID, tăng dần theo expiredDate
		bubbleSort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			
			if (storeId1 != storeId2) {
				return storeId2.compareTo(storeId1);
			}
			
			return i1.getExpiredDate().compareTo(i2.getExpiredDate());
		});
		printf("5. Sorting by StoreId(desc), expiredDate(asc)", items);
		
		
		
		
		// 6. Sắp xếp tăng dần theo storeID, giảm dần theo salesPrice, giảm theo expiredDate
		
		Double s1 = items[0].getSalesPrice();
		Double s2 = items[0].getSalesPrice();
		
		System.out.println("\n\ni1 salesPrice --> " + s1);
		System.out.println("i2 salesPrice --> " + s2);
		
		System.out.println("isEquals --> " + (s1 == s2));
		System.out.println("isEquals --> " + (s1.compareTo(s2)));
		
		// so sánh float, double dùng compareTo để tự động coppare cùng chữ số thập phân
		
		bubbleSort(items, (i1, i2) -> {
			// Sắp xếp tăng dần theo storeID
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			if (storeId1 != storeId2) {
				return storeId1.compareTo(storeId2);
			}
			
			// Sx giảm dần theo salesPrice (nếu storeID bằng nhau)
			Double salesPrice1 = i1.getSalesPrice();
			Double salesPrice2 = i2.getSalesPrice();
			int salesPriceCp = salesPrice2.compareTo(salesPrice1);			
			if (salesPriceCp != 0) {
				return salesPriceCp;
			}
			
			// Sx giảm theo expiredDate (nếu salesPrice bằng nhau)
			return i2.getExpiredDate().compareTo(i1.getExpiredDate());
		});
		printf("\n6. Sorting by StoreId(asc), expiredDate(desc), salesPrice(desc)", items);
		
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

	private static void printf(String prefix, Item[] items) {
		System.out.println(prefix + " --> {");
		for (Item item : items) {
			System.out.println("    + " + item);
		}
		System.out.println("}\n");
	}

}
