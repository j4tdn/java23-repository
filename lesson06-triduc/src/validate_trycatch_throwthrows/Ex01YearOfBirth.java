package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth {

	private static Scanner ip = new Scanner(System.in);

	/*
	 * Là 1 lỗi, ngoại lệ tại compile or runtime.
	 * 
	 * Khi bị exception -> báo lỗi, dừng ctrinh tại ngay đó
	 * 
	 * Xử lý exception để ctrinh vẫn chạy
	 *
	 * -> Validate: đảm bảo code thực thi 100% không bị exception
	 * -> Try/catch: bắt exception
	 * -> Throw/throws: ném exception
	 * 
	 * Mục đích: tiếp tục chạy, in thông tin lỗi/ yêu cầu ngdung nhập lại ...
	 */

	public static void main(String[] args) {
		System.out.println("Enter year of Birth");
		int yob = Integer.parseInt(ip.nextLine());

		int age = Year.now().getValue() - yob + 1;

		System.out.println("=> Your age: " + age);
	}
}
