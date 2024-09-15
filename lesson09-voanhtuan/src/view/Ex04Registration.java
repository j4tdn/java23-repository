package view;

import java.util.Scanner;

public class Ex04Registration {

    private static final String SPECIAL_CHARACTERS = "~!@#$%^&*";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập tên tài khoản: ");
            String username = sc.nextLine();
            
            if (username.isEmpty()) {
                throw new IllegalArgumentException("Tên tài khoản không được để trống.");
            }

            System.out.print("Nhập mật khẩu: ");
            String password = sc.nextLine();
            
            if (password.isEmpty()) {
                throw new IllegalArgumentException("Mật khẩu không được để trống.");
            }

            if (isValidPassword(password, username)) {
                System.out.println("Đăng ký tài khoản thành công!");
            } else {
                System.out.println("Đăng ký tài khoản thất bại! Mật khẩu không hợp lệ.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi không mong muốn: " + e.getMessage());
        }
    }

    private static boolean isValidPassword(String password, String username) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Mật khẩu phải có ít nhất 8 ký tự.");
        }

        boolean hasDigit = false, hasUpperCase = false, hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) hasDigit = true;
            else if (Character.isUpperCase(c)) hasUpperCase = true;
            else if (SPECIAL_CHARACTERS.indexOf(c) >= 0) hasSpecialChar = true;
        }

        if (!hasDigit || !hasUpperCase || !hasSpecialChar) {
            throw new IllegalArgumentException("Mật khẩu phải chứa ít nhất 1 chữ số, 1 ký tự in hoa và 1 ký tự đặc biệt.");
        }

        long matchingChars = username.chars().filter(c -> password.indexOf(c) >= 0).count();
        if (matchingChars > 3) {
            throw new IllegalArgumentException("Mật khẩu không được trùng quá 3 ký tự với tên tài khoản.");
        }

        return true;
    }
}
