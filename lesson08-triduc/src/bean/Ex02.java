package bean;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		String s = inputString("Enter string");
		System.out.println("Result: " + uppercaseFirstWords(s));
	}

	private static String inputString(String prefix) {
		System.out.print(prefix + ": ");
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		while (!s.matches("[A-Za-z ]+")) {
			System.out.print("Wrong input, please enter again: ");
			s = sc.nextLine();
		}

		sc.close();
		return s;
	}

	private static String uppercaseFirstWords(String s) {
		String[] words = s.strip().split(" ");
		String rs = "";
		for (String w : words) {
			rs += w.substring(0, 1).toUpperCase() + w.substring(1) + " ";
		}
		return rs.trim();
	}
}
