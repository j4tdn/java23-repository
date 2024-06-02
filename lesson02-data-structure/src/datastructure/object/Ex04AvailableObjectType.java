package datastructure.object;

import bean.Item;

public class Ex04AvailableObjectType {

	public static void main(String[] args) {
		
		// primitive: int, double, char...
		int a = 5;
		double b = 7;
		
		// Object type
		// Custom: Item, Employee, Store...
		// Available: Integer, Double, Character, String, BigDecimal
		
		// Item item1 = 1, 'A', 11; error
		Item item1 = new Item(1, 'A', 11);
		
		// class Integer có 1 thuộc tính (số nguyên) 
		Integer i1 = new Integer(22);
		Integer i2 = 44;
		
		// class Double có 1 thuộc tính (số thực)
		// @deprecated
		Double d1 = new Double(44d);
		Double d2 = 88d;
		
		
		// class String có 1 thuộc tính (chuỗi)
		String s1 = new String("hello"); 	// H1
		String s2 = new String("xin chao"); // H2
		String s3 = new String("hello"); 	// H3
		String s4 = null;

		// destuctor
		String x1 = "java"; // H5
		String x2 = "php";	// H6
		String x3 = "java"; // H5
		x3 = "spring";
		
		// Integer, Double, String --> Immutable class
		// --> 1 thuộc tính
		// HEAP (constant pool)
		// Immutable class là class ở đó khi tạo ra 1 đối tượng, ô nhớ ở heap
		// bên trong ô nhớ đó chứa giá trị của các thuộc tính mà không thể cập nhật thuộc
		// tính trong ô nhớ đó được
		
		// Item --> Mutable class
		// --> 1 hoặc n thuộc tính
		// HEAP
		// Muốn 1 class từ Mutable -> Immutable
		// 1: cho các thuộc tính có access modifier: private
		// 2: thêm từ khóa final để không thể cập nhật giá trị
		
		System.out.println("i1 --> " + i1);
		System.out.println("d1 --> " + d1);
		System.out.println("s1 --> " + s1);
		
		System.out.println("s1 address " + System.identityHashCode(s1));
		System.out.println("s2 address " + System.identityHashCode(s2));
		System.out.println("s3 address " + System.identityHashCode(s3));
		System.out.println("------------------------------------------");
		System.out.println("x1 address " + System.identityHashCode(x1));
		System.out.println("x2 address " + System.identityHashCode(x2));
		System.out.println("x3 address " + System.identityHashCode(x3));
		
		/*
		 Với KDL đối tượng
		 1. Do mình tự tạo ra
		 --> để khởi tạo 1 đối tương, luôn luôn phải gọi hàm khởi tạo, sử dụng từ khóa new
		 
		 2. Có sẵn của Java: Integer, Double, Long, String, Character, Boolean, Byte
		 --> lưu ý: các class này chỉ có duy nhất 1 thuộc tính
		 --> Có 2 cách
		 	 + gọi hàm khởi tạo, sử dụng từ khóa new
				--> lưu trữ ở vùn nhớ HEAP
		 	 	--> luôn tạo ra ô nhớ mới
		 	 + gán giá trị trực tiếp cho biến KDL đối tượng
		 	 	--> lưu trữ ở vùn nhớ HEAP -> constant pool(nới chứa những immutable object)
		 	 	--> kiểm tra xem giá trị cần gán đã chứa trong constant pool chưa
		 	 		+ nếu có rồi --> lấy biến trỏ đến ô nhớ đã có
		 	 		+ nếu chưa có --> tạo ô nhớ mới và lấy biến trỏ đến ô nhớ mới
		 */

	}
	
}
