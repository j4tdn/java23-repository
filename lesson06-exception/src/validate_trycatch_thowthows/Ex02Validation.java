package validate_trycatch_thowthows;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {

	private static Scanner ip = new Scanner(System.in);
	/* 
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter year of birth: ");
		
		// validation 
		String text = null;
		do {
			text = ip.nextLine();
			if(isValidNumber(text)) {
				break;
			}
			System.out.println("please enter a valid number: ");
		} while (true);
		
		int yob = Integer.parseInt(text);
		int age = Year.now().getValue() - yob + 1 ;
		System.out.println("===> Your age =  " + age);
}
	private static boolean isValidNumber(String text) {
		return text.matches("\\+d");
	}
}