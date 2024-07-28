package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int[] a = {1, 5, 8, 9, 2, 5, 9};
		int[] b = {4, 2, 6, 6, 4, 15, 1};
		
		System.out.println("Sum a: " + sum(a));
		System.out.println("Sum b: " + sum(b));
	}
	
	private static int sum(int[] numbers) {
		int sum = 0;
		int[] num = new int[numbers.length];
		int max = numbers[0];
		int min = numbers[0];
		for(int n : numbers) {
			if(n > max) {
				max = n;
			}
			if(n < min) {
				min = n;
			}
		}
		
		int position = 1; //chạy trước 1 số
		for(int n : numbers) {
			if(n != max && n != min && !isPresent(numbers, n, position)) {
				sum += n;
				System.out.println("Number: " + n);
			}
			position++;
		}
		return sum;
	}
	
	private static boolean isPresent(int[] numbers, int value, int realPosition) {
		int count = 0;
		for(int i = 0; i < realPosition; i++) {
			if(value == numbers[i])
				count ++;
			if(count>=2)
				return true;
		}
		return false;
	}
}
