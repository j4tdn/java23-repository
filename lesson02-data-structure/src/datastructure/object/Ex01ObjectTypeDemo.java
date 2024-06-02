package datastructure.object;

//class nay su dung class kia
//neu 2 class khac package thi phai import
import bean.Item;

public class Ex01ObjectTypeDemo {

	public static void main(String[] args) {
		//primitive type
		char v1 = '@';
		int v2 = 22;
		System.out.println("v1 --> " + v1);
		System.out.println("v2 --> " + v2);
		
		//Voi 1 bien la KDL doi tuong
		//Khi minh in bien do ra tu dong goi ham toString() trong class Object
		
		//Trong java co class 'Object' --> class cha cua tat ca class
		//Dung de chua cac ham co san cua Java vi du nhu toString
		
		//new Item() -> tao ra 1 doi tuong cho class Item (OOP)
		//new Item() -> tao ra 1 o nho de luu tru gia tri cho 1 Item
		
		//object type
		Item i1 = new Item();
		i1.id = 1; //gan id = 1 cho o nho tai HEAP ma i1 dang tro den
		i1.name = 'A'; //gan name = 'A' cho o nho tai HEAP ma i1 dang tro den
		i1.salesPrice = 11; //gan salesPrice = 11 cho o nho tai HEAP ma i1 dang tro den
		System.out.println("i1 --> " + i1);
		System.out.println("i1 toString --> " + i1.toString());//getClass().getName() + "@" + Integer.toHexString
		System.out.println("i1 id = " + i1.id);
		System.out.println("i1 name = " + i1.name);
		System.out.println("i1 salesPrice = " + i1.salesPrice);
		
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'B';
		i2.salesPrice = 22;
		System.out.println("i2 --> " + i2);
		
		Item i3 = new Item(3,'B',33);
		System.out.println("i3 --> " + i3);
	}
}
