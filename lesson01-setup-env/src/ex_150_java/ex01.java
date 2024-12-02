package ex_150_java;

import java.util.Scanner;

public class ex01 {
	// Cộng 2 số trong java
	public static void main(String[] args) {
		
		int a;
		int b,sum;
		System.out.println("Hãy Nhập số a");
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		System.out.println("Hãy Nhập số b");
		Scanner sc2= new Scanner(System.in);
		b=sc2.nextInt();
		
		sum = a+b;
		System.out.println("Tổng 2 số a và b "+sum);
		
	}
}
