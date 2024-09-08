package pattern.builder;

public class Ex01BuilderPatternDemo {

	/*
	 
	 Design Pattern: là tập hợp các mẫu thiết kế giúp mình giải quyết các bài toán cụ thể với giải pháp phù hợp
	 Builder Pattern: là pattern giúp mình tạo ra các đối tượng phức tạp với nhiều thuộc tính (>4 thuộc tính)
	 
	 */
	
	public static void main(String[] args) {
		User u1 = new User(1, "A1", 28);
		System.out.println("builder no --> " + u1);
		
	}
	
}
