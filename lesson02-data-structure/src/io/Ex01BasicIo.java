package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicIo {
	public static void main(String[] args) {
		//open Connection
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = ip.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = ip.nextLine();
		
		System.out.println("Enter average point: ");
		Double avgPoint = Double.parseDouble(ip.nextLine());
		
		//ip.nextLine();
		
		System.out.println("Enter address: ");
		String address = ip.nextLine();
		
		System.out.println("Enter year of birth: ");
		int yob = Integer.parseInt( ip.nextLine());
		 int age = Year.now().getValue()- yob +1;
		System.out.println("-----------------");
		System.out.println("Firstname= "+firstName +"\n"
				+"LastName = "+ lastName +"\n"
				+"Address = "+ address+"\n"
				+"Age = "+age+"\n"
				+"AvgPoint ="+avgPoint
				);
		//close
		ip.close();
	}
}
