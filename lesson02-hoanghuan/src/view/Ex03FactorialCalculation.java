package view;

import java.util.Scanner;

public class Ex03FactorialCalculation {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        boolean ValidInput = false;
        String input;

        System.out.println("Chọn phương thức Input");
        System.out.println("1. Nhập từ bàn phím");
        System.out.println("2. Sử dụng giá trị khai báo sẵn");
        System.out.print("Lựa chọn phương thức: ");
        input = scanner.nextLine();

        if ("2".equals(input)) {
            // Sử dụng giá trị khai báo sẵn
            N = 14; 
            ValidInput = true;
        } else {
            // Nhập giá trị từ bàn phím
            int attempts = 0;
            final int MaxAttempts = 5;

            while (attempts < MaxAttempts && !ValidInput) {
                System.out.print("Nhập số nguyên dương N: ");
                input = scanner.nextLine();
                try {
                    N = Integer.parseInt(input);
                    if (N > 0) {
                        ValidInput = true;
                    } else {
                        System.out.println("N không phải là số nguyên dương. Hãy nhập lại.");
                        attempts++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("N không hợp lệ. Hãy nhập lại.");
                    attempts++;
                }
            }

            if (!ValidInput) {
                System.out.println("Quá số lần nhập lại.");
                return;
            }
        }

        long factorial = calculate(N);
        System.out.println(N + "! = " + factorial);
    }

    public static long calculate(int N) {
        long result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        return result;
    }
}
