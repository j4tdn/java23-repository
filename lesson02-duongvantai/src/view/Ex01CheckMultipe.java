package view;

import java.util.Scanner;

public class Ex01CheckMultipe {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in) ;
		int count = 0;
		final int max = 5;
		while(true) {
			System.out.println("Enter number N = ");
			String input = x.nextLine();
			count++;
			try {
				int N = Integer.parseInt(input);
				if(N % 2 == 0) {
					System.out.println(N + " --> true");
				}else {
					System.out.println(N + " --> false");
				}
			} catch (Exception e) {
				System.out.println("Error please enter");
			}
			if(count == max ) {
				System.out.println("Exceeding!");
				break;
			}
		}
	}
}
