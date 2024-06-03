package datastructure.object;

import bean.Item;

public class Ex03ObjectTypePassVariableViaMethod {
	
	// JAVA pass by value ( AT STACK)| reference
	/*
	 * Khi truyền 1 biến qua hàm
	 * muốn ra khỏi hàm, cập nhạt được giá trị của biến đó
	 * thì biến đó có yêu cầu phải là kdl đối tượng
	 */
	
	public static void main(String[] args) {
		
		Item i1 = new Item(55, 'Z', 555);
		System.out.println("i1 before -->" + i1);
		modify(i1);
		System.out.println("i1 after -->" + i1);
	}
	private static void modify(Item item) {
		item.salesPrice = 999;
		System.out.println("item address before:  " + System.identityHashCode(item));
		item = new Item(1, 'A', 11);
		item.salesPrice = 777;
		System.out.println("item address after:  " + System.identityHashCode(item));
	}
	
}
