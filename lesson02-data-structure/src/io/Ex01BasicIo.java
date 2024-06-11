package io;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicIo {
	public static void main(String[] args) {
		//open connection to keyboard
		
		/*
		 * ip.nextLine --> không nhập gì cả nhấn enter -->thoát khỏi lệnh đang nhập
		 * 												-->lưu "" vào string
		 *vd ip.nẽtLine ip.nextFloat
		 * 	-->không nhập gì cả nhấn enter -> do nothing
		 * 								   ->đợi đến kho nào nhập vào kí tự bất kì rồi nhấn enter
		 * 	--> khi nhận giá trị lưu vào kdl xong ->không xóa enter khỏi bộ đệm
		 * Trôi lệnh xảy ra khi
		 * +nhập xuất cho kdl !string ->ip.nextine ...
		 * b2.nhập xuất cho kdl string ->ip.nextLine
		 * 
		 */
		Scanner ip= new Scanner(System.in);
		
		System.out.print("Enter first name :");
		String firstName = ip.nextLine();
		
		System.out.print("Enter last name :");
		String lastName = ip.nextLine();
		
		System.out.print("Enter address :");
		String address = ip.nextLine();
		
		//cả 2 cách đều nhập theo yêu cầu 1/n kí tự số
		//nextInt -> kh clear enter
		//parseInt(ip.nextLine) -> clear enter
		System.out.println("Enter year of birth :");
//		int yob =ip.nextInt();
		int yob = Integer.parseInt(ip.nextLine()); 
		
		System.out.println("Enter average point ");
//		double avgPoint = ip.nextDouble();
		double avgPoint = Double.parseDouble(ip.nextLine());
		
		//clean enter
		ip.nextLine();
		
		int age =Year.now().getValue() - yob +1;
		
		System.out.println("\n==============\n");
		System.out.println("FirstName = "+ firstName+"\n"+"LastName"+lastName+ "\n"+ "address "+address +"\n" + "Age "+age +"Point"+ avgPoint);
		
		//close connection
		ip.close();
	}
}
