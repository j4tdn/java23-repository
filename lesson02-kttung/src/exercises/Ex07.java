package exercises;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một số : ");
		int n = sc.nextInt();
		String binary ="";
		
		while (n>0) {
			binary = (n%2) + binary;
			n = n/2;
		}
		System.out.println("Số hệ nhị phân là : " +binary);
	}
}
