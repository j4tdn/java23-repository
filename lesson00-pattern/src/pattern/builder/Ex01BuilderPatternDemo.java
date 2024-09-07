package pattern.builder;

public class Ex01BuilderPatternDemo {

	/*
	 
	 Design Pattern
	 là tập các mẫu thiết kế giúp mình giải quyết các bài toán cụ thể với giải
	 pháp phù hợp
	 
	 Builder Pattern 
	 là pattern giúp mình tạo ra các đối tượng phức tạp với nhiều thuộc tính (> 4tt)
	 
	 Ví dụ 1: 
	 
	 */
	public static void main(String[] args) {
		// no builder : class, constructor , getter, setter , toString
		
		User u1 = new User(1,"A1",8);
		System.out.println(u1);
	}
}
