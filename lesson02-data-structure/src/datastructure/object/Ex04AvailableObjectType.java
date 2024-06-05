package datastructure.object;

import javax.sql.rowset.serial.SQLOutputImpl;

import bean.Item;

public class Ex04AvailableObjectType {
	
	public static void main(String[] args) {
		
		// primitive: int, double, char ...
		int a = 5;
		double b = 7;
		
		// object type
		// custom: Item, Employee, Store ...
		// available: Integer, Double, Character, String, BigDecimal
		
		// Item item1 = 1,'A',11; --> error
		Item item1 = new Item(1,'A',11);
		
		// class Integer có 1 thuộc tính (số nguyên)
		Integer i1 = new Integer(22);
		Integer i2 = 44;
		
		// class Double có 1 thuộc tính (số thực)
		// @deprecated
		Double d1 = new Double(44d);
		Double d2 = 88d;
		
		// class String có 1 thuộc tính (chuỗi)
		String s1 = new String("Hello");
		String s2 = new String("Xin chào");
		String s3 = new String("hello");
		String s4 = null;
		
		
		// destructor
		
		String x1 = "java";
		String x2 = "php";
		String x3 = "java";
		
		// Integer, Double, String --> Immutable class
		// --> 1 thuộc tính
		// HEAP (constant pool)
		
		// Immutable class --> Là class, ở đó khi tjao ra 1 đối tượng, ô nhớ ở HEAP
		// bên trong ô nhớ đó chứa giá trị thuộc tính trong ô nhớ đó được
		// mà không thể cập nhật giá trị thuộc tính trong ô nhớ đó được
		
		// Item --> Mutable class
		// --> 1 hoặc n thuộc tính
		// HEAP
		// muốn 1 cái class từ Mutable --> Immutable
		// 1 -> cho các thuộc tính có access modifier: private
		// 2 -> thêm từ khóa final để kh thể cập nhật giá trị ?????????
		
		
		System.out.println("s1 address " + System.identityHashCode(s1));
		System.out.println("s2 address " + System.identityHashCode(s2));
		System.out.println("s3 address " + System.identityHashCode(s3));
		System.out.println("s4 address " + System.identityHashCode(s4));
		
		System.out.println("------------------");
		
		System.out.println("x1 address " + System.identityHashCode(x1));
		System.out.println("x2 address " + System.identityHashCode(x2));
		System.out.println("x3 address " + System.identityHashCode(x3));
		
		
		System.out.println("i1 --> " + i1);
		System.out.println("d1 --> " + d1);
		System.out.println("s1 --> " + s1);
		
		/*
		 
		 Với KDL đối tượng
		 
		 1. Do mình tự tạo ra
		 --> để khởi tjao 1 dối tượng, luôn gọi hàm khởi tạo, sử dụng từ khóa new
		 
		 2. Có sẵn của Java: Integer, Double, Long, String, Character, Boolean, Byte
		  *Lưu ý --> Các class này, class của nó chỉ có duy nhất 1 thuộc tính
		  
		 - Có 2 cách
		 	+ Gọi hàm khởi tạo, sử dụng từ khóa new
		 		--> Luôn tạo ra ô nhớ mới
		 		--> Lưu trữ ở vùng nhớ HEAP 
		 	+ Gán giá trị trực tiếp cho biến KDL đối tượng
		 		--> lưu trữ ở vùng nhớ HEAP
		 		--> constant pool(nơi chứa những immutable object) - vùng nhớ đặc biệt trong HEAP
		 		--> kiểm tra xem giá trị cần gán đã chứa trong constant pool chưa?
		 			+ Nếu có rồi --> lấy biến trỏ đến ô nhớ đã có
		 			+ Nếu chưa có --> tạo ô nhớ mới và lấy biến trỏ đến ô nhớ mới đó 
		 			
		 */
		
		
	}
}
