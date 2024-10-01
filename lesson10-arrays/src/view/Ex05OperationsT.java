package view;

import java.util.Arrays;

import functional.IntTest;

public class Ex05OperationsT {

	public static void main(String[] args) {
		int[] numbers = {0, 20, 50, 13, 12, 28, 77, 66, 29};
		
		printf("So chan ", numbers, nbr -> nbr % 2 == 0);
		printf("So boi cua 5 ", numbers, nbr -> nbr % 5 == 0);
		printf("So nguyen to ", numbers, nbr -> isPrime(nbr));
	}
	
	private static void printf(String prefix, int[] numbers, IntTest intTest) {
		System.out.println(prefix + "==> " + Arrays.toString(getNumbers(numbers, intTest)));
	}
	
	private static int[] getNumbers(int[] source, IntTest intTest) {
		int[] target = new int[source.length];
		int count = 0;
		for(int number: source)
			if(intTest.strategy(number))
				target[count++] = number;
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static boolean isPrime(int number) {
		if(number < 2)
			return false;
		for(int i = 2; i <= number / 2; i++)
			if(number % i == 0)
				return false;
		return true;
	}
}
