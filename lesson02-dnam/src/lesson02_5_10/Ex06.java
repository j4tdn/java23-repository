package lesson02_5_10;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;

		System.out.println("Số nguyên lớn nhất là " +tinhtoan(nhapSoNguyen(a), nhapSoNguyen(b), nhapSoNguyen(c)));
	}

	
	private static String tinhtoan(int nhapSoNguyen, int nhapSoNguyen2, int nhapSoNguyen3) {
		// TODO Auto-generated method stub
		return null;
	}


	public static int nhapSoNguyen(int a) {
		Scanner scanner = new Scanner(System.in);
		int number;

		while (true) {

			if (scanner.hasNextInt()) {
				number = scanner.nextInt();

				if (number >= 0 && number < 20) {
					break;
				} else {
					System.out.println("Số không nằm trong khoảng cho phép, vui lòng nhập lại.");
				}
			} else {
				System.out.println("Vui lòng nhập lại số nguyên.");
				scanner.next();
			}
		}

		return number;
	}
}
	