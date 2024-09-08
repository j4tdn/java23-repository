package view;

import java.util.Arrays;

public class Ex04PrimeNumber {

	public static void main(String[] args) {
		int x1 = 75;
		int x2 = 15;
		System.out.println("is common :" + Arrays.equals(findDivisiblePrimeNumber(x1), findDivisiblePrimeNumber(x2)));
	}
	
	private static boolean isPrimeNumber(int inputNumber) {
		for (int i = 2; i<inputNumber ; i++) {
			if (inputNumber % i == 0) return false;
		}
		return true;
	}
	private static int[] findDivisiblePrimeNumber(int input) {
		int count = 0;
		for (int i = 2; i < input; i++) {
			if ( input % i == 0) {
				count++;
			}
		}
		int[] divisibleNumbers =new int[count];
		count = 0;
		for (int i = 2; i < input; i++) {
			if ( input % i == 0 && isPrimeNumber(i)) {
				
				divisibleNumbers[count++] = i;
			}
		}
		System.out.println("uoc :" + Arrays.toString(divisibleNumbers));
		return Arrays.copyOfRange(divisibleNumbers, 0, count);
		
	}
	
	
}
