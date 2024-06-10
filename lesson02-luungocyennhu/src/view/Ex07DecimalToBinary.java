package view;

import java.util.Scanner;

public class Ex07DecimalToBinary {

	public static void decimalToBinary(int n) {
		int[] binary = new int[30];
		int index = 0;
		while (n > 0) {
			binary[index++] = n % 2;
			n = n / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = Integer.parseInt(ip.nextLine());

		System.out.print("Binary number of n: ");
		decimalToBinary(n);
	}
}
