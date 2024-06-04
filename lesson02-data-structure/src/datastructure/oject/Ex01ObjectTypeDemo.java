package datastructure.oject;

import bean.Item;
// để class này sử dụng class kia 
// Nếu 2 class ở 2 package khác thì phải import  
public class Ex01ObjectTypeDemo {
	public static void main(String[] args) {
		// primitive type : kiểu dữ liệu nguyên thủy
		char v1 = '@';
		int v2 = 44;
		System.out.println("v1 --> " + v1);
		System.out.println("v2  --> " + v2);
		// Lưu ý cứ 1 lần dùng từ khóa new gọi hàm khởi tạo để tạo ra ô nhớ để lưu trữ 1 Item 
		// thì ô nhớ đó luôn có 3 thuộc tính id, name, salesPrice với giá trị mặc định 
		Item i1 = new Item();
		// Với 1 biến là KDL đối tượng 
		// khi ta in biến đó ra tự động gọi hàm toString () trong class Object 
		// Trong Java có class 'Object' --> class cha của tất cả class 
		// Dùng để chứa các hàm có sẵn của Java ví dụ là toString 
		
		System.out.println("i1 id -> " + i1); //bean.Item@6a38e57f 
		System.out.println("i1 --> " + i1.toString()); //  getClass().getName() + '@' + Integer.toHexString(hashCode())
		System.out.println("id i1 --> "  + i1.id);
		System.out.println("name i1 --> " + i1.name );
		System.out.println("salesPrice --> " + i1.salesPrice);
		// Khi new Item tạo 1 đối tượng ( ô nhớ tại HEAP ), đối tượng là 1 thực thể gồm nhiều thông tin bên trong 
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'B';
		i2.salesPrice = 44;
		System.out.println("i2 --> " + i2);
		Item i3 = new Item(33,'B',3);
		System.out.println("i3 --> " + i3);
		
		}
	
	
}
