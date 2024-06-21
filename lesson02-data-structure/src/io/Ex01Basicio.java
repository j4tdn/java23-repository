package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicIo {
	
	public static void main(String[] args) {
		/*
		 ip.nextLine --> ko nhập gì nhấn Enter --> thoát khỏi lệnh đang nhập
		                                       --> lưu "" vào string
		             --> khi nhận giá trị lưu vào string xong -> xóa enter khỏi bộ đệm
		                                      
		 #vd ip.nextInt, ip.nextFloat
		             --> ko nhập gì nhấn Enter -> do nothing
		                                       -> đợi đến khi nào nhập vào kí tự bất kỳ rồi nhấn enter thì mới hoàn thành                                       
		             --> khi nhận giá trị lưu vào KDL xong -> không xóa enter khỏi bộ đệm
		 
		 Trôi lệnh xảy ra khi
		 + b1. nhập xuất cho KDL !string -> ip.nextInt ...
		 + b2. nhập xuất cho KDL string -> ip.nextLine
		             
		 */
		
		// open connection to keyboard
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = ip.nextLine();
		
		System.out.print("Enter last name: ");
		String lastName = ip.nextLine();
		
		// Cả 2 cách đều yêu cầu nhập 1/n kí tự số
		// nextInt --> ko clean enter
		// parseInt(nextLine) -> clean enter
		System.out.print("Enter year of birth: ");
		// int yob = ip.nextInt();
		int yob = Integer.parseInt(ip.nextLine());
		
		System.out.print("Enter average point: ");
		// double avgPoint = ip.nextDouble();
		double avgPoint = Double.parseDouble(ip.nextLine());
		
		// clean enter
		// ip.nextLine();
		
		System.out.print("Enter address: ");
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