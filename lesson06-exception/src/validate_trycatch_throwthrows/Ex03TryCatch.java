package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {

	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
			System.out.println("Enter year of birth: ");
			
			// Trong khối try bị exception gì thì catch block nên bắt đúng exception đó hoặc exception cha
			// catch(e) có thể bắt cho chính nó hoặc con của nó
			
			// Khi chưa có try/catch --> gặp exceptuon --> dừng luôn chương trình.
			// int yob = Integer.parseInt(ip.nextLine());
			int yob = 0;
			
			do {
				try {
					yob = Integer.parseInt(ip.nextLine()); // NumberFormatException
					break;
				} catch (NumberFormatException e) {
					System.out.println("Error >> " + e.getMessage());
					// hiển thị chi tiết của exception giống như khi không xử lý ngoại lệ
					// nfe.printStackTrace();
					System.out.println("\nPlease enter a valid number: ");
				}
			} while(true);
			
			
			
			int age = Year.now().getValue() - yob + 1;
			System.out.println("==> Your age = " + age);
	}
	
}
