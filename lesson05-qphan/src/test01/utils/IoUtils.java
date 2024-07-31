package test01.utils;

import java.util.Scanner;

public class IoUtils {

	private static Scanner ip = new Scanner(System.in);
	
	private IoUtils() {
	}

	public static double inputDecimal() {
		int wrongTimes = 0;
		while (true) {
			System.out.print("Nhập số thực f = ");
			String text = ip.nextLine();
			if (isDecimal(text)) {
				return Double.parseDouble(text);
			}
			if (++wrongTimes == 3) {
				System.out.println("Số lần sai vượt quá 3 lần --> thoát chương trình");
				System.exit(0);
			}

		}
	}

	private static boolean isDecimal(String text) {
		String[] units = text.split("\\.");
		return units.length == 2 && isNumber(units[0]) && isPositiveNumber(units[1]);
	}

	private static boolean isNumber(String text) {
		return text.matches("[0-9]{1,}");
	}

	private static boolean isPositiveNumber(String text) {
		return isNumber(text) && Integer.parseInt(text) > 0;
	}

}
