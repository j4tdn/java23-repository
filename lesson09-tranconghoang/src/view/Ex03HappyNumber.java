package view;

import java.util.Scanner;

public class Ex03HappyNumber {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap so nguyen duong: ");
		int number = Integer.parseInt(ip.nextLine());
		if(isHappyNumber(number)) {
			System.out.println(number + " la so hanh phuc");
			System.exit(0);
		}
			System.out.println(number + " khong phai la so hanh phuc");
	}
	
	private static boolean isHappyNumber(int number) {
		int nextResult = number;
		while(nextResult != 1) {
			nextResult = calSumOfSquares(nextResult);
		}
		return true;
	}
	private static int calSumOfSquares(int number) {
		int sum = 0;
		while(number != 0) {
			int mod = number % 10;
			sum = sum + mod * mod;
			number = number / 10;
		}
		return sum;
	}
	
}
