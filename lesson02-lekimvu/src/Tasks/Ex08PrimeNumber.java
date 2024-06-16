package Tasks;

import java.util.Scanner;

public class Ex08PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number: ");
		String n = sc.nextLine();
		int count = 0;
		do {
			if (isNumber(n)) {
				if (isPrime(Integer.parseInt(n))) {
					System.out.println(n + " is the prime number");
					break;
				} else
					System.out.println(n + " is not the prime number");
				break;
			}
		} while (count < 5);
		count++;
	}

	public static boolean isPrime(int n) {
		int i = 2;
		do {
			if (n % i == 0) {
				return false;
			} else
				i++;
			return true;
		} while (i < n);

	}

	public static boolean isNumber(String n) {
		try {

			int N = Integer.parseInt(n);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
