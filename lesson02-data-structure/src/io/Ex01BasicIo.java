package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicIo {

	public static void main(String[] args) {

		/*
		 * khi nhập giá trị .nextline nếu không nhập gì mà nhận enter thì luu giá trị
		 * null khi nhập giá trị .nextInt hoặc .nextFloat mà k nhập gì thì do nothing
		 * đợi nhập giá trị
		 * 
		 * 
		 * trôi lệnh xảy ra khi
		 * b1 nhập xuất KDL !string -> ip.nextInt
		 * b2 nhập xuất KDL string -> ip.nextLine
		 */

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = ip.nextLine();

		System.out.println("Enter last name: ");
		String lastName = ip.nextLine();

		System.out.println("Enter year of birth: ");
		//int yob = ip.nextInt();
		int yob = Integer.parseInt(ip.nextLine());
		//clear enter
		//ip.nextLine();
		
		System.out.println("Enter address: ");
		String address = ip.nextLine();
		
		System.out.println("Enter average point: ");
		double avgPoint = Double.parseDouble(ip.nextLine());

		int age = Year.now().getValue() - yob + 1;

		System.out.println("\n===========\n");
		System.out.println("FistName = " + firstName + "\n" 
							+ "LastName = " + lastName + "\n" 
							+ "Address = " + address+ "\n"
							+ "Age = " + age + "\n"
							+ "Average Point = " + avgPoint);
	}
}
