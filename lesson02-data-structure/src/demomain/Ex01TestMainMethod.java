package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {
	public static void main(String[] args) {
		System.out.println("Welcome To Java23 Class");
		System.out.println("Today is: "+LocalDate.now());
		System.out.println("weekday this year -->"+LocalDate.now().getDayOfWeek());
		System.out.println("weekday next year -->"+LocalDate.now().plusYears(1).getDayOfYear());
		System.out.println("== print star triangle ===");
		printStarTriangle();
		System.out.println("== print star triangle ===");
		printStarTriangle();
		System.out.println("== print number triangle ===");
	
		
		printNumberTriangle("== print number triangle ===");
	
	}
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
	}
	
	public static void printNumberTriangle(String prefix) {
		System.out.println("prefix-->"+prefix);
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
	}
}
