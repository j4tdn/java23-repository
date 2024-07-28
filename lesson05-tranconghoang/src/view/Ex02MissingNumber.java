package view;

import java.util.Random;

public class Ex02MissingNumber {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int n = rd.nextInt(1,20);
		int random = rd.nextInt(1,n);
		int numbers[] = new int[n-1];
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = n;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == random) {
				System.out.println("Phan tu can tim co gia tri: " + (numbers.length - 1));
				break;
			}
			else
			System.out.println("Phan tu can tim co gia tri: " + numbers.length);
		}
		
	}
	
}
