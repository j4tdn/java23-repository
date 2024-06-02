package demomain;

import java.time.LocalDateTime;

public class Ex01TestMainMethod {

	/*
	 ------ COMMENT -----
	 -->special method: main  là nơi bắt đầu và kết thúc của 1 chương trình
	 
	 Phím tắt
	 + ctrl d --> Xóa 1 dòng
	 + ctrl shift / tạo chú thích nhiều dòng
	 + run ctrl f11
	 + ctrl shift f --> format code
	 */
	public static void main(String[] args) 
	{
		System.out.println("Welcome To Java23 Class");
		System.out.println("Today is" + LocalDateTime.now());
		
		System.out.println("Weekday next year -->" +LocalDateTime.now().getDayOfWeek());
		System.out.println("Weekday next year -->" +LocalDateTime.now().plusYears(1).getDayOfWeek());
		
		System.out.println("==print star triangle ==");
		Ex01TestMainMethod.printStarTriangle();
		
		System.out.println("==print number triangle ==");
		printNumberTriangle();
		
	}

	public static void printStarTriangle() {
		System.out.println("\n==== Print Star Triangle ====");
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * * ");
		System.out.println("* * * *");
		System.out.println("* * * * *");
		
	}
	
	public static void printNumberTriangle() {
		System.out.println("\n==== Print Star Triangle ====");
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3 ");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
		
	}
}
