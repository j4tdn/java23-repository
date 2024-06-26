package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicIo {
	public static void main(String[] args) {
		//Open connection to keyboard
		
		/*
		 ip.nextLine --> ko nhận gì nhấn Enter --> thoát khỏi lệnh đang nhập
		 									   --> lưu "" vào String
					 --> khi mà nhận giá trị lưu vào String xong --> xóa Enter khỏi bộ đệm
					 
		#vd ip.nextInt, ip.nextFloat
					--> ko nhận gì nhấn Enter --> do nothing
											  --> dợi đến khi nào nhập vào kí tự bất kì rồi nhấn Enter thì mới hoàn thành
					--> khi mà nhận giá trị lưu vào KDL xong --> Không xóa Enter khỏi bộ đệm
					
		Trôi lệnh xảy ra khi
		+b1. nhập xuất cho KDL ko phải là String -> ip.nextInt...
		+b2. nhập xuất cho KDL String -> ip.nextLine
		 */
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter firstname: ");
		String firstName = ip.nextLine();
		
		System.out.print("Enter lastname: ");
		String lastName = ip.nextLine();
		
		// Cả 2 cách đều yêu cầu nhập 1/n kí tự số
		// nextInt --> ko clean Enter
		// parseInt(nextLine) --> Clean Enter
		
		System.out.print("Enter year of birth: ");
		// int yob = ip.nextInt();
		// C2: 
		int yob = Integer.parseInt(ip.nextLine());
		
		System.out.print("Enter average point: ");
		// double avgPoint = ip.nextDouble();
		double avgPoint = Double.parseDouble(ip.nextLine());
		
		// Clean Enter
		// C1: ip.nextLine();
		
		System.out.print("Enter address: ");
		String address = ip.nextLine();
		
		int age = Year.now().getValue() - yob + 1;
		
		System.out.println("\n================\n");
		System.out.println("FirstName = " + firstName + "\n"
						+ "LastName = " + lastName + "\n"
						+ "Address = " + address + "\n"
						+ "Age = " + age + "\n"
						+ "Point = " + avgPoint);
		
		// close connection
		ip.close();
	}
}