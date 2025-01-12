package ex_150_java;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập N");
		int n= ip.nextInt();
		
		int factorial =1;
		for(int i=1;i<=n;i++) {
			factorial *= i;
		}
		System.out.println("N="+factorial);
	}
}
