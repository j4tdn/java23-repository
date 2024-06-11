package view;

import java.util.Scanner;

public class Ex07ConvertNumber {
	public static void main(String[] args) {
		int N = -1;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Nhập vào số N: ");
			 N = Integer.parseInt(scanner.nextLine());
			if (N < 0) {
				System.out.println("Số không hợp lệ");
				System.exit(0);
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Số không hơl lệ");
		}
		if (N == 0) {
			System.out.println("Hệ nhị phân: 0");
			return;
		}
		String binary = "";
		while(N > 0) {
			binary = (N % 2) + binary;
			N/=2;
		}
		System.out.println("Hệ nhị phân: " + binary);
	}
}
