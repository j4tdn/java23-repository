package utils;

import java.util.Scanner;

/*
 * khi 1 đoạn code/hàm có thể được sử dụng ở nhiều chỗ
   -> di chuyển hàm đó vào class util(utility)
   -> utility class là class -> có các utility methods được gọi sử dụng ở nhiều chỗ
   -> thường những hàm này chỉ phụ thuộc vào tham số truyền vào
	  --> static, public
	  
   UtilClass -> UtilMethods -> Lấy class gọi, ko cần đối tượng
   
   Mặc định class có public constructor -> vấn new đối tượng được, thừa ko cần
   
   cho private constructor cho util class để không được phép tạo đối tượng
 */
public class IoUtils {

	private static Scanner ip = new Scanner(System.in);

	private IoUtils() {
	}

	public static int input(String variableName, int minInclusive, int maxExclusive) {
		int n = 0;
		String text = "";

		System.out.print("Enter " + variableName + " = ");
		while (true) {
			text = ip.nextLine();
			if (isNumber(text)) {
				n = Integer.parseInt(text);
				if (n >= minInclusive && n < maxExclusive) {
					break;
				}
			}
			System.out.print("Invalid number[" + minInclusive + ", " + maxExclusive + "), please enter again "
					+ variableName + " = ");
		}

		return n;
	}

	public static int input(int maxWrongTimes) {
		System.out.print("Enter N = ");

		String text = "";
		int wrongTimes = 0;

		while (true) {
			text = ip.nextLine();
			if (isNumber(text)) {
				break;
			}
			if (++wrongTimes == maxWrongTimes) {
				System.out.println("--> Wrong times = " + maxWrongTimes + " --> exit");
				System.exit(0);
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
