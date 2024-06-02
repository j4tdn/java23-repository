/*ctrl + D --> xóa 1 dòng
 *ctrl + / --> tạo chú thích 1 dòng 
 *ctrl + shift + / --> tạo chú thích nhiều dòng 
 *ctrl + shift + F --> format code    
 */
package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {

	public static void main(String[] args) {
		System.out.println("Welcome To Java23 Class");
		System.out.println("Today is " + LocalDate.now());
		System.out.println("Weekday this year --> " + LocalDate.now().getDayOfWeek());
		System.out.println("Weekday next year --> " + LocalDate.now().plusYears(1).getDayOfWeek());
		
		System.out.println("==== print star triangle ====");
		printStarTriangle();
		
		System.out.println("==== print star triangle ====");
		printStarTriangle();
		
		printNumberTriangle("==== print number triangle ====");


	}
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
	public static void printNumberTriangle(String prefix) {
		System.out.println("prefix --> " + prefix);
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}
