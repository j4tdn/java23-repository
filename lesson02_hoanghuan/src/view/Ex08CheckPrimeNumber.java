package view;

import java.util.Scanner;

public class Ex08CheckPrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        final int MaxAttempts = 5;
        int N = 0;
        boolean ValidInput = false;

        while (attempts < MaxAttempts && !ValidInput) {
            System.out.print("Nhập số nguyên dương N: ");
            String input = scanner.nextLine();
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

        if (ValidInput) {
            boolean IsPrimeNumber = check(N);
            System.out.println(N + " là số nguyên tố: " + IsPrimeNumber);
        } else {
            System.out.println("Quá số lần nhập lại.");
        }
	}
	public static boolean check(int N) {
        if (N <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
