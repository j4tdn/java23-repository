package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicIo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);//open connection to keyboard
		System.out.print("Enter first name: ");
		String firstName = ip.nextLine();
		System.out.print("Enter last name: ");
		String lastName = ip.nextLine();
		
		// Cả 2 cách đều yêu cầu nhập 1/n kí tự số
				// nextInt --> ko clean enter
				// parseInt(nextLine) -> clean enter
		
		System.out.print("Enter year of birth: ");
		int yob = Integer.parseInt(ip.nextLine());
		System.out.print("Enter average point: ");
		 //double avgPoint = ip.nextDouble(); //(*)trên máy thực tế nhập vào là. ex: "20\n" khi dùng "nextDouble" thì chỉ đọc số "double" ko đọc dc "\n" nên khi gọi "nexLine" tiếp ở dòng dưới nó sẽ đọc "\n" và trả về null
		double avgPoint = Double.parseDouble(ip.nextLine());
		 System.out.print("Enter address: ");
			String address = ip.nextLine(); //ko thể nhập nếu ở trên dùng(*)
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
