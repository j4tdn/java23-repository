package sorting.bubble;

import bean.Item;
import functional.ItemComparator;
import model.DataModel;

public class Ex03BubbleSortItem {
	public static void main(String[] args) {
		// int [] : Sắp xếp tăng dần giảm dần
		// String[] : tăng dần giảm dần null firts, null last
		// Items[] : id, name, salesPrice, expiriedDate, storeId 
		// + so sánh teho thuộc tính cần sắp xếp
		// + hoán vị đối tượng 
 		Item[] item = DataModel.mockItems();
		printf("Inittial items ", item);
		
		// Bất kì KDL đối tượng nào có sẵn nào của JAVA đều implements Comparable<T>
		// Override sẵn hàm compareTo(o) --> int
		//                 so sánh this và o
 		
		// 1. Sắp xếp tăng dần theo id
		bubbleSort(item, (i1,i2) ->{
			return i1.getId().compareTo(i2.getId());
		});
		printf("1.Sắp xếp tăng dần theo id ", item);
		// 2. Sắp xếp tăng dần theo name
		bubbleSort(item, (i1,i2) ->{
			return i1.getName().compareTo(i2.getName());
		});
		printf("2.Sắp xếp tăng dần theo id ", item);
		// 3. Sắp xếp giảm dần theo salesPrice
		bubbleSort(item, (i1,i2) ->{
			return i2.getSalesPrice().compareTo(i1.getSalesPrice());
			//return i2.getSalesPrice() > i1.getSalesPrice() ? 1 : -1;
 		});
		printf("3. Sắp xếp giảm dần theo salesPrice", item);
		// 4. Sắp xếp giảm dần theo storeId
		bubbleSort(item, (i1,i2) ->{
			return i2.getStoreId().compareTo(i1.getStoreId());
 		});
		printf(" 4. Sắp xếp giảm dần theo storeId", item);
		// 5. Sắp xếp giảm dần theo storeId, tăng dần theo expiredDate
		bubbleSort(item, (i1,i2) -> {
			Integer sto1 = i1.getStoreId();
			Integer sto2 = i2.getStoreId();
			if(sto1 != sto2) {
				return i2.getStoreId().compareTo(i1.getStoreId());
				
			}
			return i1.getExpiredDate().compareTo(i2.getExpiredDate());
		});
		printf(" 5. Sắp xếp giảm dần theo storeId, tăng dần theo expiredDate", item);
		// 6.Sắp xếp tăng dần theo storeId, 
		// giảm dần theo salesPrice, 
		// giảm theo expiredDate
		bubbleSort(item, (i1,i2) -> {
			Integer sto1 = i1.getStoreId();
			Integer sto2 = i2.getStoreId();
			if(sto1 != sto2) {
				return i1.getStoreId().compareTo(i2.getStoreId());
				
			}
			Double sale1 = i1.getSalesPrice();
			Double sale2 = i2.getSalesPrice();
			if(sale1 != sale2) {
				return sale2.compareTo(sale1);
			}
			return i2.getExpiredDate().compareTo(i1.getExpiredDate());
			
		});
		printf(" 6.Sắp xếp tăng dần theo storeId, giảm dần theo salesPrice,  giảm theo expiredDate", item);
	}
	 private static void bubbleSort(Item[] items, ItemComparator itemComp) {
		 int length = items.length;
		 for(int i = 0; i < length; i++) {
			 for(int j = 0; j < length - i - 1
					 ; j++) {
				 if(itemComp.strategy(items[j], items[j + 1]) > 0) {
					 Item temp = items[j];
					 items[j] = items[j + 1];
					 items[j + 1] = temp; 
				 }
			 }
		 }
	 }
	private static void printf(String prefix,Item[] items) {
		System.out.println(prefix + "--> {");
		for(Item item: items) {
			System.out.println("   + " + item);
		}
		System.out.println("}\n");
	}
}
