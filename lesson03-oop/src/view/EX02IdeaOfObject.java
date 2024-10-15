package view;

import java.time.LocalDate;

import bean.Car;
import bean.Item;

public class EX02IdeaOfObject {
	public static void main(String[] args) {
		Item  item1 = new Item(1,"Item A1",LocalDate.of(2024, 6, 16));
		item1.setName("Item A101");
		 System.out.println(item1);
	//	Item item2 = null; //item2 chua tro den o nho  nao tai heap
		 Item  item2 = new Item(1,"Item A2",LocalDate.of(2024, 6, 17));
		item2.setName("Item A202");
		System.out.println(item2);
		
		Item item3 = item1;
		Integer i1 = 5;
		Integer i2 =7;
		Integer i3 = new Integer(5);
		Integer i4 = 7;
		Car c1 = new Car();
		Car c2 = null;
		c2 = c1;
		c2 = new Car();
		
		System.out.println("Finished ...");
	}
}
