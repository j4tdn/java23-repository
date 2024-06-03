package datastructure.object;

import bean.Item;

public class Ex04AvailableObjectType {
	
	public static void main(String[] args) {
		
		// primitive : int, double, char,...
		int a = 5;
		double b = 7;

		
		// object typpe:
		// - custom: Item, Employee,...
		// - available: Integer, String, Boolean, BigInteger, BigDecimal,...
		
		Item it1 = new Item(1, 'A', 11);
		// class Integer có 1 thuộc tính (số nguyên)
		Integer i1 = new Integer(11);  // k nen xai, ton bo nho, moi lan tao moi la mat them vung nho'
		Integer i2 = 44; // nen xai, neu cung 1 gia tri duoc tao hai lan thi se dung chung chi 1 vung nho (constant pool)
		
		// class Double có 1 thuộc tính (số thực)
		Double d1 = new Double(44d);
		Double d2 = 88d;
		
		// class String có 1 thuộc tính (chuỗi)
		String s1 = new String("hello");    //H1
		String s2 = new String("xin chao"); //H2
		String s3 = new String("hello");    //H3
		
		String x1 = "java"; //H5
		String x2 = "php";  //H6
		String x3 = "java"; //H5	
		x3 = "spring";
		// Immutable class: là class ở đó khi tạo ra 1 đối tượng, ô nhớ ở heap
		// bên trong ô nhớ đó chứa giá trị của các thuộc tính 
		// mà ko thể cập nhật giá trị thuộc tính trong ô nhớ đó được
		
		System.out.println("s1 address " + System.identityHashCode(s1));
		System.out.println("s2 address " + System.identityHashCode(s2));
		System.out.println("s3 address " + System.identityHashCode(s3));
	
		System.out.println("x1 address " + System.identityHashCode(x1));
		System.out.println("x2 address " + System.identityHashCode(x2));
		System.out.println("x3 address " + System.identityHashCode(x3));
		
		
		
		System.out.println("i1 --> " + i1);
		System.out.println("d1 --> " + d1);
		System.out.println("s1 --> " + s1);
		
		/*
		 * 
		 * Với KDL đối tượng
		 * 1. Do mình tự tạo ra
		 * --> để khởi tạo 1 đối tượng, luôn gọi hàm khởi tạo, sử dụng từ khoá new
		 * 
		 * 2. Có sẵn  của JAVA (Integer, Double, Long, String, Character, Boolean, Byte,...)
		 * --> có 2 cách
		 * 		+ gọi hàm khởi tạo, sử dụng từ khoá new
		 *        --> luôn tạo ra ô nhớ mới 
		 *        --> lưu trữ ở vùng nhớ heap
		 * 		+ gán giá trị trực tiếp cho biến KDL đối tượng
		 *        --> lưu trữ ở vùng nhớ heap --> constant pool(nơi chứa những immutable objects)
		 *        --> b1: kiểm tra xem giá trị cần gán đã chứa trong constant pool chưa
		 *                    + Nếu có rồi -> lấy biến trở đến ô nhớ đó
		 *                    + Nếu chưa có -> tạo ô nhớ mới và lấy biến trỏ vào ô nhớ mới đó
		 * --> lưu ý : các class chỉ có duy nhất 1 thuộc tính  
		 * 
		 */

	}

}
