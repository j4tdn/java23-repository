import java.util.Arrays;

import functional.IntTest;
public class EX05operations {
	
	public static void main (String[] args) {
		
	}
	
	private static int[] getNumber (int[] source, IntTest intTest) {
		int[] target = new int[source.length];
		int count = 0;
		for (int number : source) {
			if (IntTest.stragecy(number)) {
				target [count++] = number;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static boolean isPrime (int number) {
		if (number == 1 || number == 0) {
			return false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (i >= 2) {
				return false;
			}
		}
		return true;
	}
}
