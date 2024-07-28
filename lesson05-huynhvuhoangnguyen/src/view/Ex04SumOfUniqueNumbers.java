package view;

import java.util.Arrays;

public class Ex04SumOfUniqueNumbers {

	public static void main(String[] args) {
		int[] array = {4, 2, 6, 6, 4, 15, 1};
		int sum = sumOfUniqueNumber(array);
		System.out.println("Tổng các phần tử không trùng nhau trong mảng ngoại trừ phần "
				+ "tử lớn nhất và nhỏ nhất là: " + sum);
	}
	
	public static int sumOfUniqueNumber (int[] array) {
		
		Arrays.sort(array);
		
		int sum = 0;
		
		for(int i = 1; i < array.length - 1; i++) {
			if(i > 1 && array[i] == array[i - 1]) {
				continue;
			}
			sum += array[i];
		}
		return sum;
	}
	
}
