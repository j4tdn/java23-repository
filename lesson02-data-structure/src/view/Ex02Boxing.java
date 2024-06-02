package view;

public class Ex02Boxing {

	public static void main(String[] args) {
//		Boxing, Unboxing, Auto-boxing, Auto-Unboxing
//		Chỉ áp dụng cho các KDL đối tượng có sẵn của JAVA:Integer, Double, Float, Long, Char
		
		
		int p1 = 5; //ở stack, KDL nguyên thủy
		
		Integer o1 = 7; // ở HEAP,KDL đối tượng
		
// Từ version cuar 
		p1 = o1;
		o1 = p1;
	}
}
