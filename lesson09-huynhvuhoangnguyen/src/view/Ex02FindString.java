package view;

import java.util.Arrays;

public class Ex02FindString {

	public static void main(String[] args) {
		
		String[] s1 = {"01a2b3456cde478"};
		String[] s2 = {"aa6b546c6e22h", "aa6b326c6e22h"};
		System.out.println("Largest number in s1: " + Arrays.toString(getLargestNumbers(s1)));
		System.out.println("Largest number in s2: " + Arrays.toString(getLargestNumbers(s2)));
	}
	
	private static String[] getLargestNumbers(String... ss) {
		int[] largestNumber = new int[ss.length];
		
		for(int i = 0; i < ss.length; i++) {
			largestNumber[i] = extractLargestNumber(ss[i]);
		}
		
		Arrays.sort(largestNumber);
		String[] result = new String[largestNumber.length];
		for(int i = 0; i < largestNumber.length; i++) {
			result[i] = String.valueOf(largestNumber[i]);
		}
		
		return result;
	}
	
	private static int extractLargestNumber(String s) {
		if(s.isEmpty()) {
			return 0;
		}
		
		int maxNumb = 0;
		int currentNumb = 0;
		boolean isFound = false;
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				currentNumb = currentNumb * 10 + (ch - '0');
				isFound = true;
			} else {
				if(isFound) {
					maxNumb = Math.max(maxNumb, currentNumb);
					currentNumb = 0;
					isFound = false;
				}
			}
		}
		
		if(isFound) {
			maxNumb = Math.max(maxNumb, currentNumb);
		}
		return maxNumb;
	}
	
}
