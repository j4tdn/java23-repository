package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao một số nguyên 1 : ");
		long number1 = sc.nextInt();
		System.out.println("nhap vao môt số nguyên 2 : ");
		long numbre2 = sc.nextInt();
		
		
	}
	private static boolean IsaPrime(long number1 , long number2) {
		return Arrays.equals(getDividedPrimeNumber(number1),getDividedPrimeNumber(number2));
	}
	private static long[] getDividedPrimeNumber(long number) {
		long[] divisible = new long[Integer.MAX_VALUE];
		int count = 0;
		for(long i = 2 ; i<= number/2 ; i++) {
			if(number % i == 0 && IsPrime()) { 
				
			}
			
		}
	}
	private static boolean isprime(long n1 ) {
		
	}
	
}
