package view;

import java.util.Scanner;

public class Ex01CheckMultiplesOf2 {
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
            boolean IsMultipleOf2 = check(N);
            System.out.println(N + " là bội của 2: " + IsMultipleOf2);
        } else {
            System.out.println("Quá số lần nhập lại.");
        }
    }

    public static boolean check(int N) {
        return N % 2 == 0;
    }
}
