package utils;

import java.util.Scanner;

/* 
 * khi 1 đoạn code/ hàm có thể đc sử dụng ở nhiều chỗ, di chuyển hàm đó vào class util(utility)
 
   utility class -> có các utility methods đc gọi sử dựng ở nhiều chỗ	
   thường những hàm này chỉ phụ thuộc vào tham số truyền vào
   --> static, public
   
   UtilClass -> UtilMethods -> Lấy class gọi, ko cần đối tượng
   
   MẶc định class có public constructor -> vẫn new đối tượng đc, thừa ko cần, cho private constructor cho util class để ko đc phép tạo đối tượng
*/
public class IoUtils {
	
	private static Scanner ip = new Scanner(System.in);
	
	private IoUtils() {
	}
	
	public static int input(int maxWrongTimes) {	
		System.out.println("Enter N = ");
		
		String text = "";
		int wrongTimes = 0; 
		
		while (true) {
			text = ip.nextLine();
			if (isNumber(text)) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == maxWrongTimes) {
				System.out.println("--> Wrong times = " + maxWrongTimes + " --> exit");
				System.exit(0); // thoát chương trình
			}
			System.out.print("Invalid number(" + wrongTimes + " time(s)), enter again N = ");
		}
		
		return Integer.parseInt(text);
	}
	
	private static boolean isNumber(String text) {
		if (text == null || text.isEmpty()) {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}
