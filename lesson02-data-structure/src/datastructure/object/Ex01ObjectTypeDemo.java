package datastructure.object;

//class này sử dụng class kia
//nếu 2 class khác package thì phải import

import bean.Item;

public class Ex01ObjectTypeDemo {
	public static void main(String[] args) {
		char v1 = '@';
		int v2 = 22;
		System.out.println("v1 -->" +v1);
		System.out.println("v2 -->" +v2);	
		
		Item i1 = new Item();
		i1.id = 1;
		i1.name = 'A';
		i1.salesPrice = 17;
		System.out.println("i1 id ->"+i1);
		System.out.println("i1 id = "+i1.id);
		System.out.println("i1 name = "+i1.name);
		System.out.println("i1 salesPrice = "+i1.salesPrice);
		
		Item i2 =new Item();
		i2.id =2 ;
		i2.name ='B';
		i2.salesPrice = 22;
		System.out.println("i2 --> "+i2);
		Item i3 = new Item(33,'B',3);
		System.out.println("i3 -->i3 "+i3);
	
	}
}
