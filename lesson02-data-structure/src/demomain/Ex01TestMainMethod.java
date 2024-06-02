package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {
	public static void main(String[] args) {
		System.out.println("Welcome To Java23 Class");
		System.out.println("Today is " + LocalDate.now());
		System.out.println("=== print star triangle ===");
		printStarTriangle();
		System.out.println("=== print number triangle ===");
		printNumberTriangle();

	}

//khai báo hàm tên là printStarTriangle
//	có chức năng in ra tam giác ngôi sao 
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}

	// khai báo hàm tên là printNumberTriangle
//	có chức năng in ra tam giác số  
	public static void printNumberTriangle() {
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}
