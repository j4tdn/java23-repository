package pattern.builder;

public class Ex01BuilderPatternDemo {

	/*
	 
	 Design Pattern: 
	 - Là tập các mẫu thiết kế giúp mình giải quyết các bài toán cụ thể
	 với giải pháp phù hợp
	 
	 Builder Pattern:
	 - là Pattern giúp mình tạo ra các đối tượng phức tạp với nhiều thuộc tính
	 nhiều( >4 thuộc tính)
	 
	 Ví dụ 1:
	 
	 
	 */
	
	public static void main(String[] args) {
		
		// no builder: class, constructor, getter, setter, toString
		User u1 = new User(1, "A1", 28);
		System.out.println("builder no --> " + u1);
		
	}
	
}
