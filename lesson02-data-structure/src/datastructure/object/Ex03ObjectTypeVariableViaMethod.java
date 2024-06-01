package datastructure.object;

import bean.Item;

public class Ex03ObjectTypeVariableViaMethod {

	public static void main(String[] args) {
		Item i1 = new Item(55, 'Z', 55);
		System.out.println("i1 before -->" +i1);
		modify(i1);
		System.out.println("i1 after -->" +i1);
		
		// Khi truyền biến qua hàm trong JAVA muốn thay đổi giá trị của biến thì chỉ có thể dùng KDL đối tượng 

	}
	private static void modify(Item item) {
		System.out.println("\n------ Modify -----");
		Item i2 = new Item(2, 'B', 22);
		i2= item;
		item.salesPrice = 999; // --> 55, Z, 999
		System.out.println("i2 -->"+ i2);
		
		item = new Item(1, 'A', 11);
		item.salesPrice = 777; //--> 1, A, 777
		System.out.println("\nitem -->"+ item);

		item = i2;
		i2.id = 888; //--> 888, Z, 999
		System.out.println("\ni2 -->"+ i2);
		System.out.println("------ Modify -----\n");
	}
}
