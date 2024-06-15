package view;

import java.util.Scanner;

public class Ex07ConvertToBinary {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter N= ");
		int n = ip.nextInt();
		
		String binary = "";
		while (n > 0) {
			binary = (n%2) + binary;
			n = n/2;			
		}
		
		System.out.println("Convert To Binary: " + binary);
		ip.close();
	}
}
