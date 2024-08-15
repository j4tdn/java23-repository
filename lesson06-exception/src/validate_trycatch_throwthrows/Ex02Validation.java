package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		
		// validation
		
		String text = null;
		do {
			text = ip.nextLine();
			if (isValidNumber(text)) {
				break;
			}
			System.out.println("Please enter a valid number: ");
		} while(true);
		
		// make sure text is valid before parseInt
		int yob = Integer.parseInt(ip.nextLine());
		
		int age = Year.now().getValue() - yob + 1;
		System.out.println(" ===>  Your age = " + age );
	}
	
	private static boolean isValidNumber (String text) {
		return text.matches("\\d+");
	}
}
