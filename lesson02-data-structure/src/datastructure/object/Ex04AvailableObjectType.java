package datastructure.object;

import bean.Item;

public class Ex04AvailableObjectType {

	public static void main(String[] args) {

		// primitive: int, double, char ...
		int a = 5;
		double b = 7;

		// object type
		// custom: Item, Employee, Store ...
		// available: Integer, Double, Character, String, BigDecimal, ...

		
		Item item1 = new Item(1, 'A', 11);
		// Item item 1 = 1, 'A', 11; error
		
		// class Integer có 1 thuộc tính (là số nguyên)
		Integer i1 = new Integer(22);
		Integer i2 = 44;
		
		// class Double có 1 thuộc tính (là số thực)
		Double d1 = new Double(44d);
		Double d2 = 88d;
		
		// class String có 1 thuộc tính (là chuỗi)
		String s1 = new String("hello");
		String s2 = new String ("xin chao");
		String s3 = new String ("hello");
		String s4 = null;
		
		//destruction
		
		String x1 = "java";	//H7
		String x2 = "php";	//H8
		String x3 = "java";	//H7
		x3 = "Spring";
		
		String x4 = null;
		
		//Integer, Double, String --> Imutable class
		// --> 1 thuộc tính
		// HEAP(constant pool)
		// Imutable class: là class ở đó khi tạo ra 1 đối tượng, ô nhớ ở HEAP
		// bên trong ô nhớ đó chứa giá trị của các thuộc tính
		// mà ko thể cập nhật giá trị thuộc tính trong ô nhớ đó được
		
		// Item --> Mutable class
		// --> 1 hoặc n thuộc tính
		// HEAP
		// Muốn 1 class từ Mutable -> Imutable
		// 1 -> cho các thuộc tính có access modifier(phạm vi truy cập): private
		// 2 -> thêm từ khóa final để ko thể cập nhật giá trị ?
		
		
		System.out.println("i1 --> " + i1);
		System.out.println("s1 --> " + s1);
		System.out.println("d1 --> " + d1);
		System.out.println("x3 --> " + x3);
		
		System.out.println("s1 address = " + System.identityHashCode(s1));
		System.out.println("s2 address = " + System.identityHashCode(s2));
		System.out.println("s3 address = " + System.identityHashCode(s3));
		System.out.println("\n-------\n");
		System.out.println("x1 address = " + System.identityHashCode(x1));
		System.out.println("x2 address = " + System.identityHashCode(x2));
		System.out.println("x3 address = " + System.identityHashCode(x3));
		
		/*
		 Với KDL đối tượng
		 
		 1. Do mình tự tạo ra
		 --> Để khởi tạo 1 đối tượng, luôn gọi hàm khởi tạo, sử dụng từ khóa new
		 
		 2. Có sẵn của Java: Integer, Double, Long, String, Character, Boolean, Byte, FLoat
		 --> Có 2 cách:
		 	+ C1: Gọi hàm khởi tạo, sử dụng từ khóa new
		 	--> lưu trữ ở vùng nhớ HEAP
		 	--> luôn tạo ra ô nhớ mới
		 	+ C2: Gán giá trị trực tiếp cho biến KDL đối tượng
		 	--> lưu trữ ở vùng h=nhớ HEAP -> constant pool (nơi chứa những immutable object)
		 	--> kiểm tra xem giá trị cần gán đã chứa trong constant pool chưa
		 		- nếu có rồi --> lấy biến trỏ đến ô nhớ đã có
		 		- nếu chưa có --> tạo ô nhớ mới và lấy biến trỏ đến ô nhớ mới đó
		 	
		 --> lưu ý: Các class có sẵn của JAVA chỉ có duy nhất 1 thuộc tính.
		 */
		
	}

}
