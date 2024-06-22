package view;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = getInput("Nhập a (0 <= a < 20): ", scanner);
        int b = getInput("Nhập b (0 <= b < 20): ", scanner);
        int c = getInput("Nhập c (0 <= c < 20): ", scanner);

        int max = findMax(a, b, c);
        int min = findMin(a, b, c);

        System.out.println("Số lớn nhất là " + max);
        System.out.println("Số nhỏ nhất là " + min);

        scanner.close();
    }

    private static int getInput(String prompt, Scanner scanner) {
        int num = -1;
        boolean validInput = false;
        while (!validInput) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num >= 0 && num < 20) {
                    validInput = true;
                } else {
                    System.out.println("Giá trị phải nằm trong khoảng từ 0 đến 19. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Giá trị nhập vào không hợp lệ. Vui lòng nhập lại.");
                scanner.next(); // Xóa giá trị nhập không hợp lệ
            }
        }
        return num;
    }

    private static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    private static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
