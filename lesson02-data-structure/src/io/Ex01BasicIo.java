package io;

import java.util.Scanner;

public class Ex01BasicIo {
	

	public static void main(String[] args) {
		// open connection to keyboard
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter first name ");
		String firstName = ip.nextLine();
		
		System.out.println("enter last name ");
		String lastName = ip.nextLine();
		
		System.out.println("enter address ");
		String address = ip.nextLine();
		
		System.out.println("enter year of birth ");
		//int yob = ip.nextInt(); 
		int yob =  Integer.parseInt(ip.nextLine());
		
		System.out.println("enter year of birth ");
		double avgpoint =  Double.parseDouble(ip.nextLine());
		
		System.out.println("\n=====================\n");
		System.out.println("first name "+firstName+"\n");
		System.out.println("last name "+lastName+"\n");
		System.out.println("address name "+address+"\n");
		System.out.println("age "+yob+"\n");
		

	}

}
