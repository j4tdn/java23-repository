package view;

import java.util.Scanner;

public class Ex02PowerOfTwo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = inputNumber(ip);
		boolean result = isPowerOfTwo(n);
		if (result) {
			System.out.println(n + " là lũy thừa của 2.");
		} else {
			System.out.println(n + " không phải là lũy thừa của 2.");
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
				ip.next(); // Xóa dữ liệu không hợp lệ khỏi bộ đệm
			}
			count++;
		}
		System.out.println("Đã vượt quá số lần thử nhập. Chương trình kết thúc.");
		System.exit(0); // Kết thúc chương trình nếu quá 5 lần nhập không hợp lệ
		return -1; // Giá trị mặc định để tránh lỗi biên dịch
	}

	// Hàm kiểm tra số N có phải là lũy thừa của 2 hay không
	public static boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false;
		}
		return (n & (n - 1)) == 0;
	}

}
