package view;

import java.io.InvalidClassException;
import java.util.Scanner;

public class Ex02 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("Tạo mật khẩu mới: ");
			String password = sc.nextLine();
			try {
				validPassword(password);
				System.out.println("Đăng kí mật khẩu thành công!. ");
				break;
			} catch(InvalidClassException e) {
				System.out.println("Mật khẩu sai yêu cầu, vui lòng nhập lại: " + e.getMessage());
			}
		}
	}
	
	public static void validPassword(String password) throws InvalidClassException{
		if(password.length() < 8) {
			throw new InvalidClassException("mật khẩu phải có ít nhất 8 kí tự. ");
		}
		if(password.length() > 256) {
			throw new InvalidClassException("mật khẩu không được vượt quá 256 kí tự. ");
		}
		if(!password.matches(".*[a-z].*")) {
			throw new InvalidClassException("mật khẩu phải có ít nhất 1 kí tự chữ thường. ");
		}
		if(!password.matches(".*[A-Z].*")) {
			throw new InvalidClassException("mật khẩu phải có ít nhất 1 kí tự chữ hoa. ");
		}
		if(!password.matches(".*[0-9].*")) {
			throw new InvalidClassException("mật khẩu phải có ít nhất 1 kí tự số. ");
		}
		if(!password.matches(".*[~!@#$%^&*()-_=+\\[\\]{}|;:,.<>/?].*")) {
			throw new InvalidClassException("mật khẩu phải có ít nhất 1 kí tự đặc biệt. ");
		}
		
	}
}
