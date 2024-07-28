package view;

import java.util.Scanner;

public class Ex04 {
	private static int sum(int[] a) {
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int n: a) {
			if(n < min) {
				min = n;
			}
			if(n > max) {
				max = n;
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			int number = a[i];
			boolean isValid = true;
			for(int j = 0; j<i; j++) {
				if(a[j] == number) {
					isValid = false;
					break;
				}
			}
			
			if(isValid && number != min && number!= max) {
				sum += number;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int [] a = {1, 5, 8,9,2,5,9};
		
		System.out.println("Tổng các ptu ko trùng nhau ( trừ lớn nhất và nhỏ nhất: " + sum(a));
	}
}
