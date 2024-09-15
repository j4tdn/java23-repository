package view;

import java.util.Scanner;

public class Ex04Password {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Account: ");
		String acc = ip.nextLine();
		System.out.println("Enter PassWord: ");
		while(true) {
			String pass = ip.nextLine();
			if(pass.length() < 8) {
				System.out.println("Enter again");
			}
			
		}
	}

}
