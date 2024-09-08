package pattern.builder;

public class Ex01BuilderPatternDemo {

	/*
	 * Design pattern: là tập các mẫu thiết kế giúp giải quyết các bài toán cụ thể
	 * với giải pháp phù hợp
	 * 
	 * Builder Pattern: là pattern giúp tạo ra đối tượng phức tạp với nhiều thuộc
	 * tính (>4 thuộc tính)
	 * 
	 * Vd: LocalDateTime: LocalDate:
	 * 
	 * LocalDateTime ldatetime = new LocalDateTime();
	 * 
	 * Immutable: Không thể thay đổi ở HEAT Mutable: Có thể thay đổi giá trị ở HEAT
	 */

	public static void main(String[] args) {
		// cách 1:
		User u = User.builder()
				.withId(2)
				.withAge(25)
				.withName("abc")
				.build();

		System.out.println("first way builder: " + u);

		// cách 2: of -> Immutable
		User1 u1 = User1.of(1, "acc")
				.id(1)
				.address("ghaha");
		System.out.println("second way builder: " + u1);

		// c3:
		User2 u2 = User2.of(4, "A4");
		System.out.println("u2 --> " + u2);

	}
}
