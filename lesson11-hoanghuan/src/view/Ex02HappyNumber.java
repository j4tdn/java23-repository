package view;

public class Ex02HappyNumber {
	public static void main(String[] args) {
		System.out.println(isHappyNumber(13));
	}
	
	private static int sumOfSquare(int n) {
		int s = 0;
		while (n > 0) {
			int digit = n % 10;
			s += digit * digit;
			n /= 10;
		}
		return s;
	}
	
	public static boolean isHappyNumber(int n) {
		int max = 10;
		for (int i = 0; i < max;  i++) {
			n = sumOfSquare(n);
			if ( n == 1) {
				return true;
			}
		}
		return false;
	}
	
}
