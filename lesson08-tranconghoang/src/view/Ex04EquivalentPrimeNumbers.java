package view;

import java.util.Arrays;

public class Ex04EquivalentPrimeNumbers {

	public static void main(String[] args) {

		System.out.println(isEquivalentPrimeNumbers(75, 15));
	}

	private static boolean isPrimeNumber(long n) {
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return n > 1;
	}

	private static boolean isEquivalentPrimeNumbers(long n1, long n2) {
		return Arrays.equals(getDividedPrime(n1), getDividedPrime(n2));
	}
	
	private static long[] getDividedPrime(long number) {
		long[] result = new long[(int) number];
		int count = 0;
		for(long i = 2; i < number; i++) {
			if(isPrimeNumber(i) && number % i == 0)
				result[count++] = i;
		}
		long[] result2 = Arrays.copyOfRange(result, 0, count);
		System.out.println("So nguyen to cua " + number + " --> " + Arrays.toString(result2));
		return result2;
	}
}
