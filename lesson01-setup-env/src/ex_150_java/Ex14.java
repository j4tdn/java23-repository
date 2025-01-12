package ex_150_java;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Hay nhap a");
		int a = ip.nextInt();	
		
		System.out.println("Hay nhap b");
		int b = ip.nextInt();
		
		System.out.println("Hay nhap c");
		int c = ip.nextInt();
		
		int max =a;
		if(b>a) {
			max = b;
			
		}
		if(c>max) {
			max =c;
		}
		
		int min =a;
		if(b<min) {
			min =b;
		}
		if(c<min) {
			min=c;
		}
		System.out.println("Max"+max);
		System.out.println("Min"+min);
	}
}
