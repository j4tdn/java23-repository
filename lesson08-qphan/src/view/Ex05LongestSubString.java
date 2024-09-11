package view;

import java.util.Arrays;

public class Ex05LongestSubString {
	
	public static void main(String[] args) {
		// Từng kí tự phải giống nhau tại từng vị trí(chỉ số)
		String s1 = "AB";
		String s2 = "CD";
		
		String[] commonSubStrings = getCommonSubStrings(s1, s2);
		String[] longestCommonSubStrings = getLongestCommonSubStrings(commonSubStrings);
		
		System.out.println("longest common sub strings --> " + Arrays.toString(longestCommonSubStrings));
	}
	
	private static String[] getLongestCommonSubStrings(String[] commonSubStrings) {
		int maxLength = Integer.MIN_VALUE;
		for (String subString: commonSubStrings) {
			if (maxLength < subString.length()) {
				maxLength = subString.length();
			}
		}
		
		String[] result = new String[commonSubStrings.length];
		int count = 0;
		for (String subString: commonSubStrings) {
			if (subString.length() == maxLength) {
				result[count++] = subString;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static String[] getCommonSubStrings(String s1, String s2) {
		int length = Math.min(s1.length(), s2.length());
		String[] result = new String[length];
		int count = 0;
		
		int start = -1;
		for (int i = 0; i < length; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				// Tìm vị trí đầu tiên trùng nhau của chuỗi
				if (!hasFirstDupLetter(start)) {
					start = i;
				}
				if (i == length-1) {
					String commonSubString = s1.substring(start, length);
					result[count++] = commonSubString;
				}
			} else if (hasFirstDupLetter(start)) {
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
