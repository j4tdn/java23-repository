package view;

import java.util.Arrays;

import functional.IntTest;

public class Ex05OperationsT {
	/*
	 Cho danh sách mảng số nguyên gồm 5 phẩn tử
	 Viết chướng trình
	 + Tìm các phần tử chẵn trong mảng
	 + Tìm các phần tử là bội của 5 trong mảng
	 + Tìm các phần tử là số nguyên tố
	 */

	public static void main(String[] args) {
		int [] numbers = {0, 20, 50, 13, 12, 28, 77, 66, 29};
		
		IntTest evenTest = nbr -> nbr % 2 == 0;
		
		System.out.println(" Số nguyên tố ==> " + Arrays.toString(getNumbers(numbers, nbr -> isPrime(nbr))));
	}
	private static int[] getNumbers(int[] source, IntTest intTest) {
		int[] target = new int[source.length];
		int count = 0;
		for ( int number: source) {
			if (intTest.strategy(number)) {
				target[count++] = number;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	
	private static int[] getPrimeNumbers(int[] source) {
		int[] target = new int[source.length];
		int count = 0;
		for ( int number: source) {
			if (isPrime(number)) {
				target[count++] = number;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if ( number % i == 0) {
				return false;
				
			}
		}
		return true;
	}
}
