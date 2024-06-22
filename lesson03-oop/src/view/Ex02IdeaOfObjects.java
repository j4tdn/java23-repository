package view;

import java.time.LocalDate;

import bean.Car;
import bean.Item;

public class Ex02IdeaOfObjects {
	public static void main(String[] args) {
		Item it1 = new Item(1,"Item 1", LocalDate.of(2012, 3, 5));
		it1.setName("Item 01");
		System.out.println("item 1 -> " + it1.toString() );
		
//		Item i2 = null; //item2 chưa trỏ đến gì ở HEAP
		Item it2 = new Item();
		it2.setName("abc"); //-> NullPointerException
		System.out.println("item2 -> " + it2.toString());
		
		//Có bao nhiêu đối tượng được tạo ra:
		Item it3 = it1; //no
		Integer i1 = 5; //y
		Integer i2 = 7; //y
		Integer i3 = new Integer(5); //y 
		Integer i4 = 7;
		Car c1 = new Car(); //y
		Car c2 = null;
		c2 = c1;
		c2 = new Car(); //y
		
		
		//garbage collection -> tự động xoá đi những thứ 0 sử dụng
	}
	
}
