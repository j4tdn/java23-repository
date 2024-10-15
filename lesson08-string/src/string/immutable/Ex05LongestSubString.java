package string.immutable;

import java.util.Arrays;

public class Ex05LongestSubString {
	public static void main(String[] args) {
		// Từng kí tự giống nhau tại từng vị trí
		String s1 = "ABCDEABBC";
		String s2 = "ABCDECBBCK";
		
		System.out.println(Arrays.toString(getLongestCommonSubString(s1, s2)));
	}
	
	private static String[] getLongestCommonSubString(String s1, String s2) {
		int length = s1.length() < s2.length() ? s1.length() : s2.length();

		String[] result = new String[length];
		int count = 0;

		int start = -1;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				// vị trí đầu tiên trong chuỗi
				if (!hasFirstDupLetter(start)) {
					start = i;
				}
				if (i == length - 1) {
					String commonSubString = s1.substring(start, length);
					result[count++] = commonSubString;
				}
			} else if (start != -1) {
				String commonSubString = s1.substring(start, i);
				result[count++] = commonSubString;
				start = -1;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}

	private static boolean hasFirstDupLetter(int start) {
		return start != -1;
	}
}
