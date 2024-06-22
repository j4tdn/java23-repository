package view;

import java.util.Scanner;

public class Ex03Factorial {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = inputNumber(ip);
		long result = factorial(n);
		System.out.println(n + "! = " + result);
	}

	// Hàm nhập số N từ bàn phím và kiểm tra tính hợp lệ
	public static int inputNumber(Scanner ip) {
		while (true) {
			System.out.print("Nhập số nguyên dương N: ");
			if (ip.hasNextInt()) {
				int n = ip.nextInt();
				if (n > 0) {
					return n;
				} else {
					System.out.println("Không phải số nguyên dương, xin hãy nhập số nguyên dương.");
				}
			} else {
				System.out.println("Không phải số nguyên, xin hãy nhập một số nguyên dương.");
				ip.next(); // Xóa bỏ giá trị không phải số nguyên từ bộ đệm
			}
		}
	}

	// Hàm tính giai thừa của số nguyên dương N
	public static long factorial(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
