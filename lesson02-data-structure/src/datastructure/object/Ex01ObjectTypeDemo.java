package datastructure.object;

import bean.Item;

public class Ex01ObjectTypeDemo {

	public static void main(String[] args) {

//		3 cách để sysout 3 Item
		
		char v1 = '@';
		int v2 = 22;
		System.out.println("v1 ---->" + v1);
		System.out.println("v2 ---->" + v2);

		Item i1 = new Item();
		i1.id = 1;
		i1.name = 'A';
		i1.SalesPrice = 1;
		System.out.println("i1 ---> " +i1);
		
		System.out.println("i1 toString --> " + i1.toString()); 
		
		System.out.println("i1 id = " +i1.id);
		System.out.println("i1 name = " +i1.name);
		System.out.println("i1 SalesPrice = " +i1.SalesPrice);
	
		
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'B';
		i2.SalesPrice = 2;
		System.out.println("i2 ---> " +i2);
		
		Item i3 = new Item(3, 'C', 3);
		System.out.println("i3 ---> " +i3);
		
		
		
	}

}
