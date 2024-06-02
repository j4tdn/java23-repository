package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {
	public static void main(String[] args) {
		System.out.println("Welcome To Java 23 Class");
		System.out.println("Today is " + LocalDate.now());
		
		System.out.println("==print star triangle ==");
		Ex01TestMainMethod.printStarTriangle();
		
		System.out.println("==print star triangle ==");
		Ex01TestMainMethod.printStarTriangle();
		
		System.out.println("==print number triangle ==");
		Ex01TestMainMethod.printNumberTriangle();
	}
	//khai báo 1 hàm printstarTriangle
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
	public static void printNumberTriangle() {
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
}
}
