package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex04 {

	
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };

		// tăng dần
		Arrays.sort(strings, (s1, s2) -> compareAscending(s1, s2));
		System.out.println("Tăng dần: " + Arrays.toString(strings));

		// giảm dần
//		Arrays.sort(strings, (s1, s2) -> compareDescending(s1, s2));
		System.out.println("Giảm dần: " + Arrays.toString(strings));
	}

	public static int compareAscending(String s1, String s2) {
		if (s1 == null)
			return 1;
		if (s2 == null)
			return -1;
		if (s1.equals("Special"))
			return -1;
		if (s2.equals("Special"))
			return 1;

		boolean isNum1 = isNumeric(s1), isNum2 = isNumeric(s2);
		if (isNum1 && isNum2)
			return Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2));
		if (isNum1)
			return s1.startsWith("-") ? -1 : 1;
		if (isNum2)
			return s2.startsWith("-") ? 1 : -1;

		return s1.compareTo(s2);
	}

	//Chưa fix đc còn lỗi
//	public static int compareDescending(String s1, String s2) {
//		if (s1 == null)
//			return -1;
//		if (s2 == null)
//			return 1;
//		if (s1.equals("Special"))
//			return 1;
//		if (s2.equals("Special"))
//			return -1;
//
//		boolean isNum1 = isNumeric(s1), isNum2 = isNumeric(s2);
//		if (isNum1 && isNum2)
//			return Integer.compare(Integer.parseInt(s2), Integer.parseInt(s1));
//		if (isNum1)
//			return s1.startsWith("-") ? 1 : -1;
//		if (isNum2)
//			return s2.startsWith("-") ? -1 : 1;
//
//		return s2.compareTo(s1);
//	}

	private static boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}