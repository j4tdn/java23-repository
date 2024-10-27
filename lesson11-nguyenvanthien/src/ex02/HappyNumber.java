package ex02;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
		public static boolean HappyNumberof(int number) {
			Set<Integer> Numbers = new HashSet<>();
			
			while (number !=1 && !Numbers.contains(number)) {
				Numbers.add(number);
				number = getSum(number);
			}
			
		}
		
		private static int getSum(int number) {
			int sum = 0;
			while (number >0) {
				int digit = number % 10;
				sum += digit *digit;
				number /= 10; 
			}
			return sum;
		}
		public static void main(String[] args) {
			int number =20;
			
			if
		}
}
