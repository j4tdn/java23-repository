package view;

import java.util.Scanner;

public class Ex04FindSum {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input length of Array:");
		int n = ip.nextInt();
		if(n < 1) {
			System.out.println("Input wrong size!");
			return;
		}
		int[] arr = new int[n];
		System.out.println("Input number for array: ");
		for(int i = 0; i < n; i++) {
		arr[i] = ip.nextInt();
		}
		
		int result = sum(arr);
		
		if(n >= 3) {
			System.out.println("Sum: "+ result);
		}else {
			System.out.println("Not enough number");
		}
	}
	
	private static int sum(int[] arr) {
		if(arr == null||arr.length <=2) {
			return 0;
		}
		int min = arr[0];
		int max = arr[0];
		int sum = 0;
		
		for(int number: arr) {
			if(number < min) {
				min = number;
			}
			if(number> max) {
				max =number;
			}
			sum+= number;
		}
		
		sum -= max;
		sum -= min;
		
		for(int i = 0; i<arr.length-1;i++) {
			for(int j = i + 1; j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					sum -=arr[i];
					break;
				}
			}
		}
		return sum;
	}
}
