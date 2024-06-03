package datastructure.object;
 // class này sử dung class kia, 
// nếu 2 class khác package thì phải import
import bean.Item;

public class ObjectTypeDemo {
	public static void main(String[] args) {
		//primitive type
		char v1 = '@';
		int v2 = 22;
		System.out.println(" v1 ----> " + v1);
		System.out.println(" v2 ----> " + v2);
		
		//new Item() -> tạo ra 1 đối tượng cho class Item(OOP)
		// new Item() => tạo ra 1 ô nhớ để lưu trữ giá trị cho 1 item
		// đối tượng( ô nhớ tại heal) luôn có đầy đủ thông tin của các thuộc tính bên trong class
		
		// object type
		Item i1 = new Item();
		i1.id = 101; // gán id = 1 cho o nhớ tại heap mà i1 đang trỏ đến
		i1.name = 'A';
		System.out.println("i1 --> " + i1);
		System.out.println("i1 id = "+ i1.id);
		System.out.println("i1 name= "+ i1.name);
		System.out.println("i1 salePrice = "+ i1.salesPrice);
		Item i2= new Item();
		
		i2.id = 2;
		i2.name = 'B';
		i2.salesPrice = 22;
		
		Item i3 = new Item(3, 'C', 33);
		System.out.println("i3 --> " + i3);
		
	}
}
