package test01.utils;

import java.util.Scanner;

public class IoUtils {

	private static Scanner ip = new Scanner(System.in);
	
	public IoUtils() {
	}
	
	public static double inputDecimal() {
		int wrongTimes = 0;
		while (true) {
			System.out.println("Nhập số thực F = ");
			String text = ip.nextLine();
			if (isDecimal(text)) {
				return Double.parseDouble(text);
			}
			if (++wrongTimes == 3) {
				System.out.println("Số lần sau vượt quá 3 lần --> Thoát chương trình");
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