package view;

import java.util.Scanner;

public class Ex05ChekPalindromeNumber {
	public static void main(String[] args) {
		int number = getValidInteger();
		if (isCheckNumber(number)) {
			System.out.println(number + "-> true");
		} else {
			System.out.println(number + "-> false");
		}
	}

	private static int getValidInteger() {
		Scanner ip = new Scanner(System.in);

		String numberAsText = "";
		int number = 0;

		do {
			System.out.print("Enter your number: ");
			numberAsText = ip.nextLine();
			if (numberAsText.matches("\\d+")) {
				number = Integer.parseInt(numberAsText);
		        if (number >= 10) {
		        	return number;
		        }
			}

		} while (true);
	}

	private static boolean isCheckNumber(int input) {
		return (input == findNumber(input));
	}

	private static int findNumber(int input) {
		int result = 0;
		int n;
		while (input != 0) {
			n = input % 10;

			result = (result * 10) + n;

			input /= 10;
		}
		return result;
	}
}
