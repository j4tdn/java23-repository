package sorting.bubble;

import java.util.Arrays;

import bean.Item;
import functional.ItemComparator;
import model.DataModel;

import static java.util.Comparator.*;

public class Ex03BubbleSortItem {

	public static void main(String[] args) {
		
		// Item[]: id: name, salesPrice, expiredDate, storeId
		// + So sánh theo thuộc tính cần sắp xếp
		// + Hoán vị đối tượng
		Item[] items = DataModel.mockItems();
		
		printf("Initial itmes", items);
		
		// Bất kỳ KDL đối tượng có sẵn nào của Java đều implements Comparable<T>
		// Override sẵn hàm compareTo(o) --> int
		//					so sánh this và o
		
		// 1. Sắp xếp tăng dần theo id
		// nếu id của phần tử trước lớn hơn id của phần tử sau -> hoán vị
		bubbleSort(items, (i1, i2) -> {
			return i1.getId().compareTo(i2.getId());
		});
		
		printf("1. Sorting by id(asc)", items);
		
		// 2. Sắp xếp tăng dần theo name
		bubbleSort(items, (i1, i2) -> {
			return i1.getName().compareTo(i2.getName());
		});
		
		printf("2. Sorting by name(asc)", items);
		
		// 3. Sắp xếp giảm dần theo salesPrice
		bubbleSort(items, (i1, i2) -> {
			return i2.getSalesPrice().compareTo(i1.getSalesPrice());
		});
		
		printf("3. Sorting by salesPrice(desc)", items);
		
		// 4. Sắp xếp giảm dần theo storeId
		bubbleSort(items, (i1, i2) -> {
			return i2.getStoreId().compareTo(i1.getStoreId());
		});
		
		printf("4. Sorting by storeId(desc)", items);
		
		// 5. Sắp xếp giảm dần theo storeId, tăng dần theo expireDate
		bubbleSort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			
			if(storeId1 != storeId2) {
				return storeId2.compareTo(storeId1);
			}
			
			return i1.getExpireDate().compareTo(i2.getExpireDate());
			
		});
		
		printf("5. Sorting by storeId(desc), getExpireDate(asc)", items);
		
		// 6. Sắp xếp tăng dần theo storeId, 
		//			  giảm dần theo salesPrice, 
		//			  giảm theo expireDate
		
		Double s1 = items[1].getSalesPrice();
		Double s2 = items[2].getSalesPrice();
		
		System.out.println("\n\ni1 salesPrice --> " + s1);
		System.out.println("i2 salesPrice --> " + s2);
		
		System.out.println("isEqual -->" + (s1 == s2));
		System.out.println("isEqual -->" + (s1.compareTo(s2)) + "\n");
		
		// so sánh Float, Double dùng compareTo để tự động compare cùng số chữ số thập phân
		
		bubbleSort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			
			if(storeId1 != storeId2) {
				return storeId1.compareTo(storeId2);
			}
			
			Double salesPrice1 = i1.getSalesPrice();
			Double salesPrice2 = i2.getSalesPrice();
			
			int salesPriceCp = salesPrice2.compareTo(salesPrice1);
			
			if(salesPriceCp != 0) {
				return salesPrice2.compareTo(salesPrice1);
			}
			
			return i2.getExpireDate().compareTo(i1.getExpireDate());
			
		});
		
//		Arrays.sort(items, comparing(Item::getStoreId)
//							.thenComparing(Item::getSalesPrice, reverseOrder())
//							.thenComparing(Item::getExpireDate, reverseOrder()));
//		
//		printf("6. Sorting by storeId(asc), salesPrice(desc), expireDate(desc)", items);
		
	}
	
	private static void bubbleSort(Item[] items, ItemComparator itemComp) {
		int length = items.length;
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length - i - 1; j++) {
				if(itemComp.strategy(items[j], items[j + 1]) > 0) {
					Item temp = items[j];
					items[j] = items[j + 1];
					items[j + 1] = temp;
					
				}
			}
		}
	}
	
	private static void printf(String prefix, Item[] items) {
		System.out.println(prefix + " --> {");
		for(Item item : items) {
			System.out.println("    + " + item);
		}
		System.out.println("}\n");
	}
	
}
