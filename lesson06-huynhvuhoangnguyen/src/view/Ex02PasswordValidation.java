package view;

import java.util.Scanner;

public class Ex02PasswordValidation {

private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please enter your username: ");
		String userName = ip.nextLine();
		
		System.out.println("Please enter your email address: ");
		String emailAddress = ip.nextLine();
		
		while(true) {
			try {
				System.out.println("PLease enter your password: ");
				String password = ip.nextLine();
				validatePassword(password, userName, emailAddress);
				System.out.println("Account created successfully.");
				break;
			} catch(Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
	
	private static void validatePassword(String password, String userName, String emailAddress) throws Exception {
		// mật khẩu có từ 8 đến 256 ký tư
		if(password.length() < 8 || password.length() > 256) {
			throw new Exception("Password must be between 8 and 256 characters long!");
		}
		
		// Kiểm tra chữ cái viết hoa, viết thường, chữ số và ký tự đặc biệt
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasDigit = false;
		boolean hasSpecialChar = false;
		String specialChar = "!@#$%^&*()_+-=[]{};':\\\"\\\\|,.<>/?";
		
		for(char c : password.toCharArray()) {
			if(Character.isUpperCase(c)) {
				hasUpperCase = true;
			} else if(Character.isLowerCase(c)) {
				hasLowerCase = true;
			} else if (Character.isDigit(c)) {
				hasDigit = true;
			} else if (specialChar.indexOf(c) >= 0) {
				hasSpecialChar = true;
			}
		}
		
		if(!hasUpperCase) {
			throw new Exception("Password must contain at least one upper case letter.");
		}
		if(!hasLowerCase) {
			throw new Exception("Password must contain at least one lower case letter.");
		}
		if(!hasDigit) {
			throw new Exception("Password must contain at least one number.");
		}
		if(!hasSpecialChar) {
			throw new Exception("Password must contain at least one special character.");
		}
		
		if(password.contains(userName) || password.contains(emailAddress)) {
			throw new Exception("Password cannot contain user name or email.");
		}
	}
	
}
