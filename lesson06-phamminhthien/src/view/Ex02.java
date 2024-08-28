package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Create a new password");
		System.out.println("======================================");
		checkPassword();
		System.out.println("======================================");
	}
	private static String checkPassword() {
		Scanner ip = new Scanner(System.in);
		String pass = "";
		
		try {
			while(true) {
				pass = ip.nextLine();
				validatePassword(pass);
				break;
			}
			
		}catch (Exception e) {
			System.out.println("Lỗi: "+e.getMessage());
			ip.nextLine();
		}
		ip.close();
		return pass;
	}
	
	private static void validatePassword(String password) throws Exception {
		
		 if (password.length() < 8) {
	            throw new Exception("Mật khẩu phải có ít nhất 8 ký tự.");
	        }

	        // Kiểm tra có ít nhất một chữ cái hoa
	        if (!password.chars().anyMatch(Character::isUpperCase)) {
	            throw new Exception("Mật khẩu phải chứa ít nhất một chữ cái hoa.");
	        }

	        // Kiểm tra có ít nhất một chữ cái thường
	        if (!password.chars().anyMatch(Character::isLowerCase)) {
	            throw new Exception("Mật khẩu phải chứa ít nhất một chữ cái thường.");
	        }

	        // Kiểm tra có ít nhất một chữ số
	        if (!password.chars().anyMatch(Character::isDigit)) {
	            throw new Exception("Mật khẩu phải chứa ít nhất một chữ số.");
	        }

	        // Kiểm tra có ít nhất một ký tự đặc biệt
	        String specialCharacters = "!@#$%^&*()-_+=<>?/"; // Danh sách ký tự đặc biệt
	        if (password.chars().noneMatch(ch -> specialCharacters.indexOf(ch) >= 0)) {
	            throw new Exception("Mật khẩu phải chứa ít nhất một ký tự đặc biệt.");
	        }
	}
}
