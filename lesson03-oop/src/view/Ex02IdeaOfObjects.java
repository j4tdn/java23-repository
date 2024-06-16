package view;

import java.time.LocalDate;

import bean.Car;
import bean.Item;

public class Ex02IdeaOfObjects {

	public static void main(String[] args) {
		
		Item item1 = new Item(1, "Item A1", LocalDate.of(2024, 6, 14));
		item1.setName("Item A101");
		System.out.println("Item1 --> " + item1);
		
		// Item item2 = null; // item2 chưa trỏ đến ô nhớ nào tại HEAP
		Item item2 = new Item(2, "Item A2", LocalDate.of(2024, 6, 17));
		item2.setName("Item 202"); // NullPoiterException
		System.out.println("Item2 --> " + item2);
		
		// Có bao nhiêu đối tượng được tạo ra trong đoạn code dưới đây
		// Đối tượng(ô nhớ trên vùng nhớ HEAP)
		// --> Có bao nhiêu ô nhớ HEAP mới sẽ được tạo ra
		Item item3 = item1; 			// No
		Integer i1 = 5; 				// Yes
		Integer i2 = 7; 				// Yes
		Integer i3 = new Integer(5);	// Yes
		Integer i4 = 7; 				// No
		Car c1 = new Car();				// Yes
		Car c2 = null;					// No
		c2 = c1;						// No
		c2 = new Car();					// Yes
		
		System.out.println("Finished ...");
		
		// Item i1 = new Item(); // H1 H2
		// Item i2 = new Item(); // H2
		
		// i1 = i2
		// H1 không có đợc sử dụng, biến nào trỏ đến
		
		// garbage collection --> tự động đi xóa những ô nhớ không được sử dụng
		// cơ chế: timing...
		
		
	}
}
