package view;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int dem = 0;
		boolean validInput = false;

		while (dem < 5 && !validInput) {
			System.out.print("Nhập vào số nguyên dương N: ");
			if (sc.hasNextInt()) {
				N = sc.nextInt();
				if (N > 0) {
					validInput = true;
				} else {
					System.out.println("N phải là số nguyên dương. Vui lòng nhập lại.");
				}
			} else {
				System.out.println("Giá trị nhập vào không hợp lệ. Vui lòng nhập lại.");
				sc.next(); 
			}
			dem++;
		}

		if (!validInput) {
			System.out.println("Bạn đã nhập sai quá 5 lần. Chương trình kết thúc.");
			extracted();
		}

		long factorial = calculateFactorial(N);
		System.out.println(N + "! = " + factorial);

		sc.close();
	}

	private static void extracted() {
	}

	public static long calculateFactorial(int N) {
		long result = 1;
		for (int i = 1; i <= N; i++) {
			result *= i;
		}
		return result;
	}
}
