package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth {
	
	private static Scanner ip = new Scanner(System.in);
	
	/*
	 
	 Exception: 
	 
	 Là 1 lỗi, ngoại lệ có thể xảy tại compile, runtime
	 
	 Khi bị exception toàn bộ phần chương trình phía sau sẽ không được thực thi
	 đồng thời quăng ra(JVM) thông tin lỗi liên quan đến exception
	 + Loại exception
	 + Message
	 + Dòng gây ra exception
	 
	 --> Xử lý ngoại lệ để chương trình tiếp tục
	 + Validate    : Đảm bảo phần code thực thi 100% ko bị exception trước khi gọi
	 + Try/Catch   : Bắt exception
	 + Throw/Throws: Ném exception
	 
	 Mục đích: In thông tin lỗi, chương trình phải tiếp tục chạy
	 */
	
	public static void main(String[] args) {
		
		System.out.print("Enter year of birth: ");
		int yob = Integer.parseInt(ip.nextLine());
		
		int age = Year.now().getValue() - yob + 1;
		System.out.println("===> Your age = " + age);
	}
}

