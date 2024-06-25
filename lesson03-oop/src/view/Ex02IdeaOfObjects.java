package view;

import java.time.LocalDate;

import bean.Item;

public class Ex02IdeaOfObjects {
	public static void main(String[] args) {
       Item item1 = new Item(1, "Item A1", LocalDate.of(2024, 6, 16));
       item1.setName("Item A101");
       System.out.println("item --> " + item1);
       
       // Item item2 = null; // item2 chưa trỏ đến ô nhớ nào tại HEAP
       Item item2 = new Item(1, "Item A1", LocalDate.of(2024, 6, 17));
       item1.setName("Item A202"); // NullPointerException
       System.out.println("item --> " + item2);
       
       
       Item item3 = item1;
       Integer i1 = 5;
       Integer i2 = 7;
       Integer i3 = new Integer(5);
       Integer i4 = 7;
		/*
		 * Car c1 = new Car();
		 * Car c2 = null; 
		 * c2 = c1;
		 * c2 new Car();
		 */
       System.out.println("Finished ...");
       
       
	}
}
