package view;

import java.util.ArrayList;
import java.util.List;

import bean.Item;
import model.DataModel;

public class Ex03HighestPrice {

	public static void main(String[] args) {
		
		List<Item> items = DataModel.mockItems();
		findHighestPricePerStore(items);
		
	}
	
	private static void findHighestPricePerStore(List<Item> items) {
		
		List<Integer> stores = new ArrayList<>();
		List<Integer> maxPrices = new ArrayList<>();
		List<Item> maxPriceItems =new ArrayList<>();
		
		for(Item item : items) {
			boolean storeExists = false;
			for(int i = 0; i < stores.size(); i++) {
				if(stores.get(i).equals(item.getStoreId())) {
					storeExists = true;
					if(item.getSalesPrice() > maxPrices.get(i)) {
						maxPrices.set(i, item.getSalesPrice());
						maxPriceItems.set(i, item);
					}
					break;
				}
			}
			if(!storeExists) {
				stores.add(item.getStoreId());
				maxPrices.add(item.getSalesPrice());
				maxPriceItems.add(item);
			}
		}
		
		System.out.println("Items with the highest sales price for each store:");
		for(int i = 0; i < stores.size(); i++) {
			System.out.println(maxPriceItems.get(i));
		}
		
		
	}
}