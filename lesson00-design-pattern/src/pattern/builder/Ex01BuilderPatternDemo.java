package pattern.builder;

import java.time.LocalDate;

public class Ex01BuilderPatternDemo {
	
	/*
	 
	 Design Pattern: 
	 là tập các mẫu thiết kế giúp mình giải quyết các bài toán cụ thể
	 với giải pháp phù hợp
	 
	 Builder Pattern
	 là pattern giúp mình tạo ra các đối tượng phức tạp với nhiều thuộc tính
	 nhiều(> 4 thuộc tính)
	 
	 Ví dụ 1: LocalDateTime: day, month, year, hour, minute, second, mls, 
	                       : dayOfWeek, dayOfMonth, dayOfYear ...
	 
	 --> 10 thuộc tính
	 
	 class bình thường --> setter(void), getter(...)
	 
	 LocalDateTime ldatetime = new LocalDateTime();
	 ldatetime.setDay(1);
	 ldatetime.setMonth(1);
	 ldatetime.setYear(1);
	 ...
	 ldatetime.setSecond(1);
	 
	 // public LocalDateTime(int year, int month, int day)
	 // public LocalDateTime(int hour, int minute, int second)
	 // public LocalDateTime(int year, int month, int day, int hour, int minute, int second)
	 
	 Vấn đề 1: code khá dài, sau khi gọi setter xong return void, phải lấy đối tượng đó . qua hàm mới
	 Vấn đề 2: vì có nhiều thuộc tính(có thể trùng KDL)
	         : ko thể tạo ra các hàm khởi tạo có cùng số lượng tham số, KDL
	 */
	
	public static void main(String[] args) {
		// no builder: class, constructor, getter, setter, toString
		User u = new User(1, "A1", 28); 
		System.out.println("builder no --> " + u);
		
		System.out.println("\n");
		
		User1 u1 = User1.builder(2) // Builder
				//.withId(2) // Builder
				.withAge(30) // Builder
				.withName("A2") // Builder
				.build();
		System.out.println("builder 1st way(using class Builder) --> " + u1);
	
		System.out.println("\n");
		
		User2 u2 = User2.of(3, "A3") // H1
				.address("Da Nang"); // H1
		System.out.println("builder 2nd way(custom) --> " + u2);
		System.out.println("u2(address) --> " + System.identityHashCode(u2));
		
		u2.startedDate(LocalDate.now());
		System.out.println("u2 value after --> " + u2);
		System.out.println("u2(address) after --> " + System.identityHashCode(u2));
		
		System.out.println("\n");
		
		User3 u3 = User3.of(4, "A4"); // H1
		System.out.println("u3 value --> " + u3);
		System.out.println("u3 address --> " + System.identityHashCode(u3));
		
		User3 newU3 = u3.age(40);
		System.out.println("u3 value new --> " + newU3);
		System.out.println("u3 value new address --> " + System.identityHashCode(newU3));
		
	}
	
}