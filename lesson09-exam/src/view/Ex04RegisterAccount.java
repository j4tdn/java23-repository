package view;

import java.util.Scanner;

public class Ex04RegisterAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter The Account");
		String account = sc.nextLine();
		
		System.out.println("Please Enter the Password");
		String passwords = sc.nextLine();
		
		if (checkPasswordInvalid(username, password)) {
			System.out.println("Register acess");
		} else {
			System.out.println("Register not acess");
		}
		
	}
	
	public class Register {
		private static boolean checkPasswordInvalid (String username, String password) {
			if (password.length() < 8) {
				System.out.println("Passwords must least 8 characters");
				return false;
			}
			if (password.matches(".*\\d.*")) {
				System.out.println("Password must least 1 number");
				return false;
			}
			if (password.matches(".*[A-Z].*")) {
				System.out.println("Password must least 1 UpCase character");
				return false;
			}
			if (password.matches(".*(~!@#$%^&*)*")) {
				System.out.println("Password must least SpecialCharacter");
				return false;
			}
			
			int count = 0;
			for (int i = 0; i < password.length(); i ++) {
				for (int j = 0; j < username.length() && i + j < password.length(); j ++) {
					if (password.charAt(i+j) == username.charAt(j)) {
						count ++;
					} else {
						count = 0;
					}
					if (count > 3) {
						System.out.println("Password must not least 3 character");
						return false;
					}
				}
			}
			return true;
		}
	}
}
