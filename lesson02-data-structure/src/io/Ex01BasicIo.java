package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicIo {

	public static void main(String[] args) {
		/*
		 ip,nextLine --> không nhập gì ấn Enter --> thoát ra khỏi lệnh đang nhập
		 										--> lưu "" vào string
		 			 --> khi nhận giá trị lưu vào string xong -> xóa enter khỏi bộ đệm
		 #vd ip.nextFloat, ip.nextInt
		 			 -->không nhập gì ấn Enter -> do nothing
		 						-> đợi đến khi nào nhập ký tự bất kỳ rồi nhấn enter thì
		 						mới hoàn thành lệnh
		 			 --> khi nhận giá trị lưu vào KDL xong -> không xóa enter khỏi bộ đệm
		 
		 Trôi lệnh xảy ra khi
		 	+ nhập xuất cho KDL !string -> ip.nextInt ...
		 	+ nhập xuất cho KDL string -> ip.nextLine
		 
		 */
		
		// open connection to keyboard
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String firstName = ip.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = ip.nextLine();
		
		// Cả hai cách đều yêu cầu nhập 1/n ký tự số
		// nextInt --> k clean enter
		// parseInt(nextLine) -> clean enter
		System.out.println("Enter year of birth: ");
		// int yob = ip.nextInt();
		int yob = Integer.parseInt(ip.nextLine());

		System.out.println("Enter average point: ");
		// avgPoint = ip.nextDouble();
		double avgPoint = Double.parseDouble(ip.nextLine());
		
		// clean enter
		// ip.nextLine();
		
		System.out.println("Enter address: ");
		String address = ip.nextLine();
		
		int age = Year.now().getValue() - yob + 1;
		
		System.out.println("\n============\n");
		System.out.println("FirstName = " + firstName + "\n"
						 + "LastName = " + lastName + "\n"
						 + "Address = " + address + "\n"
						 + "Age = " + age + "\n"
						 + "Point = " + avgPoint);
		
		
		// close connection
		ip.close();
	}
	
}
