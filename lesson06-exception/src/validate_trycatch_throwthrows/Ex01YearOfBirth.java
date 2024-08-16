package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth {

	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		int yob = Integer.parseInt(ip.nextLine());
		
		int age = Year.now().getValue() - yob + 1;
		System.out.println("===> Your age = " + age);
	}
}
