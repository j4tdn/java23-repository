package ex_150_java;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Hãy Nhập Số a");
		a= sc.nextInt();
		
		
		System.out.println("Hãy Nhập Số b");
		b= sc.nextInt();
		c=a*b;
		System.out.println("Nguyên a và b "+c);
		
	}
}
