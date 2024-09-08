package view;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {	
		System.out.println("is relevant prime numbers --> " + isRelevantPrimes(75, 15));
	}
	
	public static boolean isRelevantPrimes(long n1, long n2) {
		long[] getDividedPrimeNumbersA = getDividedPrimeNumbers(n1);
		long[] getDividedPrimeNumbersB = getDividedPrimeNumbers(n2);

		return Arrays.equals(getDividedPrimeNumbersA, getDividedPrimeNumbersB);
	}

	private static long[] getDividedPrimeNumbers(long number) {
		long[] divisible = new long[(int) number];
		int count = 0;
		
		for (long i = 2; i <= number/2; i++) {
			if (number % i == 0 && isPrime(i)) {
				divisible[count++] = i;
			}
		}
		return Arrays.copyOfRange(divisible, 0, count);
	}

	private static boolean isPrime(long number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}