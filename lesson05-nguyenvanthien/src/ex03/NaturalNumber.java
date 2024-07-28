package ex03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NaturalNumber {

	public static int getMaxValidNumber(String input) {
		/*
		  (20đ): Tìm số tự nhiên hợp lệ lớn nhất trong chuỗi. Biết rằng chuỗi chỉ gồm
		  các ký tự số và chữ cái không dấu. Ví dụ ▪ 12abu02muzk586cyx → 586 ▪
		  Uyk892nn1234uxo2 → 1234
		 */
		String regex = "\\d+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		int maxCompositeNumber = -1;

		while (matcher.find()) {
			int number = Integer.parseInt(matcher.group());
			if (isComposite(number) && number > maxCompositeNumber) {
				maxCompositeNumber = number;
			}
		}
		return maxCompositeNumber;
	}

	private static boolean isComposite(int num) {
		if (num < 4) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(getMaxValidNumber("12abu02muzk586cyx"));
		System.out.println(getMaxValidNumber("uyk892nn1234uxo2"));
	}
}