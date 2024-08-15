package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth {
	
	private static Scanner ip = new Scanner(System.in);
	/*
	 * Exception: là 1 lỗi, ngoại lệ có thể xảy ra tại compile, runtime
	 * Khi bị exception toàn bộ phần chương trình phía sau sẽ ko được thực thi, đồng thời quăng ra thông tin liên quan lỗi đến exception
	 * + Loại exception
	 * + Message
	 * + Dòng gây ra exception
	 * --> xử lý ngoại lệ để chương trình tiếp tục
	 * + Validate: đảm bảo phần code thực thi 100% ko bị exception trước khi gọi
	 * + Try/Catch: Bắt exception
	 * + Throw/thros: ném exception
	 * Mục đích: In thông tin lỗi, chương trình vẫn tiếp tục chạy
	 */
	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		int yob = Integer.parseInt(ip.nextLine());
		
		int age = Year.now().getValue() - yob + 1;
		System.out.println(" ===>  Your age = " + age );
	}
}
