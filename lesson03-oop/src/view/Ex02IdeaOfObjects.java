package view;

import java.time.LocalDate;
import java.time.LocalDateTime;

import bean.Car;
import bean.Item;

public class Ex02IdeaOfObjects {
	public static void main(String[] args) {
		Item item1 = new Item(1, "Item A1", LocalDate.of(2024, 6, 19));
		item1.setName("Item A101");
		System.out.println("item1 -->" + item1);
		
		
		Item item2 = new Item(2, "item A2", LocalDate.of(2024, 6, 20));
		item2.setName("Item A101");
		System.out.println("item2 -->" + item2);
		
		// Có bao nhiêu đối tượng đc tạo ra trong đoạn code dưới đây
		// Đối tượng (ô nhớ trên vùng nhớ HEAP)
		// Kiểm tra đã tồn tại giá trị chưa nếu đã có thì ko tạo...
		Item item3 = item1; //no
		Integer i1 = 5;	// y
		Integer i2 = 7;	// y
		Integer i3 = new Integer(5);	//y
		Integer i4 = 7;	// no (đã có giá trị ở trên)
		Car c1 = new Car(); // y
		Car c2 = null; 	// no
		c2=c1; // no
		c2= new Car();	// y
		System.out.println("Finished..");
		
	}
}
