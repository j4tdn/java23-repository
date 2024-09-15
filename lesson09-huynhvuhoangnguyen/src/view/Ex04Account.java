package view;

import java.util.Scanner;

public class Ex04Account {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = ip.nextLine();
		String password;
		while(true) {
			System.out.println("Enter Password: ");
			password = ip.nextLine();
			if(isValidatePassword(username, password)) {
				break;
			} else {
				System.out.println("Invalid Password. Please try again");
			}
		}
		
		System.out.println("Account Registration successful!");
		ip.close();
		
	}
	
	private static boolean isValidatePassword(String username, String password) {
		
		if(password.length() > 8) {
			return false;
		}
		
		boolean hasDigit = false;
		boolean hasUpperCase = false;
		boolean hasSpecialChar = false;
		String specialChar = "~!@#$%^&*";
		
		for(char c : password.toCharArray()) {
			if(Character.isDigit(c)) {
				hasDigit = true;
			} else if(Character.isUpperCase(c)) {
				hasUpperCase = true;
			} else if (specialChar.contains(String.valueOf(c))) {
				hasSpecialChar = true;
			}
		}
		
		if(!hasDigit || !hasUpperCase || !hasSpecialChar) {
			return false;
		}
		
		int commonCharCount = 0;
		for(char c : password.toCharArray()) {
			if(username.contains(String.valueOf(c))) {
				commonCharCount++;
			}
		}
		
		return commonCharCount <= 3;
	}
	
}
