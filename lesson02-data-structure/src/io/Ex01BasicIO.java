package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicIO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		ip.nextLine -> Kết thúc khi nhấn enter -> lấy chuỗi trước khi nhấn enter 
//		->> nên xoá bộ đệm sau khi nhập.
//		ip.nextInt -> Kết thúc khi nhấn số!
		
		System.out.println("Enter first name: ");
		String fName = sc.nextLine();
		
		System.out.println("Enter last name: ");
		String lName = sc.nextLine();

		System.out.println("Enter year of birth");
		int yob = sc.nextInt();
		
		System.out.println("Enter avg points: ");
		double avg = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Enter address: ");
		String address = sc.nextLine();
		
		//Cách 2: int a = Integer.parseInt(sc.nextLine());
		
		int age = Year.now().getValue() - yob + 1;
		
		System.out.println("-----------");
		System.out.println("Name: "+fName + " " + lName +"\nAddress:"+ address + "\nAge: " + age +"\nAvg point: " + avg);
	}
}
