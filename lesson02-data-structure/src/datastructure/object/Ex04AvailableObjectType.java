package datastructure.object;

import bean.Item;

public class Ex04AvailableObjectType {
	public static void main(String[] args) {
		//primitive  int,double,char
		int a =5;
		double b =7;
		//object type
		//custom Item,Employee,Store
		//available Interger,Double,Character..
		Item item1 = new Item(1,'A',11);
		
		//class Integer co 1 thuoc tinh la so nguyen
		Integer i1 = new Integer(22);
		Integer i2  = 44;
		//class double co 1 thuoc tinh so thuc
		Double d1 = new Double(44d);
		Double d2 = 88d;
		//class string co 1 thuoc tinh chuoi
		String s1 = new String("hello");
		String s2 = new String("chao");
		String s3 = new String("hello");
		String x1 = "bye";
		String x2 = "hell";
		String x3 = "bye";
		x3 = "spring";
		//integer,double,string --> Imutable  class :
		//là class ở đó khi tọa ra 1 đối tượng trong ô nhớ đó chứa giá trị của thuộc tính
		//mà không thể cập nhật giá tri thuộc tính trong ô nhớ đó được
		String x4 = null;
		
		
		System.out.println("s1 address --> "+ System.identityHashCode(s1));
		System.out.println("s2 address --> "+ System.identityHashCode(s2));
		System.out.println("s3 address --> "+ System.identityHashCode(s3));
		System.out.println("------------------ ");
		System.out.println("x1 address --> "+ System.identityHashCode(s1));
		System.out.println("x2 address --> "+ System.identityHashCode(x2));
		System.out.println("x3 address --> "+ System.identityHashCode(x3));

		
	}
}
