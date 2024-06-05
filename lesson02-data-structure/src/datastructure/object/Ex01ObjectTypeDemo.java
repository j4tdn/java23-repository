package datastructure.object;

import bean.Item;

public class Ex01ObjectTypeDemo {

	public static void main(String[] args) {
		char v1 = '@';
		int v2 = 22;
		System.out.println("v1 ---> "+v1);
		System.out.println("v2 ---> "+v2);
		
		Item i1 = new Item();
		i1.id = 1;
		i1.name ='A';
		i1.salesPrice =11;
		System.out.println("i1 --> " +i1);
		System.out.println("i1 ---> "+ i1.toString());
		System.out.println("i1 id ="+ i1.id);	
		System.out.println("i1 name ="+ i1.name);
		System.out.println("i1 price ="+ i1.salesPrice);
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'B';
		i2.salesPrice = 22;
		
		
		Item i3 = new Item(3,'B',33);
		System.out.println("i3 -->"+ i3);
	}
}
