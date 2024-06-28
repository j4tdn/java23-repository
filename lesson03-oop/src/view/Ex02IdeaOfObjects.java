package view;

import java.time.LocalDate;

import bean.Item;

public class Ex02IdeaOfObjects {

	public static void main(String[] args) {
		Item item1 = new Item(1, "Item A1", LocalDate.of(2024, 6, 16));
		item1.setName("Item A101");
		System.out.println("item --> " + item1);
		
		// Item item2 = null; // item2 chưa trỏ đến ô nhớ nào tại HEAP
		Item item2 = new Item(2, "Item A2", LocalDate.of(2024, 6, 17));
		item2.setName("Item 202"); // NullPoiterException
 		System.out.println("item2 --> " + item2);
		
 		Item item3 = item1;
 		Integer i1 = 5;
 		Integer i2 = 7;
 		Integer i3 = new Integer(5);
 		Integer i4 = 7;
 		Car c1 = new Car();
 		Car c2 = null;
 		c2 = c1;
 		c2 = new Car();
 		
 		System.out.println("Finished...");
 		
 		// Item i1 = new Item(); // H1 H2
 		// Item i2 = new Item(); // H2
 		
 		// i1 = i2;
 		// H1 ko có đc sử dụng, biến nào trỏ đến
 		
 		//garbage collection --> tự động xóa đi những ô nhớ ko đc sử dụng
 		// cơ chế: timing...
 		
	}
}
