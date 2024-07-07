package view_fixcode;

import java.util.Scanner;

import utils.IoUtils;
import utils.MathUtils;

public class Ex05Symetric {

	/*
	 * 567 -> tìm số ngược lại -> 765 nếu bằng nhau thì là số đối xứng --> Cách 1: +
	 * _ * / tìm số ngược lại --> Cách 2: chuyển sang chuỗi, mảng -> duyệt ngược lại
	 * --> Cách 3: kiểm tra từng cặp kí tự, số đối xứng
	 * 
	 * Biết rằng N được nhập từ bàn phím là một số nguyên dương có tối thiểu 2 chữ
	 * số
	 */

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		int n = IoUtils.input(2);
		System.out.println("Is Symetric number? --> " + isSymetric(n));

		System.out.println("\n======================\n");
		
		System.out.println("Enter text = ");
		String s = ip.nextLine();
		System.out.println("Is Symetric String? --> " + isSymetric(n));
	}

	// n = 123

	// int reversed = 0 --> 32

	// int mod = n% 10; --> 3
	// reversed = mod
	// n = n / 10 --> 0

	// Cách 1
	private static boolean isSymetric(int n) {
		return n == MathUtils.reverse(n);
	}

	// Cách 2
	// vị trí length - i - 1 là vị trí đối xứng với vị trí i qua phần tử trung tâm
	private static boolean isSymetric(String s) {
		int length = s.length();
		for (int i = 0; i < length / 2; i++) {
			if (s.charAt(i) != s.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
