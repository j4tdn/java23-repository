package view;

import java.util.Scanner;

public class Ex07DecimalToBinary {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = inputNumber(ip);
		String binary = convertDecimalToBinary(n);
		System.out.println("Số " + n + " ở hệ nhị phân là: " + binary);
	}

	// Hàm nhập số tự nhiên từ bàn phím và kiểm tra tính hợp lệ
	public static int inputNumber(Scanner ip) {
		while (true) {
			System.out.print("Nhập số tự nhiên N: ");
			if (ip.hasNextInt()) {
				int n = ip.nextInt();
				if (n >= 0) { // Kiểm tra N là số tự nhiên
					return n;
				} else {
					System.out.println("Không phải số tự nhiên, xin hãy nhập lại.");
				}
			} else {
				System.out.println("Số không hợp lệ, xin hãy nhập lại.");
				ip.next(); // Xóa bỏ giá trị không phải số nguyên từ bộ đệm
			}
		}
	}

	// Hàm chuyển đổi số từ hệ cơ số 10 sang hệ cơ số 2
	public static String convertDecimalToBinary(int n) {
		if (n == 0) {
			return "0";
		}
		String binary = "";
		while (n > 0) {
			binary = (n % 2) + binary;
			n /= 2;
		}
		return binary;
	}
}
