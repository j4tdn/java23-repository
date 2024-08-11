package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter year of birth:  ");
		String text = null;
		do {
			text = sc.nextLine();
			if (isValidNumber(text)) {
				break;
			}
		} while (true);
		int yob = Integer.parseInt(text);

		int age = Year.now().getValue() - yob + 1;
		System.out.println("====> your age: " + age);

	}

	private static boolean isValidNumber(String text) {
		return text.matches("\\+d");

	}
}