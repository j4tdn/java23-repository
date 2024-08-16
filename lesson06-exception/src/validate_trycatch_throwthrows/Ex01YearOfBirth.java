package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth {
	
	private static Scanner ip = new Scanner(System.in);
	/*
	 * Exception :
	 * Là một lỗi, ngoại lệ có thể xảy ra tại compile, runtime
	 * Khi bị exception toàn bộ phần chương trình phía sau sẽ không được thực thi
	 * đồng thời quăng ra thông tin lỗi liên quan đến exception
	 *  + Loại exception
	 *  + Message
	 *  + Dòng gây ra exception
	 * 
	 *  --> Xử lý ngoại lệ để chương trình tiếp tục
	 *  	 + Validate: đảm bảo phần code thực thi không bị exception trước khi gọi
	 *  	 + Try/catch: Bắt exception
	 *  	 + Throw/ Throws: Ném exception
	 *  
	 *   Mục đích: In thông tin lỗi nhưng vẫn tiếp tục chạy
	 */
	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		int yob = Integer.parseInt(ip.nextLine());
		
		int age = Year.now().getValue() - yob+ 1;
		System.out.println("==> your age : " + age);
	}
	
}
