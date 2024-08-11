package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex01YearOfBirth {

	private static Scanner ip = new Scanner(System.in);
	
	/*
	 Exception:
	 Là 1 lỗi, ngoại lệ có thể xảy ra tại compile, runtime
	 
	 Khi bị exception thì toàn bộ chương trình phía sau sẽ không được thực thi
	 đồng thời quăng ra (JVM) thông tin lỗi liên quan đến exception
	 + Loại exeption
	 + Message
	 + Dòng gây ra exception
	 
	 --> Xử lý ngoại lệ để chương trình tiếp tục
	 + Validate   : Đảm bảo phần code thực thi 100% không bị exception trước khi gọi
	 + Try/Catch  : Bắt exception
	 + Thow/Thows : Ném exception
	 
	 Mục đích: In thông tin lỗi, chương trình phải tiếp tục chạy
	 
	 */
	
	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		int yob = Integer.parseInt(ip.nextLine());
		
		int age = Year.now().getValue() - yob + 1;
		System.out.println("==> Your age = " + age);
		
		/* 
		Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
			at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
			at java.base/java.lang.Integer.parseInt(Integer.java:668)
			at java.base/java.lang.Integer.parseInt(Integer.java:786)
			at validate_trycatch_throwthrows.Ex01YearOfBirth.main(Ex01YearOfBirth.java:22)
				
		*/
	}
	
}
