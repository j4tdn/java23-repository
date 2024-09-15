package fixcode;

import java.util.Arrays;

public class Ex04Prime {

	public static void main(String[] args) {
		System.out.println("is relevant prime numbers --> " + isRelevantPrimes(60, 120));
	}
	
	private static boolean isRelevantPrimes(long n1, long n2) {
		return Arrays.equals(getDividedPrimeNumbers(n1), getDividedPrimeNumbers(n2));
	}
	
	private static long[] getDividedPrimeNumbers(long number) {
		long[] divisible = new long[(int)number]; // 2.xxt
		int count = 0;
		
		for (long i = 2; i <= number/2; i++) {
			if (number % i == 0 && isPrime(i)) {
				divisible[count++] = i;
			}
		}
		return Arrays.copyOfRange(divisible, 0, count);
	}
	
	private static boolean isPrime(long number) {
		if (number < 2) {
			return false;
		}
		for (long i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	
	}
	
}
