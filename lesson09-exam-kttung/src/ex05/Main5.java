package ex05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập số cần kiểm tra: ");
		int number = sc.nextInt();
		
		if (isHappyNumber(number)) {
			System.out.println(number + " là số hạnh phúc");
		} else {
			System.out.println(number + " không phải là số hạnh phúc");
		}
		
		sc.close();
	}
	
	public static int getSumOfSquaresOfDigits(int number) {
		int sum = 0;
		while (number > 0) {
			int digit = number % 10;
			sum += digit * digit;
			number /= 10;
			
		}
		return sum;
	}
	
	public static boolean isHappyNumber(int number) {
		Set<Integer> seenNumber = new HashSet<>();
		
		while (number != 1 && !seenNumber.contains(number)) {
			seenNumber.add(number);
			number = getSumOfSquaresOfDigits(number);
			
		}
		return number == 1;
	}
}
