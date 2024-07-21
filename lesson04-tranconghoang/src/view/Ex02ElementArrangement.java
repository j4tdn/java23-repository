package view;

import java.util.Random;

public class Ex02ElementArrangement {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int n = rd.nextInt(5, 101);
		System.out.println("Mảng số nguyên có " + n + " phần tử");
		
		int[] numbersBefore = new int[n];
		int[] numbersAfter = new int[numbersBefore.length];
		
		for(int i = 0; i < numbersBefore.length; i++)
			numbersBefore[i] = rd.nextInt(1, 100);
		
		System.out.println("Input -->");
		
		for(int i = 0; i < numbersBefore.length; i++) {
			if(i == numbersBefore.length - 1) {
				System.out.print(numbersBefore[i]);
				break;
			}
			System.out.print(numbersBefore[i] + ", ");
		}
		int count = 0;
		for(int number: numbersBefore)
			if(number % 7 == 0 && number % 5 != 0) {
				numbersAfter[count] = number;
				count++;
			}
		for(int number: numbersBefore)
			if(number % 7 == 0 && number % 5 == 0) {
				numbersAfter[count] = number;
				count++;
			}
		for(int number: numbersBefore)
			if(number % 7 != 0 && number % 5 != 0) {
				numbersAfter[count] = number;
				count++;
			}
		for(int number: numbersBefore)
			if(number % 7 != 0 && number % 5 == 0) {
				numbersAfter[count] = number;
				count++;
			}
		
		System.out.println("\nOutput -->");
		for(int i = 0; i < numbersAfter.length; i++) {
			if(i == numbersAfter.length - 1) {
				System.out.print(numbersAfter[i]);
				break;
			}
			System.out.print(numbersAfter[i] + ", ");
		}
	}
	
	
}
