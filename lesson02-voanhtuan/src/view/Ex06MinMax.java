package view;

import java.util.Scanner;

public class Ex06MinMax {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		int a = inputNumber(ip, "Nhập số nguyên a [0,19]: ");
		int b = inputNumber(ip, "Nhập số nguyên b [0,19]: ");
		int c = inputNumber(ip, "Nhập số nguyên c [0,19]: ");

		int max = max(max(a, b), c); // Tìm số nguyên lớn nhất
		int min = min(min(a, b), c); // Tìm số nguyên nhỏ nhất

		System.out.println("Số lớn nhất là: " + max);
		System.out.println("Số nhỏ nhất là: " + min);
	}

	// Hàm nhập số nguyên từ bàn phím và kiểm tra tính hợp lệ
	public static int inputNumber(Scanner ip, String text) {
		while (true) {
			System.out.print(text);
			if (ip.hasNextInt()) {
				int n = ip.nextInt();
				if (n >= 0 && n < 20) { // Kiểm tra số nguyên nằm trong khoảng [0, 20)
					return n;
				} else {
					System.out.println("Số không hợp lệ, xin hãy nhập lại (trong khoảng từ 0 đến 19).");
				}
			} else {
				System.out.println("Không phải số nguyên, xin hãynhập lại.");
				ip.next(); // Xóa bỏ giá trị không phải số nguyên từ bộ đệm
			}
		}
	}
	
	// Hàm tìm số lớn nhất
    public static int max(int a, int b) {
        int max = a;
        if (b > max) {
            max = b;
        }
        return max;
    }
	
    // Hàm tìm số nhỏ nhất
    public static int min(int a, int b) {
        int min = a;
        if (b < min) {
            min = b;
        }
        return min;
    }
}
