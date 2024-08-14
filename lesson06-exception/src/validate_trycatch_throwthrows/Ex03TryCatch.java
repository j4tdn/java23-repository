package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		
		// trong khối try bị exception gì thì catch block nên bắt đúng exception đó
		// catch(e) có thể bắt cho chính nó hoặc con của nó
		
		// khi chưa có try/catch --> gặp exception --> dừng luôn ctrinh
		// int yob = Integer.parseInt(ip.nextLine());
		int yob = 0;
		
		do {
			try {
				yob = Integer.parseInt(ip.nextLine()); // NumberFormatException
				break;
			} catch (NumberFormatException e) { // RuntimeException e = NumberFormatException
				System.out.println("error >> " + e.getMessage());
				// hiển thị chi tiết exception giống như khi không xử lí ngoại lệ
				// e.printStackTrace();
				System.out.println("Please enter a valid number: ");
			}
		} while (true);
		
		int age = Year.now().getValue() - yob + 1;
		System.out.println("===> Your age = " + age);

	}
}
