package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Year of Birth :");

		int yob = 0;

		do {
			try {
				yob = Integer.parseInt(ip.nextLine());
				break;

			} catch (RuntimeException e) {
				System.out.println("erron >>>" + e.getMessage());
				System.out.println("\nPleases enter a valid number");
			}
		} while (true);

		int age = Year.now().getValue() - yob + 1;
		System.out.println("==>Your age" + age);
	}
}