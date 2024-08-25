package test01.util;

import java.util.Scanner;

public class IOUtils {

	private static Scanner ip = new Scanner(System.in);
	
	private IOUtils() {}
	public static double inputDecimal() {
		int wrongTimes = 0;
		while(true) {
			System.out.println("Nhap so thuc f = ");
			String text = ip.nextLine();
			if (isDecimal(text)) {
				return Double.parseDouble(text);
			}
//			wrongTimes++;
			if(++wrongTimes == 3) {
				System.out.println("So lan sai vuot qua 3 lan, thoat chuong trinh");
				System.exit(0);
			}
		}
	}
	
	// Ham split(pattern)
	// String s = "a-b-c --> s.split("-") ---> [a, b, c]
	
	// 10 -> false --> split("\\.") --> []
	// 10.0 --> false --> split("\\.") --> [0]
	private static boolean isDecimal(String text) {
		String[] units = text.split("\\.");
		
		return units.length == 2 && isNumber(units[0]) && isPositiveNumber(units[1]);
		
	}
	// patter --> [0,9]{1,}
	// text.matches(pattern tra ve true neu cac ky tu trong text thuoc pham vi tu 0-9
	// va so luong ky tu tu` 1 tro len
	private static boolean isNumber(String text) {
		return text.matches("[0-9]{1,}");
	}
	
	private static boolean isPositiveNumber(String text) {
		return isNumber(text) && Integer.parseInt(text) > 0;
	}
}
