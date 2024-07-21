package view;

import java.util.Random;

public class Exercise5 {
	private static int n;
	private static Random rd;
	private static int[] numbers;
	
	public static void main(String[] args) {
		crateArray(4);
//		numbers =new int[] {8,5,9,20};
		System.out.print("Integer array: ");
		print();
		sortLevel(numbers);
		System.out.print("\nInteger array after sorting: ");
		print();
	}
	public static void crateArray(int n) {
		rd = new Random();
		numbers = new int[n];
		for(int i=0; i<numbers.length; i++) {
			numbers[i]=rd.nextInt(3,21);
		}
		
	}
	
	public static int countDivisors(int n) {
		int count=0;
			for(int i=1; i<=Math.sqrt(n); i++)
			{		
				if (n % i == 0) {
					count++;
					if (i != n / i) {
	                    count++;
	                }
				}
			}
		return count;
	}
	
	public static void sortLevel(int[] numbers) {
		int n = numbers.length;
		for(int i =0; i<n-1; i++ ) {
			for(int j=0; j<n-i-1; j++) {
				if(countDivisors(numbers[j]) > countDivisors(numbers[j+1]))
				{
					int temp = numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
	}
	
	public static void print() {
		for(int number:numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}
