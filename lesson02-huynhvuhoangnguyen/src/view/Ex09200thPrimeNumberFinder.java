package view;

public class Ex09200thPrimeNumberFinder {

	public static boolean isPrimeNumber(int n) {
		if (n <= 1) {
			return false;
		}
		if (n <= 3) {
			return true;
		}
		if (n % 2 == 0 || n % 3 == 0){
			return false;
		}
		int sqrtN = (int) Math.sqrt(n);
		for (int i = 5; i <= sqrtN; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;

	}
	
	public static int findNthPrimeNumber(int n) {
		int count = 0;
		int number = 1;
		
		while (count < n) {
			number++;
			if(isPrimeNumber(number)) {
				count++;
			}
		}
		return number;
		
	}
	
	public static void main(String[] args) {
		int nthPrimeNumber = 200;
		int primeNumber = findNthPrimeNumber(nthPrimeNumber);
		System.out.println("The " + nthPrimeNumber + "th prime number is: " + primeNumber);
	}
	
}
