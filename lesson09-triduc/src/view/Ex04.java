package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex04 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String username = "";
		String password = "";
		username = input("Enter username: ");
		password = input("Enter password: ");
		// nên thông báo sai gì
		while (!validate(username, password)) {
			password = input("Wrong password, enter again: ");
		}

		System.out.println("Success");
	}

	private static String input(String prefix) {
		System.out.println(prefix);
		String s = sc.nextLine();

		return s;
	}

	private static boolean validate(String user, String password) {
		return validateLength(password) && validatePerChar(password) && validateWithUsername(user, password);
	}

	private static boolean validateLength(String s) {
		if (s.length() < 8) {
			return false;
		}

		return true;
	}

	private static boolean validatePerChar(String s) {
		boolean hasNumber = false;
		boolean hasUppercase = false;
		boolean hasSpecial = false;

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				hasNumber = true;
				continue;
			}
			if (Character.isUpperCase(c)) {
				hasUppercase = true;
				continue;
			}
		}

		Pattern specialKey = Pattern.compile(".*[~!@#$%^&*].*");
		hasSpecial = specialKey.matcher(s).matches();
		
		return hasNumber && hasSpecial && hasUppercase;
	}

	private static boolean validateWithUsername(String user, String pass) {
		int count = 0;
		for(char c : user.toCharArray()){
			for(char p : pass.toCharArray()) {
				if(c == p)
					count++;
			}
		}
		return count < 3;
	}
}
