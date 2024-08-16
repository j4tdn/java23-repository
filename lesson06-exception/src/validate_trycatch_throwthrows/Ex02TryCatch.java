package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex02TryCatch {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		// int yob = Integer.parseInt(ip.nextLine());

		int yob = 0;
		do {
			try {

				yob = Integer.parseInt(ip.nextLine());
				System.out.println("Testing ...");
				break;
			} catch (RuntimeException e) {
				System.out.println("error >>" + e.getMessage());
				// nfe.printStackTrace();
				System.out.println("Please enter a valid number: ");
			}
		} while (true);

		int age = Year.now().getValue() - yob + 1;
		System.out.println("===> Your age = " + age);
	}
}
