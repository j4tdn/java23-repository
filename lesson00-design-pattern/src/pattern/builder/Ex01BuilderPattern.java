package pattern.builder;

import java.time.LocalDate;

public class Ex01BuilderPattern {
	/*
	 * 
	 * Design Pattern:
	 * la tap cac mau thiet ke giup minh giai quyet cac bai toan cu the voi giai phap phu hop
	 * 
	 * Builder Pattern: la pattern giup minh tao ra cac doi tuong phuc tap voi nhieu thuoc tinh Nhieu(> 4 thuoc tinh)
	 * 
	 * Vi du 1 : LocalDateTime: day, month, year, hour, minute, second, mls,
	 * 			: dayOfWeek, dayOfMonth, dayOfYear...
	 * --> 19 thuoc tinh
	 * Class binh thuong --> setter (void), getter(...)
	 * 
	 * LocalDateTime ldatetime = new LocalDateTime();
	 * ldatetime.setDay(1);
	 * ldatetime.setMonth(1);
	 * ldatetime.setYear(1);
	 * .....
	 * ldatetime.setSecond(1);
	 * 
	 */
	 
	 // pulic LocalDateTime(int year, int month, int day)
	 // pulic LocalDateTime(int hour, int minute, int second)
	
	// Van de 1: code kha dai, sau khi goi setter xong return void, phai lay doi tuong do qua
	// Van de 2: vi co nhieu thuoc tinh (co the trung KDL)
	//			: k the tao ra cac ham khoi tao co cung so luong tham so, KDL
	public static void main(String[] args) {
		User u = new User(1, "A1", 28); // no builder
		
		System.out.println("builder no -- > " + u);
		System.out.println("builder no -");
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
