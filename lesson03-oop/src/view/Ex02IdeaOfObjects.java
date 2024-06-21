package view;

import java.time.LocalDate;

import bean.Car;
import bean.Item;

public class Ex02IdeaOfObjects {
	public static void main(String[] args) {
		Item item1 = new Item(1, "Item A1", LocalDate.of(2024, 6, 16));
		item1.setName("Item A101");
		System.out.println("item1 --> " +item1);
		
		//Item item2 = null; // item2 chua tro den o nho nao tai HEAP
		Item item2 = new Item(2, "Item A2", LocalDate.of(2024, 6, 17));
		item2.setName("Item 202"); // nullPoiterException
		System.out.println("item2 --> " +item2);
		
		// co bao nhieu doi tuong dc tao ra trong doan code
		// Doi tuong (o nho tren vung nho HEAP)
		// --> co bao nhieu o nho moi se dc tao ra
		Item item3 = item1;
		Integer i1 = 5;
		Integer i2 = 7;
		Integer i3 = new Integer(5);
		Integer i4 = 7;
		Car c1 = new Car ();
		Car c2 = null;
		c2 = c1;
		c2 = new Car ();
		
		System.out.println("Finished .....");
		
		// Item i1 = new Item(): // H1 H2
		// Item i2 = new Item (); //H2
		
		// i1 = i2;
		// H1 k co dc su dung, bien tro den
		
		// garbage collection --> tu dong di xoa nhung o nho k dc su dung
		// co che: timing .....
		
		
	}
}
