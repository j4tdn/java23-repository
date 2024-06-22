package view;

import java.util.Scanner;

public class Ex05Palidrome {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = inputNumber(ip);
		boolean result = isPalindrome(n);
		if (result) {
			System.out.println(n + " là số đối xứng.");
		} else {
			System.out.println(n + " không phải là số đối xứng.");
		}
	}

	// Hàm nhập số N từ bàn phím và kiểm tra tính hợp lệ
	public static int inputNumber(Scanner ip) {
		while (true) {
			System.out.print("Nhập số nguyên dương có tối thiểu 2 chữ số N: ");
			if (ip.hasNextInt()) {
				int n = ip.nextInt();
				if (n > 9) { // Kiểm tra N có tối thiểu 2 chữ số
					return n;
				} else {
					System.out.println("Không phải số nguyên dương có tối thiểu 2 chữ số, xin hãy nhập lại.");
				}
			} else {
				System.out.println("Không phải số nguyên, xin hãy nhập một số nguyên dương có tối thiểu 2 chữ số.");
				ip.next(); // Xóa bỏ giá trị không phải số nguyên từ bộ đệm
			}
		}
	}

	// Hàm kiểm tra số N có phải là số đối xứng hay không
	public static boolean isPalindrome(int n) {
        int reversed = 0;
        int original = n;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed == original;
    }

}
