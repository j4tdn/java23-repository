package view;

public class Ex02Boxing {

	public static void main(String[] args) {
		// Boxing, UnBoxing, Auto-boxing, Auto-Unboxing
		// Chỉ áp dụng cho các KDL đối tượng có sẵn của Java: Integer, Double, Float, Long, Char
		
		int p1 = 5; // stack
		
		Integer o1 = 7; // heap
		Integer o2 = null;
		Integer o3 = null;
		
		// Từ version JDK 1.5 --> hỗ trợ auto-boxing, un-boxing
		// Boxing: biến KDL nguyên thủy chuyển thành biến KDL đối tượng
		// Unboxing: biến KDL đối tượng chuyên thành biến KDL nguyên thủy
		p1 = o1; // p1 = o1.value(o1.intValue()) (bị lỗi NullPointerException khi o1 đang là NULL)
		o1 = p1; // o1.value = p1
		
		System.out.println("p1 --> " + p1);
		// p1 = o2; // NPE vì o2 null không thể gọi hàm intValue
		o3 = p1;
		System.out.println("o3 --> " + o3);
		
		// Interger o3 = null
		// o3 = p1
		// --> Integer o3 = 5;
		
	}
	
}
