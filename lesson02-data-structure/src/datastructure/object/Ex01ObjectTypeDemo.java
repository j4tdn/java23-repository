package datastructure.object;

import bean.Item;

public class Ex01ObjectTypeDemo {
	public static void main(String[] args) {
		//primitive type
		char v1 = '@';
		int v2 = 333;
		
		//object type: -> lưu vào HEAP
		Item  i1 = new Item();
		i1.id = 3;
		System.out.println("print id: " + i1.id);
		
		Item i2 = new Item(3,"Hong bit", 33);
		System.out.println("i2 ->" + i2); //gọi hàm toString()
	}
}
