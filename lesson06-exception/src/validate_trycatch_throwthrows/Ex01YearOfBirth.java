package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth {

	/*
	 * Xử lý ngoại lệ để ctr tiếp tục +Validate: Đảm bảo code thực thi 100% kh bị
	 * exception trc khi gọi +Try/Catch: Bắt exception +Throw/Throws:Ném exception
	 */
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Year of Birth :");
		int yob = Integer.parseInt(ip.nextLine());

		int age = Year.now().getValue() - yob + 1;
		System.out.println("==>Your age" + age);
	}
}
