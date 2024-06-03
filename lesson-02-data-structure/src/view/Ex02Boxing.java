package view;

public class Ex02Boxing {
	public static void main(String[] args) {
		// Boxing || Unboxing } Auto-boxing || Auto-Unboxing
		// Chỉ áp dụng cho các kiểu dữ liệu đối tượng có sẵn của java như là:
			// Integer, Double, Long, Char, Boolean, Float,...
		
		int p1 = 5;
		
		Integer o1 = 7;
//		Integer o2 = null;
		// Từ version JDK 1.5 trở đi --> Hỗ trợ auto-boxing, unboxing
		// boxing: Biến KDL nguyên thuỷ cchuyển thành biến KDL đối tượng 
		// unboxing: Biến KDL đối tượng chuyển thành biến KDL nguyên thuỷ
		p1 = o1; // p1 = o1.value (có thể bị lỗi NullPointerException) khi o1 đang là null
		o1 = p1;
		
		System.out.println("o1 = "+ o1 + ",p1 = "+ p1);
//		p1 = o2;
//		System.out.println("p1 =" + p1);
	}
}
