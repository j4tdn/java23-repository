package view;

import java.util.Arrays;

import functional.SortFunction;

public class Ex04 {

	public static void main(String[] args) {
		String[] elements = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };

		// Giảm dần: null, null, xx, c, b, a, 10, 8, 4, -2, -6, Special
		// null first
		sort(elements, (s1, s2) -> {
			if (s1 == null) { // nếu s1 là null thì k đổi
				return -1;
			}
			if (s2 == null) { // s2 null thì đổi
				return 1;
			}
			if ("Special".equals(s1)) { // s1 là Special là đổi
				return 1;
			}
			if ("Special".equals(s2)) { // s2 là Special thì k đổi
				return -1;
			}
			if (isNumber(s1) && isNumber(s2)) { // so sánh 2 số
				return Integer.compare(Integer.parseInt(s2), Integer.parseInt(s1));
			}
			// non-vallue
			return s2.compareTo(s1); // so sánh 2 kí tự
		});

		System.out.println("giảm dần: " + Arrays.toString(elements));

		// Tăng dần: Special, -6, -2, 4, 8, 10, a, b, c, xx, null, null
		// null last
		sort(elements, (s1, s2) -> {
			if (s1 == null) {
				return 1;
			}
			if (s2 == null) {
				return -1;
			}
			if ("Special".equals(s1)) {
				return -1;
			}
			if ("Special".equals(s2)) {
				return 1;
			}
			if (isNumber(s1) && isNumber(s2)) {
				return Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2));
			}
			// non-vallue
			return s1.compareTo(s2);
		});

		System.out.println("Tăng dần: " + Arrays.toString(elements));
	}

	private static boolean isNumber(String element) {
		return element.matches("-?\\d+");
	}

	private static void sort(String[] elements, SortFunction sortFunction) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (sortFunction.Stategy(elements[j], elements[j + 1]) > 0) {
					String temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
	}

}
