package view;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        int dem = 0;
        boolean validInput = false;

        while (dem < 5 && !validInput) {
            System.out.print("Nhập vào số nguyên dương N: ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N > 0) {
                    validInput = true;
                } else {
                    System.out.println("N phải là số nguyên dương. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Giá trị nhập vào không hợp lệ. Vui lòng nhập lại.");
                scanner.next();
            }
            dem++;
        }

        if (validInput) {
            if (isPowerOfTwo(N)) {
                System.out.println(N + " là lũy thừa của 2.");
            } else {
                System.out.println(N + " không phải là lũy thừa của 2.");
            }
        } else {
            System.out.println("Bạn đã nhập sai quá 5 lần. Chương trình kết thúc.");
        }

        scanner.close();
    }

    public static boolean isPowerOfTwo(int N) {
        return (N & (N - 1)) == 0;
    }
}
