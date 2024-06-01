package datastructure.object;

import bean.Item;

public class Ex04AvailableObjectType {

	public static void main(String[] args) {
		//primitive: int, float,...
		
		//available: Integer, Double, Character, String, BigDecimal
		
		//Item item = 1, 'Z'. 11  --> error
		Item item = new Item(1, 'A', 11);
		
		//class Integer có 1 thuộc tính (số nguyên)
		// có dấu gạch là @deprecated (lỗi thời - ko tốt)
		Integer i1 = new Integer(22);
		Integer i2 = 22;
		//class Double có 1 thuộc tính (số thực)
		Double d1 = new Double(44d); 
		Double d2 = 33d;
		//class String có 1 thuộc tính (chuỗi)
		String s1 = new String("hello");
		String s2 = new String("hi");
		String s3 = new String("hello");
		System.out.println("s1 address --> "+ System.identityHashCode(s1));
		System.out.println("s2 address --> "+ System.identityHashCode(s2));
		System.out.println("s3 address --> "+ System.identityHashCode(s3));
		
		System.out.println("--------------------------------");
		
		String x1 = "java";
		String x2 = "php";
		String x3 = "java";
		x3="spring"; //cập nhật giá trị bằng cách gán trực tiếp
		//HEAP (constant pool)
		//Immutable class: là class ở đó khi tạo ra 1 đối tượng, ô nhớ ở heap bên trong ô nhớ đó 
		//chứa giá trị của các thuộc tính mà ko thể cập nhật giá trị thuộc tính trong ô nhớ đó dc
		
		//Item -->Mutable class
		// -->1 hoặc n thuộc tính
		//Muốn 1 class từ Mutable -->Imutable 
		// +1 -> cho các thuộc tính có access modifier: private,..
		// +2 -> thêm từ khóa final để ko thể cập nhật giá trị
		
		
		System.out.println("x1 address --> "+ System.identityHashCode(x1));
		System.out.println("x2 address --> "+ System.identityHashCode(x2));
		System.out.println("x3 address --> "+ System.identityHashCode(x3));
		
		/*
		 Với KDL đối tượng
		 1. Do mình tạo:
		 	--> để khởi tạo đối tượng thì phải gọi hàm khởi tạo, sử dụng từ khóa "new"
		 2. Có sẵn của JAVA: Integer,...
		 	--> class này chỉ có duy  nhất 1 thuộc tính
		 	--> Có 2 cách: 
		 		+ gọi hàm khởi tạo sử dụng từ khóa "new"
		 		 	-->luôn tạo ra ô nhớ mới và lưu trữ ở vùng nhớ HEAP
		 		+ gán trực tiếp giá trị cho biến KDL đối tượng
		 			-->lưu trữ ở vùng nhớ HEAP -->constant pool(nơi chứa những immutable object)
		 			--> kiểm tra xem giá trị cần gán đã chứa trong constant pool chưa
		 				+ nếu có r --> lấy biến trỏ đến ô nhớ đã có
		 				+ nếu chưa có --> tạo ô nhớ mới và lấy biến trỏ đến ô nhớ mới

		 
		 */
		

	}

}
