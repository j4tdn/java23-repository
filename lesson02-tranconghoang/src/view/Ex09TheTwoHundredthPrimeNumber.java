package view;

public class Ex09TheTwoHundredthPrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i < 10000; i++) {
			if(checkPrimeNumber(i))
				count++;
			if(count == 200) {
				System.out.println("So nguyen to thu 200 la " + i);
				break;
			}
		}
	}
	private static boolean checkPrimeNumber(int n) {
		if(n < 2) return false;
		for(int i = 2; i <= n/2; i++ )
			if(n % i == 0) return false;
		return true;
	}
}
