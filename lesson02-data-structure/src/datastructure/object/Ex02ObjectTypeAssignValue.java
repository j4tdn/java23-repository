package datastructure.object;

import bean.Item;

public class Ex02ObjectTypeAssignValue {
	
	public static void main(String[] args) {
		
		// Để cập nhật giá trị cho biến KDL nguyên thủy
		// 		--> Dùng toán tử = 
		int a = 5;
		System.out.println("a --> " + a);
		a = 7;
		System.out.println("a2 --> " + a);
		
		// Để cập nhật giá trị cho biến KDL đối tượng
		Item i1 = new Item(1,'A',11);
		System.out.println("i1 address = " + System.identityHashCode(i1));
		
		// Cách 1: cập nhật giá trị các thuộc tính của ô nhớ(HEAP) hiện tại
		// mà biến đang trỏ đến
		i1.salesPrice = 99;
		System.out.println("i11 --> " + i1);
		System.out.println("i11 address = " + System.identityHashCode(i1));
		
		// Cách 2: cập nhật địa chỉ mà biến trỏ đến
		i1 = new Item(3,'C',33);
		System.out.println("i12 --> " + i1);
		System.out.println("i12 address = " + System.identityHashCode(i1));
		
		Item i7 = i1;
		
		Item i2 = new Item(2,'B',22);
		System.out.println("i2 address = " + System.identityHashCode(i2));
		
		i1 = i2;
		System.out.println("i13 --> " + i2);
		System.out.println("i13 address = " + System.identityHashCode(i2));
		
		System.out.println("i7 --> " + i7);
		
		//STACK: biến nguyên thủy -> giá trị
		//     : biến đối tượng   -> địa chỉ ở vùng nhớ HEAP
		
	}
	
}
