package view;

import java.time.LocalDate;

import bean.Item;

public class Ex02IdeaOfObjects {
	
	public static void main(String[] args) {
		Item item1 = new Item(1, "Item A1", LocalDate.of(2024, 6, 16));
		item1.setName("Item A101");
		System.out.println("item1 --> " + item1);
		
		// Item item2 = null; // item 2 chưa trỏ đế ô nhớ nào tại HEAP
		Item item2 = new Item(2, "Item A2", LocalDate.of(2024, 6, 17));
		item2.setName("Item 202"); // NullPoiterException
		System.out.println("item2 --> " + item2);
		
		// Có bao nhiêu đối tượng đc tạo ra trong đoạn code dưới đây
		// Đối tượng (ô nhớ trên vùng nhớ HEAP)
		// --> có bao nhiêu ô nhớ HEAP mới sẽ được tạo ra
		Item item3 = item1; //no
		Integer i1 = 5; //yes
		Integer i2 = 7; //yes
		Integer i3 = new Integer(5); //yes
		Integer i4 = 7; //no
		Car c1 = new Car(); //yes
		Car c2 = null; //no
		c2 = c1; //no
		c2 = new Car(); //yes
		// 5 đối tượng được tạo ra
		System.out.println("Finished ...");
		
		// Item i1 = new Item(); //H1 H2
		// Item i2 = new Item(); //H2
		
		// i1 = i2;
		// H1 không có được sử dụng , biến nào trỏ đến
		
		// garbage collection --> tự động đi xóa những ô nhớ ko được sử dụng
		// cơ chế: timing ...
	}
}
