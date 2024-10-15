package view;

import bean.Item;

public class Ex03Store {

	public static void main(String[] args) {
		Item[] items = { 
				new Item(1, "A", 25, 101), 
				new Item(2, "B", 90, 102), 
				new Item(3, "C", 88, 102),
				new Item(4, "D", 40, 101), 
				new Item(5, "E", 60, 102), 
				new Item(6, "F", 18, 101) 
		};

		findMaxPriceItemForEachStore(items);
	}

	public static void findMaxPriceItemForEachStore(Item[] items) {
		// Find unique store IDs
		int[] storeIds = new int[items.length];
		int uniqueStoreCount = 0;

		for (Item item : items) {
			boolean isUnique = true;
			for (int i = 0; i < uniqueStoreCount; i++) {
				if (storeIds[i] == item.getStoreId()) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				storeIds[uniqueStoreCount++] = item.getStoreId();
			}
		}

		// Find the maximum priced item for each unique store ID
		for (int i = 0; i < uniqueStoreCount; i++) {
			int storeId = storeIds[i];
			Item maxItem = null;

			for (Item item : items) {
				if (item.getStoreId() == storeId) {
					if (maxItem == null || item.getSalesPrice() > maxItem.getSalesPrice()) {
						maxItem = item;
					}
				}
			}
			System.out.println("Highest priced item in Store " + storeId + ": \n" + maxItem + "\n");
		}
	}

}
