package exercises;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập số nguyên dương N: ");
			a = Integer.parseInt(sc.nextLine());
		} while (a < 1);
		
		if(primes(a) == true) {
			System.out.println( a + ": là số nguyên tố");
		}else {
			System.out.println( a + ": không phải là số nguyên tố");
		}
	}

	private static boolean primes(int n) {
		boolean retun = true;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				retun = false;
				break;
			}
		}
		return retun;
	}
}
