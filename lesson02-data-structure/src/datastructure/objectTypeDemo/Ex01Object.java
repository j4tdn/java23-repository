package datastructure.objectTypeDemo;

import bean.Item;

public class Ex01Object {
public static void main(String[] args) {
	char v1 ='@';
	int v2  = 22;
	System.out.println("v1 --> "+v1);
	System.out.println("v2 --> "+v2);
	
	//objecttype
	Item  i1 = new Item();
	i1.id=1;
	i1.name= 'A';
	i1.salesPrice = 11;
	System.out.println("v1--> "+v1);
	
	Item  i2 = new Item();
	i2.id=2;
	i2.name='B';
	i2.salesPrice=22;
	System.out.println("i2 --> "+i2);
	
	Item i3 = new Item(3,'B',33);
	System.out.println("i3 --> "+i3);
}
	
}
