package ex04;

import java.util.Scanner;

public class RegisterAccount {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.println("Nhập tên tài khoản: ");
		String username = ip.nextLine();

		System.out.println("Nhập mật khẩu:");
		String password = ip.nextLine();

		if (isValidPassword(password, username)) {
			System.out.println("Đăng ký tài khoản thành công!");
		} else {
			System.out.println("Đăng ký thất bại. Vui lòng kiểm tra lại mật khẩu.");
		}
		ip.close();

	}

	private static boolean isValidPassword(String password, String username) {
        // Điều kiện 1
		if (password.length() < 8)
			return false;

		// Điều kiện 3
		int commonCount = 0;
		for (char c : username.toCharArray()) {
			if (password.indexOf(c) >= 0)
				commonCount++;
			if (commonCount > 3)
				return false;
		}

		return true;

	}
}
