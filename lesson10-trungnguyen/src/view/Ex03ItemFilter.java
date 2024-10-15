package view;

import bean.Item;

public class Ex03ItemFilter {

	public static void main(String[] args) {
		Item[] items = mockData();
		int count = 0;
		int[] storeIds = new int[items.length];
		
		// duyệt các sản phẩm -> lọc ra mảng các cửa hàng
		for (int i = 0; i < items.length; i++) {
			boolean existBefore = false;
			for (int j = 0 ; j < count; j++) {
				if (items[i].getStoreId() == storeIds[j]) {
					existBefore = true;
					break;
				}
			}
			if (!existBefore) {
				storeIds[count++] = items[i].getStoreId();
			}
		}
		
		// duyệt ra phần tử có giá đắt nhất của mỗi cửa hàng
		for (int i = 0; i < count; i++) {
			int current = storeIds[i];
			
			Item maxPriceItem = null; 
			
			for (Item item : items) {
				if (item.getStoreId() == current) {
					if (maxPriceItem == null || item.getSalesPrice() > maxPriceItem.getSalesPrice()) {
						maxPriceItem = item;
					}
				}
			}
			
			if (maxPriceItem != null) {
				System.out.println("StoreId: " + current + " - Highest Priced Item: " + maxPriceItem );
			}
		}
	}
	
	private static Item[] mockData() {
		 Item[] items =  {
	            new Item(1, "A", 25, 101),
	            new Item(2, "B", 90, 102),
	            new Item(3, "C", 88, 102),
	            new Item(4, "D", 40, 101),
	            new Item(5, "E", 60, 102),
	            new Item(6, "F", 18, 101)
	        };
		 return items;
	}
}
