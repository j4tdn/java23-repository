package view;


import java.util.Arrays;
import java.util.Scanner;

public class Ex04IsPrime {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập số N: ");
		long n = ip.nextLong();
		
		System.out.println("Nhập số M: ");
		long m = ip.nextLong();
		
		
		if(isRelevantPrimes(n, m)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		ip.close();
		
	}
	
	private static boolean isRelevantPrimes(long n1, long n2) {
		return Arrays.equals(getDividedPrimeNumber(n1), getDividedPrimeNumber(n2));	
	}
	
	private static long[] getDividedPrimeNumber(long number) {
		long[] divisible = new long[(int) number];
		int count = 0;
		
		for(long i = 2; i <= number/2; i++) {
			if(number % i == 0 && isPrime(i)) {
				divisible[count++] = i;
			}
		}
		
		return Arrays.copyOfRange(divisible, 0, count);
	}
	
	private static boolean isPrime(long number) {
		if(number < 2) {
			return false;
		}
		
		for(long i = 2; i < number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
