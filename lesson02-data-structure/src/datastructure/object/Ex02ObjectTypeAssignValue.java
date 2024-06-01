package datastructure.object;

import bean.Item;

public class Ex02ObjectTypeAssignValue {

	public static void main(String[] args) {
		
		//Để cập nhật giá trị cho biến KDL nguyên thủy --> dùng toán tử  '='
		int a =5;
		a=7;
		
		//Để cập nhật giá trị cho biến KDL đối tượng -->
		Item i1 = new Item(1, 'A', 11);
		
		//Cách 1: cập nhật giá trị của các thuộc tính của ô nhớ hiện tại mà biến đang trỏ đến 
		i1.salesPrice = 99;
		System.out.println("i1.1 -->" +i1);
		System.out.println("i1 address = " + System.identityHashCode(i1));
		
		//Cách 2: cập nhật địa chỉ mà biến trỏ đến (tạo ô nhớ mới)
		i1 = new Item(3, 'C', 33); //trỏ đến ô nhớ mới
		System.out.println("\ni1.2 -->" +i1);
		System.out.println("i1 address = " + System.identityHashCode(i1));

		
		Item i7 = i1;
		
		Item i2 = new Item(2, 'B', 22);
		System.out.println("i2 address -->" + System.identityHashCode(i2));
		i1=i2;
		System.out.println("\ni1.3 -->" +i1);
		System.out.println("i1 address = " + System.identityHashCode(i1));

		System.out.println("\ni7 -->" +i7);
		//STACK: biến nguyên thủy  -> giá trị
		//	   : biến đối tượng  -> địa chỉ ở vùng nhớ HEAP
	}

}
