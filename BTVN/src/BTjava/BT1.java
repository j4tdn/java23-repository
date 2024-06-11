package BTjava;

import java.util.Arrays;

public class BT1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int attempts = 0;
        int N = 0;
        boolean isValid = false;

        // Nhập số N từ bàn phím với tối đa 5 lần thử
        while (attempts < 5) {
            System.out.print("Nhập vào số nguyên dương N: ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N > 0) {
                    isValid = true;
                    break;
                } else {
                    System.out.println("Số nhập vào phải là số nguyên dương. Vui lòng thử lại.");
                }
            } else {
                System.out.println("Dữ liệu nhập vào không phải là số nguyên. Vui lòng thử lại.");
                scanner.next(); // Loại bỏ dữ liệu không hợp lệ
            }
            attempts++;
        }

        if (isValid) {
            if (isMultipleOfTwo(N)) {
                System.out.println(N + " là bội của 2.");
            } else {
                System.out.println(N + " không phải là bội của 2.");
            }
        } else {
            System.out.println("Bạn đã nhập sai quá 5 lần.");
        }

        scanner.close();
    }

    // Hàm kiểm tra số N có phải là bội của 2 hay không
    private static boolean isMultipleOfTwo(int N) {
        return N % 2 == 0;
    }
}
