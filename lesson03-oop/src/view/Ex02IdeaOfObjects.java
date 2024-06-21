package view;

import java.time.LocalDate;

import bean.Car;
import bean.Item;

public class Ex02IdeaOfObjects {

	public static void main(String[] args) {
		
		Item item1 = new Item(1, "Item A1", LocalDate.of(2024, 6, 16));
		item1.setName("Item A101");
		System.out.println("item1 --> " + item1);
		
		//Item item2 = null; //item2 chua tro den o nho nao tai HEAP
		Item item2 = new Item(2, "Item A2", LocalDate.of(2024, 6, 17));
		item2.setName("Item 202"); //NullPoiterException
		System.out.println("item2 --> " + item2);
		
		//Co bao nhieu doi tuong dc tao ra trong doan code duoi day
		//Doi tuong (o nho tren vung nho HEAP)
		// --> Co bao nhieu o nho HEAP moi dc tao ra
		Item item3 = item1; //no
		Integer i1 = 5; //yes
		Integer i2 = 7; //yes
		Integer i3 = new Integer(5); //yes
		Integer i4 = 7; //no
		Car c1 = new Car(); //yes
		Car c2 = null; //no
		c2 = c1; //no
		c2 = new Car(); //yes
		
		System.out.println("Finished ...");
		
		// Item i1 = new Item(); //H1 H2
		// Item i2 = new Item(); //H2
		
		// i1 = i2;
		// H1 khong duoc su dung, bien nao tro den
		
		// garbage collection --> tu dong di xoa o nho ko dc su dung
		// co che: timing ...
	}
}
