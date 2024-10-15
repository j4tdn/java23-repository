package view;

import java.util.Arrays;

import functional.IntTest;

public class Ex05OperationsT {
	
	/*
	 
	 Cho danh sách mảng số nguyên gồm 5 phần tử
	 Viết chương trình
	 + Tìm các phần tử chẵn trong mảng
	 + Tìm các phần tử là bội của 5 trong mảng
	 + Tìm các phần tử là số nguyên tố
	 */
	
	public static void main(String[] args) {
		int[] numbers = {0, 20, 50, 13, 12, 28, 77, 66, 29};
		
		printf("Số chẵn", numbers, nbr -> nbr % 2 == 0);
		printf("Số bội của 5", numbers, nbr -> nbr % 5 == 0);
		printf("Số nguyên tố", numbers, nbr -> isPrime(nbr));
	}
	
	private static void printf(String prefix, int[] numbers, IntTest intTest) {
		System.out.println(prefix + " ==> " + Arrays.toString(getNumbers(numbers, intTest)));
	}
	
	private static int[] getNumbers(int[] source, IntTest intTest) {
		int[] target = new int[source.length];
		int count = 0;
		for (int number: source) {
			if (intTest.strategy(number)) {
				target[count++] = number;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	
}