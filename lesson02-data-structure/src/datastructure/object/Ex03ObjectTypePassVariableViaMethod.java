package datastructure.object;

import bean.Item;

public class Ex03ObjectTypePassVariableViaMethod {
	
	//Java pass by value (at STACK) | reference 
	
	// Khi truyền 1 biến qua hàm
	// muốn ra khỏi hàn, cập nhật được giá trị của biến đó
	// thì biến đó có yêu cầu phải là KDL đối tượng
	
	public static void main(String[] args) {
		Item i1 = new Item(55, 'Z', 555); //H1(55,Z,555)
		
		System.out.println("i1 before --> " + i1);
		
		modify(i1);
		
		System.out.println("i1 after --> " + i1);
		
	}
	
	//Item item = i1 //item(H2), i1(H1)
//	private static void modify(Item item) { 
//		item.salesPrice = 999; //H1(55,Z,999)
//		item = new Item(1, 'A', 11); //H2(1,A,11)
//		item.salesPrice = 777; //H2(1,A,777)
//	}
	
	private static void modify(Item item) { 
		Item i2 = new Item (2, 'B', 22);
		i2 = item;
		item.salesPrice = 999;
		item = new Item(1, 'A', 11);
		item.salesPrice = 777;
		item = i2;
		i2.id = 888;
	}
}
