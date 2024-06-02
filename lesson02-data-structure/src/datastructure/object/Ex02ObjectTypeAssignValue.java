package datastructure.object;

import bean.Item;

public class Ex02ObjectTypeAssignValue {
	public static void main(String[] args) {
		//Cập nhập primitive:
		int a = 5;
		System.out.println("a1 -> " + a);
		a = 7;
		System.out.println("a2 -> " + a);
		
		//Cập nhập Object type:
		Item i1 = new Item(1,"Đầu tiên", 11);
		i1.salesPrice = 99;
		System.out.println(i1);
		System.out.println("i12 --> + il");
		
		//2 cách: cập nhập stack -> gán địa chỉ mới -> i1.() = "";
		//gán giá trị ở ô HEAP -> i1 = new ();
	}
}
