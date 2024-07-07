package view_fixcode;

import utils.MathUtils;

public class Ex09NthPrime {

	public static void main(String[] args) {

		System.out.println("The 200th prime number = " + findNthPrime(200));

	}

	private static long findNthPrime(int nth) {
		long running = 2;
		int count = 0;
		while (true) {
			if (MathUtils.isPrime(running)) {
				if (++count == nth) {
					return running;
				}
			}
			running++;
		}
	}

}
