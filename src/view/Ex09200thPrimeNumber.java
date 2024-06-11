package view;

public class Ex09200thPrimeNumber {
	
	public static boolean isPrime (int n) {
		if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}
	
	public static void main (String args[]) {
		int count = 0;
        int number = 2;
        int nthPrime = 200;
        int primeNumber = 0;
        
        while (count < nthPrime) {
        	if (isPrime(number)) {
        		count++;
        		primeNumber = number;
        	}
        	number ++;
        }
        System.out.println("the 200th prime number is: " +primeNumber);
	}
}
