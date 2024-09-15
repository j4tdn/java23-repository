package view;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập tên tài khoản: ");
		
		// String username = "luungocyennhu810";
		String username = ip.nextLine();
		String password = "";
		
		do {
			System.out.println("-> Nhập mật khẩu: ");
			password = ip.nextLine();
		} while (!checkPassword(password, username));
		
		System.out.println("  ---> Đăng ký tài khoản thành công!");
	}
	
	private static boolean checkPassword(String password, String username) {
		if (password.length() < 8) {
			System.out.println("Yêu cầu mật khẩu >= 8 kí tự");
			return false;
		}
		
		if (!password.matches(".*\\d.*")) {
			System.out.println("Mật khẩu có ít nhất 1 chữ số");
			return false;
		}
		
		if (!password.matches(".*[A-Z].*")) {
			System.out.println("Mật khẩu có ít nhất 1 kí tự in hoa");
			return false;
		}
		
		if (!password.matches(".*[~!@#$%^&*].*")) {
			System.out.println("Mật khẩu có ít nhất 1 kí tự đặc biệt (~!@#$%^&*)");
			return false;
		}
		
		int count = 0;
		for (int i = 0; i < password.length() - 1; i++) {
			for (int j = 0; j < username.length() - 1; j++) {
				if (password.charAt(i) == username.charAt(j)) {
					count++;
					break;
				}
			}
			if (count > 3) {
				System.out.println("Mật khẩu không được trùng quá 3 ký tự với tên tài khoản");
				return false;
			}
		}
		return true;
	}
}

