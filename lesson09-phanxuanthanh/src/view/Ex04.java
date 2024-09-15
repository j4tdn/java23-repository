package view;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("Tài khoản: ");
				String accountName = ip.nextLine();

				System.out.print("Mật khẩu: ");
				String password = ip.nextLine();

				if (isValidAccount(password, accountName))
					System.out.println("Tạo tài khoản thành công");
				break;
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
		ip.close();
	}

	private static boolean isValidAccount(String password, String account) {
		if (password.length() < 8) {
			throw new IllegalArgumentException("Mật khẩu phải có 8 kí tự trở lên");
		}
		
		int countDigits = 0;
		int countCapitalLetters = 0;
		int countSpecialLetters = 0;

		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				countDigits++;
			} else if (Character.isUpperCase(password.charAt(i))) {
				countCapitalLetters++;
			} else if (!Character.isLetterOrDigit(0)) {
				countSpecialLetters++;
			}
		}

		if (countDigits < 1) {
			throw new IllegalArgumentException("Mật khẩu phải có ít nhất 1 chữ số");
		}
		if (countCapitalLetters < 1) {
			throw new IllegalArgumentException("Mật khẩu phải có ít nhất 1 kí tự in hoa");
		}
		if (countSpecialLetters < 1) {
			throw new IllegalArgumentException("Mật khẩu phải có ít nhất 1 kí tự đặc biệt");
		}
		for (int j = 0; j < account.length(); j++) {
			int count = 0;
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) == account.charAt(j)) {
					count++;
				}
				if (count > 3) {
					throw new IllegalArgumentException("Không được trùng quá 3 ký tự với tên tài khoản");
				}
			}
		}
		return true;
	}

}