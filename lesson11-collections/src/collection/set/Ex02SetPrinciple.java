package collection.set;

import java.util.HashSet;
import java.util.Set;

import bean.Item;
import utils.CollectionUtils;

public class Ex02SetPrinciple {

	/*
	 * Cơ chế khi add một phần tử mới newElement vào Set<T>
	 * 
	 * Kiểm tra nếu chưa có phần tử nào trong Set<T> có cùng hashcode và equals
	 * với newElement --> cho phép add vào
	 * 
	 * Ngược lại return false, không add vào
	 */
	
	public static void main(String[] args) {
		var items = mockData();
		
		Item newItem1 = new Item(88, "Item 88", 88d);
		items.add(newItem1);
		
		Item newItem2 = new Item(21, "Item Axt", 44d);
		items.add(newItem2);
		
		System.out.println("items size = " + items.size());
		
		CollectionUtils.generate("1. Items", items);
	}
	
	private static Set<Item> mockData() {
		Set<Item> items = new HashSet<>();
		items.add(new Item(21, "Item Axt", 44d));
		items.add(new Item(25, "Item Zko", 22d));
		items.add(new Item(28, "Item Ba8", 48d));
		return items;
	}
	
}