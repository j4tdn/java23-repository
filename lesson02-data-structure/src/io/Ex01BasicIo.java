package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicIo {

	public static void main(String[] args) {
//		open connection to keyboard
//		Ip.nextLine() --> có line nên khi nhập gì nhấn enter thì sẽ nhận giá trị rỗng 
//		              --> thoát khoải lệnh đang nhập
//                    --> lưu "" vào string
//		-->  khi nhận giá trị lưu vào string xong --> xóa enter ra khỏi bộ đệm
		/*
		 * Đối với Ip.nextInt, Ip.nextFloat ---> ko nhập gì nhấn enter -->
		 */

		Scanner Ip = new Scanner(System.in);

		System.out.println("Enter first name: ");
		String firstName;
		firstName = Ip.nextLine();

		System.out.println("Enter last name:");
		String lastName = Ip.nextLine();

		System.out.println("Enter year of birth: ");
//		int yob = Ip.nextInt();
        
		int yob = Integer.parseInt(Ip.nextLine()); // Cách 2
		
		System.out.println("Enter average point: ");
		Double avergePoint = Double.parseDouble(Ip.nextLine()); // Cách 2

//	clean enter- khi k có lệnh này thì khi nhập enter ở avergePoint thì sẽ dư phím enter thì khi address sẽ lưu enter,bị trôi lệnh
// Cách 1
		Ip.nextLine();
// Cách 2: nextInt: không clean enter nên ta sẽ dùng: parseInt(nextLine)--->clean enter
		
		System.out.println("Enter address :");
		String address = Ip.nextLine();

		int age = Year.now().getValue() - yob + 1;

		System.out.println("\n==========\n");
		System.out.println("FirstName: " + firstName + "\n" + "LastName: " + lastName + "\n" + "Address: " + address
				+ "\n" + "Age: " + age + "\n" + "avergePoint: " + avergePoint);

//		close connection
	}

}
