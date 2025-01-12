package ex_150_java;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Hãy Nhập a là");
		int a = ip.nextInt();
		
		if(a<10) {
			System.out.println("A phair hon 10 chuws so");
		}else
		if(isPalindrome(a)) {
			System.out.println("Laf soos doi xubngw");
		}else {
			System.out.println("Khoong phai laf soos doi xung");
		}
	}
	public static boolean isPalindrome(int n) {
		int original = n;
		int reversed =0;
		while(n != 0) {
			int digit = n%10;
			reversed =reversed *10+digit;
			n/=10;
		}
		return original == reversed;
	}
}
