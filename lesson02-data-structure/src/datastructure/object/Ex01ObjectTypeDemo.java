package datastructure.object;

import bean.Item;

// class này sử dụng class kia
// nếu 2 class khác package thì phải import
public class Ex01ObjectTypeDemo {
	public static void main(String[] args) {
		// primitive type
		char v1 = '@';
		int v2 = 22;
		System.out.println("v1 --> " + v1);
		System.out.println("v2 --> " + v2);
		
		// Với 1 biến là KDL đối tượng
		// Khi mình in biến đó ra tự động gọi hàm toString() trong class Object
		
		// Trong Java có class 'Object' --> class cha của tất cả các classs
		// Dùng để chứa các hàm có sẵn của Java ví dụ là toString
		
		// new Item() -> tạo ra 1 đối tượng cho class Item (OOP)
		// new Item() -> tạo ra 1 ô nhớ để lưu trữ giá trị cho 1 Item
		// đối tượng (ô nhớ tại Heap) --> luôn có đầy đủ thông tin của các thuộc tính bên trong class Item
		
		// object type
		Item i1 = new Item();
		i1.id = 1; // gán id = 1 cho ô nhớ tại HEAP mà i1 đang trỏ đến
		i1.name = 'A';  // gán nam = 'A' cho ô nhớ tại HEAP mà i1 đang trỏ đến
		i1.salesPrice = 11;
		System.out.println("i1 id --> " + i1);  //bean.Item@626b2d4a
		System.out.println("i1 id --> " + i1.id);
		System.out.println("i1 name --> " + i1.name);
		System.out.println("i1 salesPrice --> " + i1.salesPrice);
		System.out.println("i1 id toString --> " + i1.toString()); // getClass().getName() + "@" + Integer.toHexString(hashCode())
	
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'B';
		i2.salesPrice = 22;
		System.out.println("i2 id --> " + i2);
		
		// i3 ở Stack, new Item(...) ở Heap
		Item i3 = new Item(3, 'B', 33);
		System.out.println("i3 id --> " + i3);
	}
}
