package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicIo {
	public static void main(String[] args) {
		/*
		 ip.nextLine --> ko nhập gì nhấn enter --> thoát khỏi lệnh đang nhập 
		 										--> lưu "" vào string
		 			--> khi nhận giá trị lưu vào string xong --> xóa enter khỏi bộ đệm
		 
		 #vd ip.nextInt , ip.next Float	--> ko nhập gì nhấn enter --> do nothing
		 									  	--> đợi đến khi nào nhập vào kí tự bất kì rồi enter thì mới hoàn thành
		 								--> khi nhận giá trị lưu vào KDL xong --> không xóa enter khỏi bộ đệm
		Trôi lệnh xảy ra khi
		+ b1. nhập xuất cho KDL !string -> ip.nextInt ...
		+ b2. nhập xuất cho KDL string --> ip.nextLine
		
		 */
		
		// open connection to keyboard
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter Firstname: ");
		String firstName = ip.nextLine();
		
		System.out.print("Enter Lastname: ");
		String lastName = ip.nextLine();
		
		//Cả 2 cách đều yêu cầu nhập 1/n kí tự số
		//nextInt --> ko clean enter
		//pareInt(nextLine) --> clean enter
		System.out.print("Enter year of birth: ");
		//int yob = ip.nextInt();
		int yob = Integer.parseInt(ip.nextLine());
		
		System.out.println("Enter average point");
		//double avgPoint = ip.nextDouble();
		double avgPoint = Double.parseDouble(ip.nextLine());
		
		//clean enter
		//ip.nextline();
		
		System.out.print("Enter address: ");
		String address = ip.nextLine();
		
		int age = Year.now().getValue() - yob + 1;
		
		System.out.println("\n============\n");
		System.out.println("Firstname= " + firstName + "\n"
						+	"Lastname = " + lastName + "n"
						+	"Address = " + address + "\n"
						+	"Age =" + age + "\n"
						+ "Point = " + avgPoint);
		
		
		// close connection
		ip.close();
	}
}
