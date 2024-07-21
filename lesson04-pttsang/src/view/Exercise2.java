package view;

import java.util.Random;

public class Exercise2 {
	private static Random rd;
	private static int[] numbers; 
	private static int []sortedNumbers;
	
	public static void main(String[] args) {
//		creteR(11);
		numbers = new int[] {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		print();
		sortedNumbers = sortNumber(numbers);
		printSortNumber();
	}
	
	public static void creteR(int n) {
		rd = new Random();
		numbers = new int[n];
		for(int i=0; i< numbers.length; i++) {
			numbers[i]= rd.nextInt(5,101);
		}
	}
	
	public static void print() {
		System.out.println("Danh sách các số: ");
		for(int numbers: numbers) {
			System.out.print(numbers+" ");
		}
	}
	
	public static void printSortNumber() {
		System.out.println("\n\nDanh sách các số sau khi sắp xếp: ");
		for(int numbers: sortedNumbers) {
			System.out.print(numbers+" ");
		}
	}
	
	public static int[] sortNumber(int[] numbers) {
		int n = numbers.length;
		int[] result = new int[n];
		int index = 0;
		
		// lấy só chia hết cho 7 vào đầu mảng
		for(int number: numbers) {
			if(number%7==0 && number%5 != 0) {
				result[index++]=number;
			}
		}
		
		// lấy số vừa chia hết cho 7 và chia hết cho 5 vào giữa mảng
		for(int number: numbers) {
			if(number%7==0 && number%5 == 0) {
				result[index++]=number;
			}
		}
		
		// lấy các số ko chia hết cho 5 & 7
		for(int number: numbers) {
			if(number%7!=0 && number%5 != 0) {
				result[index++]=number;
			}
		}
		
		// lấy số chia hết cho 5 vào cuối mảng
		for(int number: numbers) {
			if(number%5 == 0 && number%7!=0) {
				result[index++]=number;
			}
		}
		return result;
	}
}
