package collection.set;

import java.util.HashSet;
import java.util.Set;

import bean.Item;

public class Ex02SetPrinciple {
	/*
	    Cơ chế khi add một phần tử mới newElements vào set<T>
	    
	 */
	
	public static void main(String[] args) {
		var items = mockData();
		Item newItem1 = new Item(88, "Item 88", 88d);
		
		Item newItem2 = new Item(21, "Item Axt", 44d);
		
	}
	private static Set<Item> mockData(){
		Set<Item> items  = new HashSet<>();
		
		items.add(new Item(21, "Item Axt", 44d));
		items.add(new Item(25, "Item Zko", 22d));
		items.add(new Item(28, "Item Ba8", 48d));
		return items;
	}
}
