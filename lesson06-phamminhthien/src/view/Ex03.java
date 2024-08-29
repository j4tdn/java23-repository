package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		checkEmail();
	}

	private static void checkEmail() {
		Scanner ip = new Scanner(System.in);
		String email = "";
		while (true) {
			try {
				System.out.println("======================================");
				System.out.print("Nhập địa chỉ email: ");
				email = ip.nextLine();
				validateEmail(email);

				System.out.println("Địa chỉ Email hợp lệ: " + email);
				System.out.println("======================================");
				System.out.println();
				break;
			} catch (Exception e) {
				System.out.println("Lỗi: " + e.getMessage());
			}
		}
		ip.close();
	}

	private static void validateEmail(String email) throws Exception {
		String prefixRegex = "^[a-zA-Z0-9]+([._-]?[a-zA-Z0-9]+)*$";
		String domainRegex = "^[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
		String[] parts = email.split("@");
		if (parts.length != 2) {
			throw new Exception("Email không hợp lệ. Email phải chứa đúng một ký tự '@'.");
		}
		String prefix = parts[0];
		String domain = parts[1];
		if (!Pattern.matches(prefixRegex, prefix)) {
			throw new Exception("Email không hợp lệ. Prefix không đúng định dạng.");
		}
		if (!Pattern.matches(domainRegex, domain)) {
			throw new Exception("Email không hợp lệ. Domain không đúng định dạng.");
		}
	}
}
