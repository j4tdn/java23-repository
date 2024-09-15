package view;

import java.util.Scanner;

public class Ex03StringProcessing {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap chuoi ky tu: ");
		String text = ip.nextLine();
		revert(text);
	}
	
	private static void revert(String text) {
		text = text.replaceAll("\\s+", " ");
		int length = text.length();
		for(int i = length - 1; i >= 0; i--)
			System.out.print(text.charAt(i));
	}
}
