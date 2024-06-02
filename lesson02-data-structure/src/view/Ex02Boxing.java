package view;

public class Ex02Boxing {
	public static void main(String[] args) {
		// Boxing, Unboxing, Auto-boxing, Auto-Unboxing
		// Chỉ áp dụng cho các KDL đối tượng có sẵn của Java: Integer, Double, Float, Long ,Char
		
	int p1 = 5; //stack
	
	Integer o1 = 7;//heap
	Integer o2 = null;
	Integer o3 = null;
	
	// Từ version của JDK 1.5 --> Hỗ trợ auto-boxing, un-boxing
	// boxing: biến KDL nguyên thủy chuyển thành biến KDL đối tượng
	// unboxing:biến KDL đối tượng chuyển thành biến KDL nguyên thủy
	p1 = o1; // p1 = o1.value(o1.intValue()) (bị lỗi NullPointerException) khi o1 đang là NULL
	o1 = p1; // o1.value = p1
	
	System.out.println("p1 -->" + p1);
	
	// p1 = o2; // NPE vì o2 null ko thể gọi hàm intValue
	o3 = p1;
	System.out.println("o3 -->" + o3);
	
	// Integer o3 = null
	// o3 = p1
	// --> Integer o3 = 5;
	}
}
