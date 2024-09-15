package view;

import java.util.Scanner;

public class Ex04RegisterAccount {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Input account:");
		String account = sc.nextLine();
inputPassword();
	}

	private static void inputPassword() {
		while(true) {
		
		try {
			System.out.println("Input password: ");
			String password = sc.nextLine();
			if (getLongPassword(password) && atLeast1Number(password) && 
					isUpper(password) && isSpecialChar(password)) {
				System.out.println("Register is success");
				break;
			}
		} catch (Exception e) {
			System.out.println("The long password has least 8: " + e.getMessage());
			System.out.println("Please input again:");

		}
	}
	}

	private static boolean isSpecialChar(String password) {
		 if(password.matches("\\\\w+")) {
			 return true;
		}
		return false;
		
	}
	
	private static boolean isUpper(String password) {
		for (int i = 0; i < password.length(); i++) {
//			char c = password.charAt(i);
			if (Character.isUpperCase(password.charAt(i)))
//				break;
			return true;
			break;

		}
		return false;
	}

	private static boolean getLongPassword(String password) {
		if (password.length() >= 8) {
			return true;
		}
		return false;
	}

	private static boolean atLeast1Number(String password) {
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (Character.isDigit(c))
				break;
			return true;
		}
		return false;
	}
}
