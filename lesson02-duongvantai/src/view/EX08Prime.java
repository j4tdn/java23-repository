package view;

import java.util.Scanner;

public class EX08Prime {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int count = 0;
		final int max = 5;
		while(true) {
			System.out.println("Enter number N= ");
			String input = x.nextLine();
			count++;
			try {
				int N = Integer.parseInt(input);
				if(check(N) == true) {
					System.out.println(N + "--> true");
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
	private static boolean check(int n) {
		if(n < 2) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % 1 == 0) {
				return false;
			}
		}
		return true;
	}
}
