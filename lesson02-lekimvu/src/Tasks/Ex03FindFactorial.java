package Tasks;

import java.util.Scanner;

public class Ex03FindFactorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input positive Interger N: ");
		int N = sc.nextInt();
		int n = N;
		if (N < 0) {
			System.out.println("Please input again positive interger N:");
			N = sc.nextInt();
		}
		int x = 1;
		int i = 0;
		do {
			x = x * N;
			N--;
		} while (i < N);
		System.out.println("Factorial of "+n + " is: " + x);

	}

}

//
