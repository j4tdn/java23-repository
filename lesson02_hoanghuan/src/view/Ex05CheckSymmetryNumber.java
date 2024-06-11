package view;

import java.util.Scanner;

public class Ex05CheckSymmetryNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        boolean ValidInput = false;
        int attempts = 0;
        final int MaxAttempts = 5;

        while (attempts < MaxAttempts && !ValidInput) {
            System.out.print("Nhập số nguyên dương N: ");
            String input = scanner.nextLine();
            try {
                N = Integer.parseInt(input);
                if (N >= 10) { 
                    ValidInput = true;
                } else {
                    System.out.println("N phải là số nguyên dương có ít nhất 2 chữ số. Hãy nhập lại.");
                    attempts++;
                }
            } catch (NumberFormatException e) {
                System.out.println("N không hợp lệ. Hãy nhập lại.");
                attempts++;
            }
        }

        if (ValidInput) {
            boolean IsSymmetry = check(N);
            System.out.println(N + " là số đối xứng: " + IsSymmetry);
        } else {
            System.out.println("Quá số nhập lại.");
        }
    }

    public static boolean check(int N) {
        String str = Integer.toString(N);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
