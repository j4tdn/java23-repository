package view;

public class Ex02Boxing {
	public static void main(String[] args) {
		// Boxing, Unboxing, Auto-boxing, Auto-unboxing
		// Chỉ áp dụng cho các KDL đối tượng có sẵn của JAVA: Integer, Double, Float,
		// Long, Char

		int p1 = 5; // stack

		Integer o1 = 7; // heap
		Integer o2 = null;
		Integer o3 = null;

		// Từ version của JDK 1.5 --> Hỗ trợ auto-boxing, un-boxing
		// boxing: biến KDL nguyên thủy chuyển thành biến KDL đối tượng
		p1 = o1; // p1 [KDLngthuy] = o1.value [KDLdoitg] (bị lỗi NullPointerException) khi 01
					// đang là NULL
		// unboxing: biến KDL đối tượng chuyển thành biến KDL nguyên thủy
		o1 = p1; // o1.value [KDLdoitg] = p1 [KDLngthuy]

		System.out.println("p1 --> " + p1);
		o3 = p1;
		System.out.println("o3 --> " + o3);
		
		// Integer o3 = null
		// o3 = p1
		// --> Integer o3 = 5;
	}
}
