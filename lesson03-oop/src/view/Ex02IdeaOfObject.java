package view;

import java.time.LocalDate;

import bean.Car;
import bean.Item;

public class Ex02IdeaOfObject {

	public static void main(String[] args) {
		Item item1 = new Item(1, "Item A1", LocalDate.of(2024, 6, 16));
		item1.setName("Item A101");
		System.out.println("Item 1 --> " + item1);
		
		// Item item2 = null; // item2 chưa trỏ đến ô nhớ nào tại HEAP
		Item item2 = new Item(2, "Item A2", LocalDate.of(2024, 6, 17));
		item2.setName("Item 202"); // NullPointerExeption
		System.out.println("Item2 --> " + item2);
		
		// Có bao nhiêu đối tượng được tạo ra trong đoạn code dưới đây
		// Đối tượng (ô nhớ trên vùng nhớ HEAP)
		// --> có bao nhiêu ô nhớ HEAP mới sẽ được tạo ra
		Item item3 = item1;				// no
		Integer i1 = 5;					// yes
		Integer i2 = 7;					// yes
		Integer i3 = new Integer(5);	// yes
		Integer i4 = 7;					// no
		Car c1 = new Car();				// yes
		Car c2 = null;					// no
		c2 = c1;						// no
		c2 = new Car();					// yes
		
		System.out.println("Finished ...");
		
		// Item i1 = new Item(); // H1
		// Item i1 = new Item(); // H2
		
		// i1 = i2; // i1 -> H2
		// H1 không có được sử dụng, không có biến nào trỏ đến
		// i3 = i1; // i3 -> H2, H1 vẫn không được sử dụng
		
		// garbage collection --> tự động đi xóa những ô nhớ không được sử dụng -> tự động xóa
		// cơ chế: sau một thời gian thì nó sẽ kiểm tra ô nhớ đó có được sử dụng hay không
		
	}
	
}
