package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicIo {

	public static void main(String[] args) {
		/*
		 ip.nextLine --> ko nhap gi nhan Enter --> thoat khoi lenh dang nhap
		                                       --> luu "" vao string
		             --> khi nhan gia tri luu vao string xong -> xoa enter khoi bo dem
		 VD: ip.nextInt, ip.nextFloat --> do nothing
		                          --> doi den khi nao nhap vao ky tu bat ky roi nhan Enter moi thoat khoi lenh dang nhap 
		             --> khi nhan gia tri luu vao KDL xong -> ko xoa enter khoi bo dem
		 
		 Troi lenh xay ra khi
		 + b1. Nhap xuat cho KDL !string
		 + b2. Nhap xuat cho KDL string
		 */
		
		//open connection to keyboard
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = ip.nextLine();
		
		System.out.print("Enter last name: ");
		String lastName = ip.nextLine();
		
		System.out.print("Enter year of birth: ");
		//int yob = ip.nextInt();
		int yob = Integer.parseInt(ip.nextLine());
		int age = Year.now().getValue() - yob + 1;
		
		System.out.print("Enter average point: ");
		//double avgPoint = ip.nextDouble();
		double avgPoint = Double.parseDouble(ip.nextLine());
		
		//clean Enter
		//ip.nextLine();
		
		System.out.print("Enter address: ");
		String address = ip.nextLine();
		
		System.out.println("\n==============\n");
        System.out.println("FirstName = "+ firstName + "\n"
        		    + "LastName = " + lastName + "\n"
        		    + "Address = " + address + "\n"
        		    + "Age = " + age + "\n"
        		    + "Point = " + avgPoint);		
		//close connection
		ip.close();
	}
}
