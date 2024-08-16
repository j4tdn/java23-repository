package view;

import java.util.Scanner;

public class Ex01FirstOrderEquations {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			try {
				caculate();
				break;
			} catch (ArithmeticException e) {
				System.out.println("The demon should not be a zero --> " + e.getMessage());
				System.out.println("Please input again");

			} catch (NumberFormatException e) {
				System.out.println("Inavailable number: " + e.getMessage());
				System.out.println("Please input again");
			}
		} while (true);
	}

	private static void caculate() {
		System.out.println("Input number a: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Input number b: ");
		int b = Integer.parseInt(sc.nextLine());
		int div = -b / a;
		System.out.println("The result is: " + div);
	}
}