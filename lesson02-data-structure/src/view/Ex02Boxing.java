package view;

public class Ex02Boxing {
	public static void main(String[] args) {
		//Boxing, unboxing, Auto-boxing, Auto-unboxing
		//chỉ áp dụng cho KDL đối tượng có sẵn Integer, String, Float, ...
		
		int p1 = 5; //Stack
		
		Integer o1 = 7; //HEAP
		Integer o2 = null;
		
		//Boxing: biến KDL nguyên thuỷ -> KDL đối tượng
		//unboxing: biến KDL đối tượng -> KDL nguyên thuỷ
		
		p1 = o1; //p1 = o1.value (trừ khi o1 = null) -> báo lỗi NullException
		o1 = p1;
		
		System.out.println("p1 " + p1);
		
		//p1 = 02 -> không được vì null không thể gọi hàm intValue
		o2 = p1;
		System.out.println("o2 " + o2);
	}
}
