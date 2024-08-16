package view;

import java.util.Scanner;

public class Ex01SolveEquationquation {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.println("Enter a:");
				double a = Double.parseDouble(ip.nextLine());

				System.out.println("Enter b:");
				double b = Double.parseDouble(ip.nextLine());

				if (a == 0) {
					throw new ArithmeticException("denominator should not be zero !");

				}

				double x = -b / a;
				System.out.println("\nThe solution to the equation is: x = " + x);

			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a number.");
			}
		}
	}
}
