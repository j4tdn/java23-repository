package exam;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (isSpecialNumber(n)) {
			System.out.println(n + " là số đặc biệt");
		} else {
			System.out.println(n + " không phải là số đặc biệt ");
		}
	}
	 public static boolean isSpecialNumber(int n) {
		if(n==1) {
			return true;
		}
		int sum = 0;
		for (int i = 1; i < n; i++) {
			sum += 1;
			if (sum == n) {
				return true;
			}
		}
		return false;
	}
}
