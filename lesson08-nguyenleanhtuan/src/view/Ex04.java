package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập số thứ 1: ");
//		long n1 = sc.nextLong();
//		System.out.println("Nhập số thứ 2: ");
//		long n2 = sc.nextLong();
		
		System.out.println("is relevant prime numbers -->"+ isReleVantPrimes(75, 15));
	}
	
	private static boolean isReleVantPrimes(long n1, long n2) {
		//viết hàm tìm các ước số nguyên tố
		//
			
		return Arrays.equals(getDividedPrimeNumber(n1), getDividedPrimeNumber(n2));
	}
	
	private static long[] getDividedPrimeNumber(long number) {
		long[] divisible = new long[Integer.MAX_VALUE];
		int count = 0;
		
		for(long i=2; i< number/2;i++) {
			if(number % i == 0 && isPrime(i)) {
				divisible[count++] = i;
			}
		}
		
		return   Arrays.copyOfRange(divisible, 0, count);
	}

	private static boolean isPrime(long number) {
		if(number < 2) {
			return false;
		}
		for(long i =2 )
		return false;
	}
}
