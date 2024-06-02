package datastructure.object;

import bean.Item;

public class Ex03ObjectTypePassVariableViaMethod {
	
	// JAVA pass by value (AT STACK) | reference
	
	// Khi truyền một biến qua hàm
	// muốn ra khỏi hàm, cập nhật được giá trị của biến đó
	// thì biến đó có yêu cầu phải là KDL đối tượng

	public static void main(String[] args) {
		Item i1 = new Item(55, 'Z', 555); // H1(55, Z, 999)
		
		System.out.println("i1 before --> " + i1);
		
		modify(i1);
		
		System.out.println("i1 after --> " + i1);
		// i1 id         = 55
		//	  name       = Z
		//	  salesPrice = 999
	}
	
	// Item item = i1; // item(H1), i1(H1)
	private static void modify(Item item) {
		Item i2 = new Item(2, 'B', 22); // H3
		i2 = item;
		item.salesPrice = 999;
		item = new Item(1, 'A', 11); // H2(1, A, 777)
		item .salesPrice = 777;
		item = i2; // H1
		i2.id = 888;
	}
}
