package view;

import java.util.Scanner;

public class Ex03EmailValidation {

private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			try {
				System.out.println("Enter your email: ");
				String email = ip.nextLine();
				if(isValidEmail(email)) {
					System.out.println("Email is valid: " + email);
					break;
				} else {
					System.out.println("Error: Invalid format!");
				}
			} catch(Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
	
	private static boolean isValidEmail(String email) throws Exception {
		// Kiểm tra có ký tự @ không
		if(!email.contains("@")) {
			throw new Exception("Email must contain '@'.");
		}
		
		// Tách email thành prefix và domain
		String[] parts = email.split("@");
		if(parts.length != 2) {
			throw new Exception("Email must contain exactly one '@'.");
		}
		
		String prefix = parts[0];
		String domain = parts[1];
		
		// Kiểm tra định dạng của prefix
		if(!isValidPrefix(prefix)) {
			throw new Exception("Invalid prefix format.");
		}
		
		// kiểm tra xem có domain hay không
		if(domain.isEmpty()) {
			throw new Exception("Domain cannot be empty.");
		}
		return true;
	}
		
		private static boolean isValidPrefix(String prefix) {
			// prefix không được để trống hoặc bắt và kết thúc đầu bằng các ký tự đặc biệt.
			if(prefix.isEmpty() || prefix.startsWith(".") || prefix.startsWith("-")
					|| prefix.endsWith(".") || prefix.endsWith("-")) {
				return false;
			}
			
			char[] validSpecialChars = {'_', '.', '-'};
			
			for(int i = 0; i < prefix.length(); i++) {
				char c = prefix.charAt(i);
				if(!Character.isLetterOrDigit(c)) {
					// giả định isSpecialCharacter không phải là ký tự đặc biệt để kiểm tra
					boolean isSpecialCharacter = false;
					for(char specialChar : validSpecialChars) {
						if(c == specialChar) {
							isSpecialCharacter = true;
							break;
						}
					}
					if(!isSpecialCharacter) {
						return false;
					}
				}
			}
			
			// Kiểm tra các ký tự _ . - không nằm cạnh nhau
			for(int i = 1; i < prefix.length(); i++) {
				char prevChar = prefix.charAt(i - 1);
				char currChar = prefix.charAt(i);
				
				if((prevChar == '_' || prevChar == '.' || prevChar == '-') &&
						(currChar == '_' || currChar == '.' || currChar == '-')) {
					return false;
				}
			}
			return true;
		
	}
	
}
