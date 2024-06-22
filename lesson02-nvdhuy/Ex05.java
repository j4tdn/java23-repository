package view;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        int dem = 0;
        boolean validInput = false;

        while (dem < 5 && !validInput) {
            System.out.print("Nhập vào số nguyên dương có tối thiểu 2 chữ số N: ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N >= 10) {
                    validInput = true;
                } else {
                    System.out.println("N phải là số nguyên dương có tối thiểu 2 chữ số. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Giá trị nhập vào không hợp lệ. Vui lòng nhập lại.");
                scanner.next();
            }
            dem++;
        }

        if (validInput) {
            if (isPalindrome(N)) {
                System.out.println(N + " là số đối xứng.");
            } else {
                System.out.println(N + " không phải là số đối xứng.");
            }
        } else {
            System.out.println("Bạn đã nhập sai quá 5 lần. Chương trình kết thúc.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(int N) {
        int originalNumber = N;
        int reversedNumber = 0;
        while (N != 0) {
            int digit = N % 10;
            reversedNumber = reversedNumber * 10 + digit;
            N /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
