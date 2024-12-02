package ex_150_java;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hãy Nhập số năm cần tính");
		n=sc.nextInt();
		
		if(n%400==0) {
			System.out.println("Đây là Năm Nhuận");
		}
		else {
			System.out.println("Đây là năm không nhuận");
		}
	}
}
