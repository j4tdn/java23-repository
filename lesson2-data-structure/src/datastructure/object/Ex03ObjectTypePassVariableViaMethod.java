package datastructure.object;

import bean.Item;

public class Ex03ObjectTypePassVariableViaMethod {
	
	// JAVA pass by value(AT STACK) | reference
	
	// Khi truyền 1 biến qua hàm
	// muốn ra khỏi hàm, cập nhật dc giá trị của biến đó
	// thì biến đó có yêu cầu phải là KDL đối tượng
	
	public static void main(String[] args) {
		Item i1 = new Item(55, 'Z', 555); // H1(55, Z, 999)
		
		System.out.println("i1 before --> " + i1);
		
		modify(i1);
		
		System.out.println("i1 after --> " + i1);
		
		// i1 id         = 888  2   888
		//    name       = Z    B   B
		//    salesPrice = 999  999 999
	}
	
	// Item item = i1; // item(H2), i1(H1)
	private static void modify(Item item) {
		Item i2 = new Item(2, 'B', 22);
		i2 = item;
		item.salesPrice = 999;
		item = new Item(1, 'A', 11);
		item.salesPrice = 777;
		item = i2;
		i2.id = 888;
	}
}