package ex_150_java;

import java.util.Random;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Random rd = new Random();
		
//		int a = rd.nextInt(10,20);
//		int b = rd.nextInt(10,20);
//		int c = rd.nextInt(10,20);
//		int d = rd.nextInt(10,20);
		  Scanner ip = new Scanner(System.in);
	        
	        // Nhập các số nguyên dương a, b, c, d
		    System.out.println("Nhập số nguyên dương a:");
	        int a = ip.nextInt();
	        System.out.println("Nhập số nguyên dương b:");
	        int b = ip.nextInt();
	        System.out.println("Nhập số nguyên dương c:");
	        int c = ip.nextInt();
	        System.out.println("Nhập số nguyên dương d:");
	        int d = ip.nextInt();
	        
		long sum = factorial(a)+ factorial(b)+factorial(c)+factorial(d);
		System.out.println("Tổng giao thừa a , b ,c ,d là"+sum);
		
		
	}
	public static long factorial (int n) {
		long result =1;
		for (int i=1;i<=n;i++) {
			result *=i;
		}
		return result;
	}
}
