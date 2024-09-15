package view;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(ip.nextLine());
		if (isHappyNumber(n)) {
			System.out.println(n + " là số hạnh phúc");
		} else {
			System.out.println(n + " ko phải là số hạnh phúc");
		}
	}
	
	// 123 
	// 123 % 10 = 3
	//  3*3
	// 123 -> 12
	private static int sqrt(int number) {
		int sum = 0;
		while (number > 0) {
			int r = number % 10;
		    sum += r * r;
			number = number / 10;
		}
		return sum;
	}
	
	public static boolean isHappyNumber(int n) {
		int a = n;
		int b = n;

//		sqrt(n): 4*2 + 4*2 = 32
//		sqrt(sqrt(n)): 3*2 + 2*2 == 13

		do {
			a = sqrt(a);
			b = sqrt(sqrt(b));
		} while (a != b);

		return a == 1;
	}
	
}
