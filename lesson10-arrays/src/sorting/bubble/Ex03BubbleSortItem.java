package sorting.bubble;

import java.util.Arrays;

import bean.Item;
import functional.ItemComparator;
import model.DataModel;

public class Ex03BubbleSortItem {

	public static void main(String[] args) {
		// int[]
		// String[]
		// Item[] : id, name, salesPrice, expiredDate, storeId
		// + so sánh theo thuộc tính cần sắp xếp
		// + hoán vị theo đối tượng
		Item[] items = DataModel.mockItems();
		printf("initial items", items);
		
		
		// Bất kỳ kiểu dữ liệu đối tượng có sẵn nào của Java đều implements Comparable<T> 
		// Override sẵn hàm compareTo(o) --> int 
						// so sánh this và o
		// 1. Sắp xếp tăng dần theo id
		// Nếu id của pt trước lớn hơn id của pt sau thì --> hoán vị
		bubbleSort(items, (i1, i2) -> {
			return i1.getId() - i2.getId();
		});
		printf("1.Sorting by id (asc)", items);
		
		// 2. Sắp xếp tăng dần theo name
		bubbleSort(items, (i1, i2) -> {
			return i1.getName().compareTo(i2.getName());
		});
		printf("1.Sorting by name (asc)", items);

		
		// 3. Sắp xếp giảm dần theo salesPrice
		bubbleSort(items, (i1, i2) -> {
//			return  i2.getSalesPrice() - i1.getSalesPrice();
			// có thể dùng return i2.getSalesPrice().compareTo(i1.getSalesPrice());
			if (i2.getSalesPrice() - i1.getSalesPrice() > 0) {
				return 1;
			}
			return -1;
		});
		printf("1.Sorting by salesPrice (desc)", items);

		
		// 4. Sắp xếp giảm dần theo storeId
		bubbleSort(items, (i1, i2) -> {
			return i2.getStoreId() - i1.getStoreId();
		});
		printf("1.Sorting by storeId (desc)", items);
		
		// 5. Sắp xếp tăng dần theo storeId, giảm dần theo expiredDate
		bubbleSort(items, (i1, i2) -> {
//			return i1.getStoreId() - i2.getStoreId();
			if (i1.getStoreId() - i2.getStoreId() > 0) {
				return 1;
			}
			else if (i1.getStoreId() - i2.getStoreId() < 0) {
				return -1;
			}
			else return i2.getExpiredDate().compareTo(i1.getExpiredDate());
		});
		printf("1.Sorting by storeId (asc), expiredDate (desc) ", items);

		
		// 5. Sắp xếp giảm dần theo storeId, tăng dần theo expiredDate
		bubbleSort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			if (storeId1 != storeId2) {
				return storeId2.compareTo(storeId1);
			}
			else return i1.getExpiredDate().compareTo(i2.getExpiredDate());
		});
		printf("1.Sorting by storeId (desc), expiredDate (asc) ", items);

		
		// Sắp xếp tăng dần theo storeId,
		// giảm dần theo salesPrice
		// giảm theo expiredDate
		bubbleSort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			
			Double salesPrice1 = i1.getSalesPrice();
			Double salesPrice2 = i2.getSalesPrice();

			if (storeId1 != storeId2) {
				return storeId1.compareTo(storeId2);
			}
			int salesPriceCp = salesPrice2.compareTo(salesPrice1);
			
			if (salesPriceCp != 0) {
				return salesPrice2.compareTo(salesPrice1);
			}
			 return i2.getExpiredDate().compareTo(i1.getExpiredDate());
		});
		printf("1.Sorting by storeId (asc),salesPrice(desc), expiredDate (desc) ", items);
		
		Double s1= items[1].getSalesPrice();
		Double s2= items[2].getSalesPrice();
		System.out.println("sales price 1 -> " + s1);
		System.out.println("sales price 2 -> " + s2);
		System.out.println("s1 = s2 -> " + (s1 == s2));
		System.out.println("s1. compare to s2 -> " + s1.compareTo(s2));

	}
	private static void printf(String prefix, Item[] items) {
		System.out.println(prefix + "-- > {");
		for (Item item : items) {
			System.out.println("   + " + item);
		}
		System.out.println("}\n");
	}
	private static void bubbleSort(Item[] items, ItemComparator itemComp) {
		int length = items.length;
		for (int i = 0;  i < length ; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (itemComp.strategy(items[j], items[j+1]) > 0) {
					Item temp = items[j];
					items[j] = items[j+1];
					items[j+1] =temp;
				}
			}
		}
	}
}
