package view;

import java.util.Scanner;

public class bt3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 0;
		boolean isValid = false;

		while (!isValid) {
			System.out.println("Nhập một số nguyên dương : ");
			if (scanner.hasNextInt()) {
				N = scanner.nextInt();
				if (N > 0) {
					isValid = true;
				} else {
					System.out.println("số này không phải là số nguyên dương,xin hãy thử lại");

				}

			} else {
				System.out.println("Số này không phải là số nguyên, xin hãy thử lại");
				scanner.next();

			}

		}
		if (!isValid) {
		} else {
			long factorial = calculateFactorial(N);
			System.out.println("Giai thừa của " + N + " là: " + factorial);
		}
		scanner.close();
	}

	public static long calculateFactorial(int N) {
		long result = 1;
		for (int i = 1; i <= N; i++) {
			result *= i;
		}
		return result;
	}
}