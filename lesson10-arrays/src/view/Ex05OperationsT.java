package view;

import java.util.Arrays;

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
		
		printf("So chan", numbers, nbr -> nbr % 2 == 0);
		printf("So boi cua 5", numbers, nbr -> nbr % 5 == 0);
		printf("So nguyen to", numbers, nbr -> isPrime(nbr));
	}
	
	private static void printf(String prefix, int[] numbers, IntTest);
	
	private static int[] getNumbers(int[] source, IntTest intTest) {
		int[] target = new int [source.length];
		int count = 0;
		for (int number: source) {
			if(intTest.strategy(number)) {
				target[count++] = number;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
	}
	return true;
}
