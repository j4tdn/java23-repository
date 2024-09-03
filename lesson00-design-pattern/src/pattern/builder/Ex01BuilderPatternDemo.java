package pattern.builder;

import java.time.LocalDate;

public class Ex01BuilderPatternDemo {
	
	/*
	  Desing Pattern:
	  là tập các mẫu thiết kế giúp mình giải quyết các bài toán cụ thể phù hợp vs giải pháp
	  
	 
	  Builder Pattern
	  là pattern giúp mình tạo ra các đối tượng phức tạp tạo ra nhiều thuộc tính(> 4 thuộc tính)
	  
	  Ví dụ 1 : LocalDateTime:day, month, year,hour,minute,second,mls
	  						 :dayofWeek,dayOfMonth,dayOfYear ..
	  			-->10 thuộc tính
	  			
	  	class bth -->setter(void),getter(..)		
	  
	  LocalDateTime ldatetime = new LocalDateTime();
	  ldatetime.seDay(1);
	  ....
	  ldatetime.setYear(1);
	   public LocalDateTime(int year,int month,int day)
	   public LocalDateTime(int hour,int minute,int second)
	   public LocalDateTime(int year,int month,int day,int hour,int minute,int second)
	  
	  Vấn đề 1:code khá dài, sau khi gọi setter xong return void,
	  Vấn đề 2: vì có khá nhiều thuộc tính(có thể trùng KDl)
	  		  :ko thể tạo ra các hàm khỏi tạo có cùng số lượng tham sô, kdl
	 */
	
	
	public static void main(String[] args) {
		// no builder : class, constructor, getter,setter,tótring
		User u = new User(1,"A1",28);// no builder
		System.out.println("builder no -->"+u);
		
		System.out.println("\n");
		
		User1 u1= User1.builder() //Builder
				.withId(2)
				.withName("A2")
				.withAge(30)
				.build();
		System.out.println("builder 1st way (using class Builder)"+u1);
		
		
		
		System.out.println("\n");
		User2 u2 = User2.of(3,"A3")//H1
				.withId(1) //H1
				.withAddress("Da Nang");
//				.withStartedDate(LocalDate.now());
		System.out.println("builder 2nd way (custom)-->"+u2);
		
//		LocalDate ldate = LocalDate.of(2020,2 ,2 );
		
		System.out.println("u2(address--->)"+u2);
		
		u2.withStartedDate(LocalDate.now());
		System.out.println("u2 value after"+u2);
		System.out.println("u2(address)after --->)"+System.identityHashCode(u2));
		
		User3 u3 = User3.of(4, "A4");//H1
		System.out.println("u3 --->"+u3);
		System.out.println("u3 --->"+System.identityHashCode(u3));
		
		User3 newU3= u3.withAge(40);
		System.out.println("u3 value new "+newU3);
		System.out.println("u3 --->"+System.identityHashCode(newU3));
	}
}
