package view;

import java.util.HashSet;
import java.util.Set;

public class Ex02HappyNumber {
	
	public static void main(String[] args) {
		Ex02HappyNumber checkHappyNumber = new Ex02HappyNumber();
		int number = 44;
		
		if (checkHappyNumber.isHappyNumber(number)) {
			System.out.println(number + " is a happy number ");
		}else {
			System.out.println(number + " is not happy number ");
		}
	}
	
	public boolean isHappyNumber(int number) {
		Set<Integer> checkNumbers = new HashSet<>();
		while (number != 1 && !checkNumbers.contains(number)) {
			checkNumbers.add(number);
			number = getSumOfSquares(number);
		}
		
		return number == 1;
	}
	
	private static int getSumOfSquares(int n) {
		int sum = 0;
		
		while (n > 0) {
			int digit = n % 10;
			sum += digit * digit;
			n /= 10;
		}
		return sum;
	}
}
