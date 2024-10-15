package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Item.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] item = {
				new Item(1,"A", 25, 101),
				new Item(2,"B", 90, 102),
				new Item(3,"C", 88, 102),
				new Item(4,"D", 40, 101),
				new Item(5,"E", 60, 102),
				new Item(6,"F", 18, 101)
		};
		System.out.println("The highest priced item in each store: ");
		findHighestPrice(item);
	}
	private static void findHighestPrice(Item[] items ) {
		List<Item> maxSalesPriceList = new ArrayList<>();
		List<Integer> uniqueStore = new ArrayList<>(); 
		for(Item item : items ) {
			int storeId = item.getStoreId();
			if(!uniqueStore.contains(storeId)) {
				uniqueStore.add(storeId);
				maxSalesPriceList.add(item);
			}
		}
		for(Item item:maxSalesPriceList) {
			System.out.println(item);
		}
	}
}

