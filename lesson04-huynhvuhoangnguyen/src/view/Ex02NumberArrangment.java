package view;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex02NumberArrangment {
	
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number of random numbers: ");
		int n = ip.nextInt();
		
		if(n < 5 || n > 100) {
			System.out.println("Number of element must be between 5 and 100.");
			return;
		}
		

		int[] numbers = new int[n];
		for(int i = 0; i < n; i++) {
			numbers[i] = rd.nextInt(100) + 1;
		}
		System.out.println("Input:" + Arrays.toString(numbers));
		
		int countDivideBy7 = 0;
		int countDivideBy5And7 = 0;
		int countDivideBy5 = 0;
		int countOthers = 0;
		
		for(int number: numbers) {
			if(number % 5 == 0 && number % 7 == 0) {
				countDivideBy5And7++;
			} else if(number % 7 == 0) {
				countDivideBy7++;
			} else if (number % 5 == 0) {
				countDivideBy5++;
			} else {
				countOthers++;
			}
		}
		
		int[] divideBy7 = new int[countDivideBy7];
		int[] divideBy5 = new int[countDivideBy5];
		int[] divideBy5And7 = new int[countDivideBy5And7];
		int[] others = new int[countOthers];
		
		int indexDivisibleBy7 = 0;
		int indexDivisibleBy5 = 0;
		int indexDivisibleBy5And7 = 0;
		int indexOthers = 0;
		
		for(int number: numbers) {
			if(number % 5 == 0 && number % 7 == 0) {
				divideBy5And7[indexDivisibleBy5And7++] = number;
			} else if (number % 7 == 0) {
				divideBy7[indexDivisibleBy7++] = number;
			} else if (number % 5 == 0) {
				divideBy5[indexDivisibleBy5++] = number;
			} else {
				others[indexOthers++] = number;
			}
		}
		
		int[] result = new int[n];
		int index = 0;
		
		for(int number: divideBy7) {
			result[index++] = number;
		}
		
		for(int number: others) {
			result[index++] = number;
		}
		
		for(int number: divideBy5And7) {
			result[index++] = number;
		}
		
		for(int number: divideBy5) {
			result[index++] = number;
		}
		
		System.out.println("Output: " + Arrays.toString(result));
		ip.close();
	}
}
