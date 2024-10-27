package view;

import java.util.HashSet;
import java.util.Scanner;

public class Ex02HappyNumber {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = ip.nextInt();
		
		if (isHappyNumber(n))
			System.out.println(n + " is a happy number ");
		else
			System.out.println(n + " is not a happy number ");
	}

	// hàm tính tổng các chữ số trong số đó
	public static int numSquareSum(int n) {
		int num = 0;
		while (n != 0) {
			int digit = n % 10;
			num += digit * digit;
			n /= 10;
		}
		return num;
	}

	static boolean isHappyNumber(int n) {
		HashSet<Integer> st = new HashSet<>();
		while (true) {
			n = numSquareSum(n);
			if (n == 1)
				return true;
			if (st.contains(n))
				return false;
			st.add(n);
		}
	}

}
