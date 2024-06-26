package datastructure.object;

import bean.Item;

public class Ex04AvailableObjectType {
	public static void main(String[] args) {
		
		// primitive: int, double, char ...
		int a = 5;
		double b =7;
		
		// object type
		// custom: Item, Employee, Store ...
		// Available: Integer, Double, Character, String, BigDecimal
		
		Item item1 = new Item(1, 'A', 11);
		
		// class Integer có 1 thuộc tính (là số nguyên)
		Integer i1 = new Integer(22);
		Integer i2 = 44;
		
		// class Double có 1 thuộc tính (là số thực)
		Double d1 = new Double(44d);
		Double d2 = 88d;
		
		// class String có 1 thuộc tính (chuỗi)
		String s1 = new String("Hello");
		String s2 = new String("Xin chào");
		String s3 = new String("Hello");
		
		String x4 = null;
		
		// destructor
		String x1 = "java"; // vd H7
		String x2 = "php";	// vd H8
		String x3 = "java";	// H7
		x3 = "spring";
		
		// Integer, Double, String --> Immutable class
		// --> 1 thuộc tính
		// HEAP(constant pool)
		// Immutable class: là class ở đó khi tạo ra 1 đối tuowjgn, 1 ô nhớ ở HEAP
		// Bên trong ô nhớ đó chứa giá trị của các thuộc tính
		// mà ko thể cập nhật giá trị thuộc tính trong ô nhớ đó được
		
		// Item --> Mutable class
		// --> 1 hoặc nhiều thuộc tính
		// HEAP
		// muốn 1 class từ Mutable thành Immutable
		// 1 -> cho các thuộc tính có access modified: private
		// 2 -> thêm từ khóa final để ko thể cập nhật giá trị ?
		
		System.out.println("i1 -> " + i1);
		System.out.println("s1 -> " + s1);
		System.out.println("d1 -> " + d1);
		
		/*     	NOTE
		 Với KDL đối tượng
		 
		 1. Do mình tạo ra
		 --> Để khởi tạo 1 đối tượng, luôn gọi hàm khởi tạo, sử dụng từ khóa new
		 
		 2. Có sẵn của Java
		 --> Lưu ý: các class này, class của nó chỉ có 1 thuộc tính
		 --> Có 2 cách:
		 	+ Gọi hàm khởi tạo, sử dụng từ khóa new
		 		--> luôn tạo ra ô nhớ mới
		 		--> lưu ở vùng nhớ HEAP
		 	+ Gán giá trị trực tiếp cho biến KDL đối tượng
		 		--> lưu ở vùng nhớ HEAP -> constant pool (nơi chứa những immutable objects)
		 		--> b1: kiểm tra xem giá trị cần gán đã chứa trong constant pool chưa
		 			+ nếu có rồi --> lấy biến trỏ đến ô nhớ đã có
		 			+ nếu chưa có --> tạo ô nhớ mới và lấy biến trỏ đến ô nhớ mới
		 */
	}
}