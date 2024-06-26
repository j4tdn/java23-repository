package datastructure.object;

import bean.Item;

public class Ex03ObjectTypePassVariableViaMethod {
	
	// JAVA pass by value(AT STACK) | reference
	
	// Khi truyền 1 biến qua hàm
	// Muốn ra khỏi hàm, cập nhật dc giá trị của biến đó
	// thì biến đó yêu cầu phải là KDL đối tượng
	
	public static void main(String[] args) {
		
		Item i1 = new Item(55, 'Z', 555); // H1(55, Z, 555)
		System.out.println("i1 before --> " + i1);
		
		modify(i1);
		
		System.out.println("i1 after --> " + i1);
		
	}
	
	// Item item = i1; // item(H1), i1(H1)
	private static void modify(Item item) {
		item.salesPrice = 999;
		item = new Item(1, 'A', 11);  // H2(1, A, 11)
		// item(H2), i1(H1)
		item.salesPrice = 777;
	}
}