package io;

import java.time.Year;
import java.util.Scanner;

        public class Ex01BasicIo {
        	
        public static void main(String[] args) {
        	
	Scanner ip = new Scanner(System.in);
	
	System.out.println("Enter first name: ");
	String firstName = ip.nextLine();
	
	System.out.println("Enter last name: ");
	String lastName = ip.nextLine();
	
	System.out.println(" Enter year of birtnh: ");
	int yob = ip.nextInt();
	
	
	
	System.out.println("Enter average point");
	double avgPoint = ip.nextDouble();
	
	
	
	System.out.println("Enter address: ");
	String address = ip.nextLine();
	
	int age = Year.now().getValue() - yob +1;
	
	
	
	
	System.out.println("\n========\n");
	System.out.println("firstName  = " + firstName + "");
	
	ip.close();
	
   }
}
