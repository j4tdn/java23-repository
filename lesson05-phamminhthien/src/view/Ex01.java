package view;

import java.util.Scanner;

public class Ex01 {
	private static double number;

	public static void main(String[] args) {
		input();
	}

	private static void input() {
		int count = 0;
		Scanner ip = new Scanner(System.in);
		while (count < 4) {
			System.out.print("Nhập vào 1 số thực có phần thập phân khác 0: ");
			if (ip.hasNextDouble()) {
				number = ip.nextFloat();
				if (number % 1 != 0) {
//
					break;
				}
				else {
					System.out.println("Số nhập vào ko có phần thập phân. Vui lòng nhập lại.");
					count++;
				}
			} 
			else{
				System.out.println("Số nhập vào ko ko hợp lệ !. Vui lòng nhập lại.");
				count++;
				ip.next();
			}
			if (count == 3) {
				System.out.println("Bạn đã nhập sai tối đa 3 lần !");
				return;
			}
		}

	}
	
	public static String getMinFract(double number) {
		String sNumber = String.valueOf(number);
		int dgP = sNumber.length() - sNumber.indexOf('.') - 1;
		return sNumber;
		
	}

}
