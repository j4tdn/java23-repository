package datastructure.object;

//class này sử dụng class kia
//nếu 2 class khác package thì phải import
import bean.Item;

public class Ex01ObjectTypeDemo {
	public static void main(String[] args) {
		char v1= '@';
		int v2=22;
		System.out.println("v1 -->" +v1);
		System.out.println("v2 -->" +v2);
		//Với KDL đối tượng  khi mình in biến đó ra tự động gọi hàm toString() trong class Object
		//Trong JAVA có class 'Object' --. Class cha của tất cả class dùng để chứa các hàm số có sẵn của Java ví dụ là toString
		
		
		//object type
		Item i1 = new Item(); // new Item tạo 1 đối tượng tại ô nhớ HEAP  --> luôn có đầy đủ thông tin của các thuộc tính bên trong class Item	
			i1.id = 1;
			i1.name = 'A';
			i1.salesPrice = 11;
		System.out.println("\ni1 id ->"+i1);//bean.Item@5577140b
		System.out.println("i1 toString -->" + i1.toString()); //getClass.getName() + "@" + Interger.toHexString(hashCode())
		System.out.println("i1 id = "+i1.id);
		System.out.println("i1 name = "+i1.name);
		System.out.println("i1 salesPrice = "+i1.salesPrice);
		
		Item i2 = new Item();
			i2.id = 2;
			i2.name = 'B';
			i2.salesPrice =22;
		System.out.println("\ni2 -->" +i2);

		Item i3 = new Item(3, 'B', 33);
		System.out.println("\ni3 -->" +i3);
		
	}
}
