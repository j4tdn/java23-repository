package view;

import java.time.LocalDate;

import bean.Car;
import bean.Item;

public class Ex02IdeaOfObjects {
	public static void main(String[] args) {
		Item item1 = new Item(1, "Item A1", LocalDate.of(2024,6,16));	
		item1.setName("Item A101");
		System.out.println("Item 1 --> " + item1);
		
//		Item item2 = null;
		Item  item2 = new Item(2, "Item A2", LocalDate.of(2024, 7, 16));
		item2.setName("Item 102"); // null pointer exception 
		System.out.println("Item 2 --> " + item2);
		
		// Co bao nhieu doi tuong duoc tao ra trong doan code duoi day
		Item item3 = item1; // Gán địa chỉ ở stack -> k tạo đối tượng
		Integer i1 = 5; // có tạo
		Integer i2 = 7; // có tạo
		Integer i3 = new Integer(5); // có tạo
		Integer i4 = 7; // k tạo -> constant pool
		Car c1 = new Car(); // có tạo
		Car c2 = null; // k tạo
		c2 = c1; // gán giá trị ở stack -> k tạo
		c2 = new Car(); // có tạo  
	}
}
