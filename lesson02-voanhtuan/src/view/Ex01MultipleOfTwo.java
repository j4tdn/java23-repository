package view;

import java.util.Scanner;

public class Ex01MultipleOfTwo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = inputNumber(ip);
		boolean result = isMultipleOfTwo(n);
		if (result) {
			System.out.println(n + " là bội của 2.");
		} else {
			System.out.println(n + " không phải là bội của 2.");
		}
	}

	// Hàm nhập số N từ bàn phím và kiểm tra tính hợp lệ
	public static int inputNumber(Scanner ip) {
		int attempts = 0;
		while (attempts < 5) {
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
			attempts++;
		}
		System.out.println("Đã nhập sai quá 5 lần. Chương trình kết thúc.");
		System.exit(0); // Kết thúc chương trình nếu quá 5 lần nhập không hợp lệ
		return -1; // Giá trị mặc định để tránh lỗi biên dịch
	}

	// Hàm kiểm tra số N có phải là bội của 2 hay không
	public static boolean isMultipleOfTwo(int n) {
		return n % 2 == 0;
	}
}
