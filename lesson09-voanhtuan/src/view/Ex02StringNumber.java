package view;

import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Ex02StringNumber {

	public static void main(String[] args) {
		String[] ip1 = { "01a2b3456cde478" };
		System.out.println("Xâu 1: " + String.join(", ", ip1));
		String[] result1 = getLargestNumbers(ip1);
		System.out.println("Kết quả: " + String.join(", ", result1));

		String[] ip2 = { "aa6b546c6e22h", "aa6b326c6e22h" };
		System.out.println("Xâu 2: " + String.join(", ", ip2));
		String[] result2 = getLargestNumbers(ip2);
		System.out.println("Kết quả 2: " + String.join(", ", result2));
	}
	
	public static String[] getLargestNumbers(String... ss) {
		List<Integer> largestNumbers = new ArrayList<>();

		for (String s : ss) {
			if (s == null || s.isEmpty()) {
				largestNumbers.add(0);
			} else {
				Matcher matcher = Pattern.compile("\\d+").matcher(s);
				int maxNum = 0;

				while (matcher.find()) {
					int num = Integer.parseInt(matcher.group());
					if (num > maxNum) {
						maxNum = num;
					}
				}

				largestNumbers.add(maxNum);
			}
		}

		largestNumbers = largestNumbers.stream().sorted().collect(Collectors.toList());

		return largestNumbers.stream().map(String::valueOf).toArray(String[]::new);
	}

}
