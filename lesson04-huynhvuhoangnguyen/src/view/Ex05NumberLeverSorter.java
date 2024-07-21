package view;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import bean.NumberWithLevel;

public class Ex05NumberLeverSorter {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of elements (n): ");
		int n = ip.nextInt();
		
		if(n < 3 || n > 20) {
			System.out.println("Number of element out of range [3, 20].");
			return;
		}
		
		int[] numbers = generateRandomArray(n);
		System.out.println("Original Array: " + Arrays.toString(numbers));
		
		sortArrayByLevel(numbers);
		System.out.println("Sorted array by levels: " + Arrays.toString(numbers));
	}
	
	public static int[] generateRandomArray(int n) {
		Random rd = new Random();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = rd.nextInt(18) + 3;
		}
		return array;
	}
	
	public static void sortArrayByLevel(int[] numbers) {
		NumberWithLevel[] numberWithLevels = new NumberWithLevel[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			numberWithLevels[i] = new NumberWithLevel(numbers[i]);
		}
		
		Arrays.sort(numberWithLevels, (a, b) -> Integer.compare(a.getLevel(), b.getLevel()));
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = numberWithLevels[i].getNumber();
		}

	}
}
