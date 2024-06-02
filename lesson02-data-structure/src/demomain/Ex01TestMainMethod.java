package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {
	public static void main(String[] args) {
		System.out.println("Welcome to Java23 Class");
		System.out.println("Today is " + LocalDate.now());
		System.out.println("Weekday this year -->" + LocalDate.now().getDayOfWeek()		);
		System.out.println("Weekday this year -->" + LocalDate.now().plusYears(1).getDayOfWeek());
		
		System.out.println("==== print Triangle ====");
		printStarTriangle();
		
		System.out.println("==== print Triangle ====");
		printStarTriangle();
		
		printNumberTriangle("==== print Triangle ====");
	}
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
	public static void printNumberTriangle(String prefex) {
		System.out.println("prefix -->" + prefex);
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}