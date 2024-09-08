package bean;

import java.util.Scanner;

public class Ex01 {
//	Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
//	In ra mỗi kí tự trên một dòng
//	In ra mỗi từ trên mỗi dòng
//	In ra chuỗi đảo ngược theo kí tự
//	In ra chuỗi đảo ngược theo từ
	public static void main(String[] args) {
		String s = inputString("Enter string");
		printLetter(s);
		printWord(s);
		printReverseLetter(s);
		printReverseWord(s);
	}

	private static String inputString(String prefix) {
		System.out.print(prefix + ": ");
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		while (!s.matches("[\\p{L}\\s]+")) { // Unicode (cả tiếg việt có dấu)
			System.out.print("Wrong input, please enter again: ");
			s = sc.nextLine();
		}

		sc.close();
		return s;
	}

	private static void printLetter(String s) {
		System.out.println("Print letter: ");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				System.out.println(s.charAt(i) + " ");
			}
		}
	}

	private static void printWord(String s) {
		System.out.println("Print words: ");
		String[] words = s.split(" ");
		for (String w : words) {
			System.out.println(w);
		}
	}

	private static void printReverseLetter(String s) {
		System.out.println("Print reverse letter: ");
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				System.out.println(s.charAt(i) + " ");
			}
		}
	}

	private static void printReverseWord(String s) {
		System.out.println("Print reverse letter: ");
		String[] words = s.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}
}
