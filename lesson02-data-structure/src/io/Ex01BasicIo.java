package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicIo {

	public static void main(String[] args) {
		
		/*
		 ip.nextline --> ko nhập gì nhấn Enter --> Thoát khỏi lệnh đang nhập
		 										--> Lưu "" vào String
		 			--> khi nhận giá trị lưu vào String xong
		 			--> xóa enter khỏi bộ đệm
		 			
		 #vd ip.nextInt, ip.nextFloat
		 --> ko nhập gì nhấn Enter --> do nothing
		 --> đợi đến khi nào nhập vào kí tự bất kù rồi nhấn Enter thì mới hoàn toàn hết thúc
		 			--> khi nhận giá trị lưu vào KDL xong
		 			--> không xóa enter khỏi bộ đệm
		 			
		 Trôi lệnh xảy ra khi:
		 + B1: nhập xuất cho KDL !string --> ip.nextInt...
		 + B2: nhập xuất cho KDL String --> ip.nextline
		 
		 */
		
		// open connection to keyboard
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = ip.nextLine();
		
		System.out.print("Enter last name: ");
		String lastName = ip.nextLine();
		
		// Cả 2 cách đều yêu cầu nhập 1/n kí tự
		// nextInt --> ko clean Enter
		// parseInt(nextline) -> clean enter
		System.out.print("Enter year of birth: ");
		// int yob = ip.nextInt();
		int yob = Integer.parseInt(ip.nextLine());
		
		
		System.out.print("Enter average point: ");
		// Double avgPoint = ip.nextDouble();
		double avgPoint = Double.parseDouble(ip.nextLine());
		
		
		System.out.print("Enter address: ");
		String address = ip.nextLine();
		
		int age = Year.now().getValue() - yob + 1;
		
		System.out.println("\n===================\n");
		System.out.println("FirstName = " + firstName + "\n"
				+ "LastName = " + lastName + "\n"
				+ "address = " + address + "\n"
				+ "Age = " + age + "\n"
				+ "AvgPoint = " + avgPoint);
		
		// close connection
		ip.close();
		
	}
}
