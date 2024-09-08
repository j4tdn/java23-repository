package view;

import java.util.Arrays;

public class Ex04 {
	
	public static void main(String[] args) {
		System.out.println("Is relevant prime number --> " + isRelevantPrimes(75,15));
	}
	
	// Viết hàm tìm các ước số nguyên tố
	private static boolean isRelevantPrimes(long n1, long n2) {
		return Arrays.equals(getDividedPrimeNumbers(n1), getDividedPrimeNumbers(n2));
	}
	
	// Tìm ước số
	private static long[] getDividedPrimeNumbers(long number) {
		long[] divisible = new long[(int)number];
		int count = 0;
		
		for (long i = 2; i <= number/2; i++) {
			if (number % i == 0 && isPrime(i)) {
				divisible[count++] = i;
			}
		}
		
		return Arrays.copyOfRange(divisible, 0, count);
	}
	
	private static boolean isPrime(long number) {
		
		for (long i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
