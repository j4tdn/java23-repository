package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicIo {
	public static void main(String[] args) {
		/*
		 * ip.nextLine --> ko nhập gì nhấn Enter --> thoát khỏi lệnh đang nhập --> lưu
		 * "" vào string --> khi nhận giá trị lưu vào string xong -> xóa enter khỏi bộ
		 * đệm
		 * 
		 * #vd ip.nextInt, ip.nextFloat --> ko nhập gì nhấn Enter -> do nothing -> đợi
		 * đến khi nào nhập vào kí tự bất kỳ rồi nhấn enter thì mới hoàn thành --> khi
		 * nhận giá trị lưu vào KDL xong -> không xóa enter khỏi bộ đệm
		 * 
		 * Trôi lệnh xảy ra khi + b1. nhập xuất cho KDL !string -> ip.nextInt ... + b2.
		 * nhập xuất cho KDL string -> ip.nextLine
		 * 
		 */
		
		//open connection to keyboard
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstName = ip.nextLine();
		
		System.out.println("Enter Last Name: ");
		String lastName = ip.nextLine();
		
		// Ca 2 cach deu yeu cau nhap 1/n ki tu so
		//  nextInt --> k clean Enter
		// parseInt (nextLine) - >clean Enter
		System.out.println("Enter Year Of Birth: ");
		int yob = Integer.parseInt(ip.nextLine());
		// clean enter 
		// ip.nextLine();
		System.out.println("Enter address: ");
		String address = ip.nextLine();
		int age = Year.now().getValue() - yob + 1;
		
		System.out.print("Enter average point: ");
		// double avgPoint = ip.nextDouble();
		double avgPoint = Double.parseDouble(ip.nextLine());

		System.out.println("\n ================ \n");
		System.out.println("FirstName = " + firstName + "\n"
											+ "LastName = " + lastName + "\n"
											+ "Address = " + address + "\n"
											+ "Age = " + age + "\n"
											+ "Point = " + avgPoint + "\n");
		// close Connection
		ip.close();
	}
}
