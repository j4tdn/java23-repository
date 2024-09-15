package view;

import java.util.Scanner;

public class Ex04SignUp {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String userName = "";
		String password = "";
		boolean signUpStatus = false;
		
		System.out.println("Nhập tên tài khoản : ");
		userName = ip.nextLine();
		System.out.println("Nhập mật khẩu : ");
		while (!signUpStatus) {
			password = ip.nextLine().strip();
			if (password.length() < 8) {
				System.out.println("Độ dài mật khẩu phải lớn hơn 8 !");
				continue;
			}
			if (checkPassword(password) == false) {
				System.out.println("Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)");
				continue;
			}
			if (isDuplicate(userName, password)) {
				System.out.println("Không được trùng quá 3 ký tự với tên tài khoản");
				continue;
			}
			signUpStatus = true;
			System.out.println("Đăng ký thành công");
		}
	}
	private static boolean checkPassword(String password) {
		
		boolean containNumber = false;
		boolean containtUppercase = false;
		boolean containSpecialCharacter = false;
		String specialCharacters = "~!@#$%^&*";
		
		for (int i = 0; i < password.length(); i++) {
			char c = (Character) password.charAt(i);
			if (Character.isDigit(c)) {
				containNumber = true;
			}
			if (Character.isUpperCase(c)) {
				containtUppercase = true;
			}
			if (specialCharacters.indexOf(c) >= 0) {
				containSpecialCharacter = true;
			}
		}
		return containNumber && containtUppercase && containSpecialCharacter;
	}
	
	private static boolean isDuplicate(String userName, String password) {
		
		int dupCount = 0;
		for (int i = 0; i < password.length(); i++) {
			if (userName.contains(String.valueOf(password.charAt(i)))) {
				dupCount++;
			}
		}
		return (dupCount > 3);
	}
}
