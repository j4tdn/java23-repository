package Tasks;

import java.util.Scanner;

public class Ex06CompareNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int number1 = sc.nextInt();
		System.out.println("Enter first number: ");
		int number2 = sc.nextInt();
		System.out.println("Enter first number: ");
		int number3 = sc.nextInt();
		int max;
		int min;
		if (number1 > number2 || number2 > number3) {
			max = number1;
			min = number3;
			System.out.println("The highest number is: " + max);
			System.out.println("The min number is: " + min);

		} else if (number1 < number2 || number2 < number3) {
			max = number3;
			min = number1;
			System.out.println("The highest number is: " + max);
			System.out.println("The min number is: " + min);

		} else if (number2 > number1 || number1 > number3) {
			max = number2;
			min = number3;
			System.out.println("The highest number is: " + max);
			System.out.println("The min number is: " + min);

		} else if (number1 > number3 || number3 > number2) {
			max = number1;
			min = number2;
			System.out.println("The highest number is: " + max);
			System.out.println("The min number is: " + min);

		}
	}
}
