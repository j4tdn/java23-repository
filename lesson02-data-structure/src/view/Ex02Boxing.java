package view;

public class Ex02Boxing {
	public static void main(String[] args) {
		// Boxing, Unboxing, Auto-Boxing, Auto-Unboxing
		// Chỉ áp dụng cho cái KDL đối tượng có sẵn của Java như là Integer, Double, String, Long, Char, Boolean, Float
		
		int p1 = 5; // STACK
		Integer o1 = 7; // HEAP
		Integer o2 = null;
		Integer o3 = null;
		
		// Từ version của JDK 1.5 --> Hỗ trợ auto-boxing, un-boxing
		// boxing: biến KDL nguyên thủy chuyển thành KDL đối tượng
		// unboxing: biến KDL đối tượng chuyển thành KDL nguyên thủy
		
		p1 = o1; // p1 = o1.value (bị lỗi NULLPointerException) khi o1 đang là NULL
		o1 = p1; // o1.value = p1
		
		// p1 = o2; // NPE vì o2 null ko thể gọi làm intValue()
		
		// o3 = p1; // ko lỗi
	}
}
