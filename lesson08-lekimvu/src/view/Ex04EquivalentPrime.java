package view;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04EquivalentPrime {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
           System.out.println("-->" +isEquivalentPrime(60, 30));
           
	}

	private static boolean isEquivalentPrime(long n1, long n2) { // tìm 2 số ngto tương đương
		return Arrays.equals(getDividedPrimes(n1), getDividedPrimes(n2));
	}

	private static long[] getDividedPrimes(long number) {
		long[] result = new long[(int) number];
		int count = 0;
		for (long i = 2; i < number; i++) {
			if (isPrime(i) && number % i == 0) { 
				result[count++] = i;
			}
		}
		long[] newOnes = Arrays.copyOfRange(result, 0,count);
		System.out.println("snt cua " + number  + "--> " + Arrays.toString(newOnes));
		return newOnes;
	}

	private static boolean isPrime(long number) {
		for (long i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}