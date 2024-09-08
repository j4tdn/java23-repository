package view;

import java.util.Scanner;

public class Ex01StringProcessor {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = ip.nextLine();
		 if (!isValidVietnameseString(s)) {
	            System.out.println("The string is not valid. Please enter a valid string.");
	            return;
	        }

		System.out.println("Each character on a new line:");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		System.out.println("Each word on a new line:");
		String[] words = s.split(" ");
		for (String word : words) {
			System.out.println(word);
		}

		System.out.println("\nReversed string by characters:");
		StringBuilder reversedString = new StringBuilder(s);
		System.out.println(reversedString.reverse());

		System.out.println("\nReversed string by words:");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}
	
	 public static boolean isValidVietnameseString(String str) {
	        String regex = "^[\\p{L}\\s]+$";
	        return str.matches(regex);
	    }
}
