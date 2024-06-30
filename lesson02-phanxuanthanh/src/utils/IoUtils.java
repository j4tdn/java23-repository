package utils;

import java.util.Scanner;

/*
khi 1 đoạn code/ hàm có thể được sử dụng ở nhiều chỗ
-> di chuyển hàm đó vào class util(utility)
-> utility class là class -> có các utility methods được gọi sử dụng ở nhiều chỗ
-> thường những hàm này chỉ phụ thuộc vào tham số truyền vào
	--> static, public
	
	UtilClass -> UtilMethods -> lấy class gọi, không cần đối tượng
	
	Mặc định class có public constructor -> vẫn new đối tượng được, thừa ko cần
	
	cho private constructor class util để không được phép gọi đối tượng
*/

public class IoUtils {
	
	private static Scanner ip = new Scanner(System.in);
	
	private IoUtils() {
	}

	public static int input(int maxWrongTimes) {
		System.out.println("Enter N = ");

		String text = "";
		int worryTimes = 0;
		while (true) {
			text = ip.nextLine();
			if (isNumber(text)) {
				break;
			}
			if (++worryTimes == maxWrongTimes) {
				System.out.println("--> Wrong Times = " + maxWrongTimes +" --> exit");
				System.exit(0);
			}
			System.out.println("Invalid number(" + worryTimes + " time(s), enter again N = ");
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
