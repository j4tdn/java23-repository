package validate_trycatch_throwthrows;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		
		//trong khối try bị exception gì thì catch block nên bắt đúng exception đó hoặc
		// exception cha
		// catch(e) có thể bắt cho chính nó hoặc con của nó
		
		
		// khi chưa có try/catch --> gặp exception --> dừng lun ctr
		//int yob = Integer.parseInt(ip.nextLine()); // lỗi
		int yob = 0;
		do {
			try {
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (RuntimeException e) {
				System.out.println("nfe >> " + e.getMessage());
				//nfe.printStackTrace(); //hiện thị chi tiết exception giống như ko xử lý ngoại lệ
				System.out.println("\nPlease enter a valid number : ");
			}
		} while (true);
		
		
		int age = Year.now().getValue() - yob + 1;
		System.out.println(" ===>  Your age = " + age );
	}
}
