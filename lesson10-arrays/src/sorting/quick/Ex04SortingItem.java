package sorting.quick;

import java.util.Arrays;
import bean.Item;
import model.DataModel;

public class Ex04SortingItem {

	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		printf("Initial items", items);
		
		// 1. Sắp xếp tăng dần theo id
		Arrays.sort(items, (i1, i2) -> {
			return i1.getId().compareTo(i2.getId());
		});
		printf("1. Sorting by id(asc) ", items);
		
		// 2. Sắp xếp tăng dần theo name
		Arrays.sort(items, (i1, i2) -> {
			return i1.getName().compareTo(i2.getName());
		});
		printf("2. Sorting by name(asc) ", items);
		
		// 3. Sắp xếp giảm dần theo salesPrice
		Arrays.sort(items, (i1, i2) -> {
			return i2.getSalesPrice().compareTo(i1.getSalesPrice());
		});
		printf("3. Sorting by salesPrice(desc) ", items);

		// 4. Sắp xếp giảm dần theo storeId
		Arrays.sort(items, (i1, i2) -> {
			return i2.getStoreId().compareTo(i1.getStoreId());
		});
		printf("4. Sorting by storeId(desc) ", items);
		
		// 5. Sắp xếp giảm dần theo storedId, giảm dần theo expiredDate
		Arrays.sort(items, (i1, i2) -> {
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
		
		Arrays.sort(items, (i1, i2) -> {
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
	
	private static void printf(String prefix, Item[] items) {
		System.out.println(prefix + "--> {");
		for (Item item : items) {
			System.out.println("     + " + item);
		}
		System.out.println("}\n");
	}
	
}
