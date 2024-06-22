package view;

import java.util.Scanner;

public class Ex08Prime {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
        int n = inputNumber(ip);
        if (isPrime(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }
	}

	// Hàm nhập số N từ bàn phím và kiểm tra tính hợp lệ
	public static int inputNumber(Scanner ip) {
		int count = 0;
		while (count < 5) {
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
			count++;
		}
		System.out.println("Đã nhập sai quá 5 lần. Chương trình kết thúc.");
		System.exit(0); // Kết thúc chương trình nếu quá 5 lần nhập không hợp lệ
		return 0;
	}

	// Hàm kiểm tra số nguyên tố
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
