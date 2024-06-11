package view;

import java.util.Scanner;

public class Ex06MaxMin {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = GetInput(scanner, "a");
        int b = GetInput(scanner, "b");
        int c = GetInput(scanner, "c");

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        System.out.println("Số lớn nhất là " + max);
        System.out.println("Số nhỏ nhất là " + min);
    }

    private static int GetInput(Scanner scanner, String VariableName) {
        int attempts = 0;
        final int MaxAttempts = 5;
        int num = -1;
        boolean ValidInput = false;

        while (attempts < MaxAttempts && !ValidInput) {
            System.out.print("Nhập số nguyên " + VariableName + " (0 <= " + VariableName + " < 20): ");
            String input = scanner.nextLine();
            try {
                num = Integer.parseInt(input);
                if (num >= 0 && num < 20) {
                    ValidInput = true;
                } else {
                    System.out.println("Số nhập vào phải trong khoảng [0, 20). Hãy nhập lại.");
                    attempts++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input không hợp lệ. Hãy nhập lại.");
                attempts++;
            }
        }

        if (!ValidInput) {
            System.out.println("Quá số lần nhập lại.");
            System.exit(1);
        }

        return num;
    }
}
