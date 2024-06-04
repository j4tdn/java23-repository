package datastructure.oject;

import bean.Item;

public class Ex02ObjectTypeAssignValue {
	
	public static void main(String[] args) {
		// Để cập nhật giá trị  cho biến KDL nguyên thủy
		// Dùng toán tử = 
		int a = 5;
		System.out.println("a1 --> " + a);
		a = 2;
		System.out.println("a2 --> " + a);
		// Để cập nhật giá trị cho biến KDL đối tượng 
		
		Item i1 = new Item(1,'C',44);
		System.out.println("i1 address --> " + System.identityHashCode(i1));
		// cách 1: cập nhật giá trị các thuộc tính của ô nhớ heap hiện tại mà biến đang trỏ đến 
		
		i1.salesPrice = 99;
		System.out.println("i11 address --> " + System.identityHashCode(i1));
		
		// cách 2 : Cập nhật địa chỉ mà biến Trỏ đến 
		i1 = new Item(3,'C',33);
		System.out.println("i12 address --> " + System.identityHashCode(i1));
		System.out.println(" i12 --> " + i1);
		
		
	}
}
