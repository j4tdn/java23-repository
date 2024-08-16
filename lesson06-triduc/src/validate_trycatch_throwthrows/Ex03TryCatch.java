package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter year of Birth: ");

		// trong try bị exception thì catch block nên bắt đúng exception đó
		// (hoặc exception cha)
		// catch(e) có thể bắt cho chính nó hoặc con của nó.

		// Khi không có try catch -> dừng ctrinh
		int yob = 0;
		do {
			try {
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("error -> " + e.getMessage());
				// nfe.printStackTrace(); hiển thị chi tiết exception như bth.
				System.out.println("Please enter a valid number\n ");
			}
		} while (true);

		int age = Year.now().getValue() - yob + 1;
		System.out.println("=> Your age: " + age);
	}
}
