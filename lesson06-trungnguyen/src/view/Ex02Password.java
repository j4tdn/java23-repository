package view;

import java.util.Scanner;

public class Ex02Password {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		do {
			try {
				System.out.println("Nhập mật khẩu: ");
				String password = ip.nextLine();
				checkPassword(password);
				System.out.println("Đăng ký tài khoản thành công");
				System.out.println("Mật khẩu: " + password);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		while (true);	
	}
	
	private static void checkPassword(String password) throws Exception {
		if (password.length() < 8) {
			throw new Exception("Mật khẩu phải chứa ít nhất 8 ký tự");
		}
		if (password.length() > 256) {
			throw new Exception("Mật khẩu chứa nhiều nhất 256 ký tự");
		}
		if (!password.matches(".*[a-z].*")) {
			throw new Exception("Mật khẩu phải chứa ít nhất 1 chữ cái viết thường");
		}
		if (!password.matches(".*[A-Z].*")) {
			throw new Exception("Mật khẩu phải chứa ít nhất 1 chữ cái viết hoa");
		}
		if (!password.matches(".*\\d.*")) {
			throw new Exception("Mật khẩu phải chứa ít nhất 1 chữ số");
		}
		if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
			throw new Exception("Mật khẩu phải chứa ít nhất 1 ký tự đặc biệt");
		}
	}
	
}
