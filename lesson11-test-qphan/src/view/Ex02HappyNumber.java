package view;

import java.util.HashSet;
import java.util.Set;

public class Ex02HappyNumber {
	
	public static void main(String[] args) {
		System.out.println("\nIs Happy --> " + isHappy(49));
	}
	
	private static boolean isHappy(int number) {
		System.out.print(number + " ");
		Set<Integer> storage = new HashSet<>();
		
		while(!storage.contains(number)) {
			storage.add(number);
			number = sumOfSquare(number);
			if (number == 1) {
				System.out.println(number);
				return true;
			}
			System.out.print(number + " ");
		}
		
		return false;
	}
	
	private static int sumOfSquare(int number) {
		int sum = 0;
		while(number != 0) {
			sum = sum + (number%10) * (number%10);
			number /= 10;
		}
		return sum;
	}
	
}
