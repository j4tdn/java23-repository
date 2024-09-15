package exam;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {

	public static String[] getLargestNumbers(String... ss) {
		String[] results = new String[ss.length];
		for (int i = 0; i < ss.length; i++) {
			Matcher matcher = Pattern.compile("\\d+").matcher(ss[i]);
			int maxNumber = 0;

			while (matcher.find()) {
				int currentNumber = Integer.parseInt(matcher.group());
				if (currentNumber > maxNumber) {
					maxNumber = currentNumber;
				}
			}
			results[i] = String.valueOf(maxNumber);
		}
		Arrays.sort(results);
		return results;
	}

	public static void main(String[] args) {
		String[] input = {"01a2b3456cde478","aa6b546c6e22h","aa6b326c6e22h"};
		String[] largestNumbers = getLargestNumbers(input);
		System.out.println("Kết quả -->"+Arrays.toString(largestNumbers)); 
	}
}
