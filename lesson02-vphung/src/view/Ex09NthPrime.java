package view;

import utils.MathUtils;

public class Ex09NthPrime {

	public static void main(String[] args) {
		
		System.out.println("\n====>The 200th prime number = " + findNthPrime(200));
	}
	
	private static long findNthPrime(int nth) {
		long running = 2;
		int count = 0;
		while(true) {
			if (MathUtils.isPrime(running)) {
				System.out.println(running + "");
				if (++count  == nth ) {
					return running;
				}
			}
			running++;
		}
	}
}
