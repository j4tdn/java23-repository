package view;

import java.util.Scanner;

import exception.InvalidPasswordException;

public class Ex02RegisterAnAccount {

	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		
		do {
			try {
				System.out.print("Nhập mật khẩu mới của bạn: ");
				String password = ip.nextLine();
				validatePassword(password);
				break;
			} catch (InvalidPasswordException e) {
				e.printStackTrace();
			}
		}
		while(true);
	}
	
	private static void validatePassword(String password) throws InvalidPasswordException {
		if(password.length() < 8)
			throw new InvalidPasswordException("Mật khẩu phải chứa tối thiểu 8 ký tự");
		if(password.length() > 256)
			throw new InvalidPasswordException("Mật khẩu chỉ được chứa tối đa 256 ký tự");
		if(!isLowerString(password))
				throw new InvalidPasswordException("Mật khẩu phải chứa tối thiểu 1 chữ cái viết thường");
		if(!isUpperString(password))
				throw new InvalidPasswordException("Mật khẩu phải chứa tối thiểu 1 chữ cái viết hoa");
		if(!password.matches(".*\\d.*"))
			throw new InvalidPasswordException("Mật khẩu phải chứa tối thiểu 1 chữ số");
		if(!password.matches(".*[^A-Za-z0-9].*"))
			throw new InvalidPasswordException("Mật khẩu phải chứa tối thiểu 1 ký tự đặc biệt");
		System.out.println("Đăng ký thành công !!!");
	}
	
	private static boolean isUpperString(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char t = str.charAt(i);
			if(Character.isUpperCase(t))
				count++;
		}
		if(count > 0) return true;
		else return false;
	}
	
	private static boolean isLowerString(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char t = str.charAt(i);
			if(Character.isLowerCase(t))
				count++;
		}
		if(count > 0) return true;
		else return false;
	}
}
