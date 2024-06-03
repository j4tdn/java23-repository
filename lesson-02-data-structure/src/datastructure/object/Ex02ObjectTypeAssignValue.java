//System.identityHashCode(object T) : get address on heap memory

package datastructure.object;

import java.util.Random;

import bean.Item;

public class Ex02ObjectTypeAssignValue {
	public static void main(String[] args) {
		// Để cập nhật giá trị cho 1 biến kdl primitive \
		int a = 5;
		System.out.println("a1 = " + a);
		a = 6;
		System.out.println("a2 = "+ a);
		
		Item i1 = new Item(1, 'a', 11);
		// cách 1 : cập nhật giá trị của các thuộc tính của ô nhớ hiện tại mà 
		// biến đang trỏ đến
		i1.id = 4;
		i1.name = 'B';
		System.out.println("i1.1 -> " + i1 );
		System.out.println("i1 address before being assigned = " + System.identityHashCode(i1));
		// Cách 2: cập nhật địa chỉ mà biến trỏ đến
		i1 = new Item(3, 'C', 33);
		System.out.println("i1 address after being assigned = " + System.identityHashCode(i1));
		System.out.println("i1.2 -> " + i1 );
		
		Item i7 = i1;
		
		Item i2 = new Item(2, 'B', 22); //H2
		System.out.println("i2 address :" + System.identityHashCode(i2));
		i1 = i2;
		
		System.out.println("i1.3 -->" + i1);
		System.out.println("i1.3 address --> "+ System.identityHashCode(i1));
		
		System.out.println("i7 -->" + i7);
		// Stack: biến nguyên thuỷ -> giá trị
		// 		  biến đối tượng -> địa chỉ vùng nhớ heap
		
//		System.out.println("i1 = "+ i1);
//		i2.id = 99;
//		i2.name = 'h';
//		i2.salesPrice = 999;
//		System.out.println("i1 = "+ i1);
	}
}
