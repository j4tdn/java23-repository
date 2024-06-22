package view;

import java.util.Scanner;

public class Ex05PalindromeCheck {

	public static boolean isPalindrome(int n) {
		String str = Integer.toString(n);
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int N;
		// boolean isValid = false;
		
		while(true) {
			System.out.println("Input a positive integer with at least 2 digits: ");
			String input = ip.nextLine();
			
			try {
				N = Integer.parseInt(input);
				if (N >= 10) {
					break;
				} else {
					System.out.println("Input number must have AT LEAST 2 digits.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please Enter a valid positive integer.");
			}
		}
		ip.close();
		
		if (isPalindrome(N)) {
			System.out.println(N + " is symmetrical.");
		} else {
			System.out.println(N + " is not symmetrical.");
		}
	}
	
}
