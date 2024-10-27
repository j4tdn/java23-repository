package view;

import java.util.Scanner;

public class Ex02HappyNumber {

	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhap so nguyen bat ky: ");
		int number = ip.nextInt();
		if(isHappyNumber(number))
			System.out.println("HAPPY");
		else
			System.out.println("SAD");
		
	}
	
	private static boolean isHappyNumber(int number) {
		int sum = 0;
		int copyNumber = number;
		while(sum != 1 && number != 0) {
			int mod = number % 10;
			sum = sum + mod * mod;
			number = number / 10;
			if(sum == copyNumber)
				return false;
		}
		if(isHappyNumber(sum))
		return true;
	}
	
//	private static void sumOfSquares(int number) {
//		int sum = 0;
//		while(number != 0) {
//			int mod = number % 10;
//			sum = sum + mod * mod;
//			number = number / 10;
//		}
//	}
}
