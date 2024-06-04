package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {
	
	public static void main(String[] args) {
		System.out.println("Welcome To Java23 Class ");
		System.out.println("Today is" + LocalDate.now());
		System.out.println("===== print number triang");
		printStarTriangle();
	}
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* * ");
		System.out.println("* * * ");
		System.out.println("* * * * ");
		System.out.println("* * * * * ");

	}
}
