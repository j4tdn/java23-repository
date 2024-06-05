package datastructure.object;

import bean.Item;

public class Ex02OjectTypeAssignValue {
      public static void main(String[] args) {
		int a = 5;
	     System.out.println("a -->" + a);
		a =7;
	    System.out.println("a --> "+ a);
		
		Item i1 = new Item();
		i1 = new Item(1, 'A',11);
		System.out.println("i1 address --> "+ System.identityHashCode(i1));
		// cách 1 cập nhật giá trị các thuộc tính của ô nhớ hiện tại
		// mà biến đang trỏ đến
		i1.salesPrice = 99;
		System.out.println("i11 --> "+i1);
		
		// cập nhật địa chỉ ô nhớ đang trỏ đến
		i1 = new Item(3, 'C',33);
		System.out.println("i12 --> "+i1);
		System.out.println("i12 address --> "+ System.identityHashCode(i1));
		 
		Item i7 =i1;
		Item i2 = new Item(2,'B',22);
		i1 = i2;
		System.out.println("i2 address --> "+ System.identityHashCode(i2));
		System.out.println("\n=======\n");
		System.out.println("i13 --> "+i1);
		System.out.println("i13 address --> "+ System.identityHashCode(i1));
		System.out.println("\n=======\n");
		System.out.println("i7 address --> "+ i7);
		
	}
}
