package BTjava;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int N = 0;
        boolean isValid = false;

        // Nhập số N từ bàn phím với tối thiểu 2 chữ số
        while (attempts < 5) {
            System.out.print("Nhập vào số nguyên dương N (ít nhất 2 chữ số): ");
            String input = scanner.next();
            if (input.length() >= 2 && isNumeric(input)) {
                N = Integer.parseInt(input);
                isValid = true;
                break;
            } else {
                System.out.println("Số nhập vào phải có ít nhất 2 chữ số. Vui lòng thử lại.");
            }
            attempts++;
        }

        if (isValid) {
            System.out.println(N + " là số đối xứng: " + isPalindrome(N));
        } else {
            System.out.println("Bạn đã nhập sai quá 5 lần hoặc số nhập vào không hợp lệ.");
        }

        scanner.close();
    }

    // Hàm kiểm tra số N có phải là số đối xứng hay không
    private static boolean isPalindrome(int N) {
        String str = Integer.toString(N);
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Hàm kiểm tra xem chuỗi có phải là số hay không
    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}