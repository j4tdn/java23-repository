package datastructure.object;

import bean.Item;

public class Ex02ObjectTypeAssignValue {

	public static void main(String[] args) {
		
		//Cap nhat gia tri cho bien KDL nguyen thuy
		int a = 5;
		System.out.println("a1 --> " + a);
		a = 7;
		System.out.println("a2 --> "+ a);
		
		//Cap nhat gia tri cho bien KDL doi tuong
		Item i1 = new Item(1,'A',11);
		System.out.println("i1 address = " + System.identityHashCode(i1));
		
		//C1: Cap nhat gia tri cac thuoc tinh cua o nho(HEAP) hien tai ma bien dang tro den
		i1.salesPrice = 99;
		System.out.println("i11 --> " + i1);
		System.out.println("i11 address = " + System.identityHashCode(i1));
		
		//C2: Cap nhat dia chi ma bien tro den
		i1 = new Item(3,'C',33);
		System.out.println("i12 --> " + i1);
		System.out.println("i12 address = " + System.identityHashCode(i1));
		
		Item i7 = i1;
		
		Item i2 = new Item(2,'B',22);
		System.out.println("i2 address --> "+ System.identityHashCode(i2));
		
		i1 = i2; //100% hoat dong STACK
		System.out.println("i13 --> " + i1);
		System.out.println("i13 address --> "+ System.identityHashCode(i1));
		
		System.out.println("i7 --> "+ i7);
		
		//STACK : bien nguyen thuy --> gia tri
		//        bien doi tuong --> dia chi o vung nho HEAP
	}
}
