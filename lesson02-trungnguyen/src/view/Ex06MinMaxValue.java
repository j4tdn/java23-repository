package view;

import java.util.Scanner;

public class Ex06MinMaxValue {
	public static void main(String[] args) {
		int a = getValidInput("a");
		int b = getValidInput("b");
		int c = getValidInput("c");
		
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		
		int min = a;
		if ( b < min ) {
			min = b;
		}
		if ( c < min ) {
			min = c;
		}
		System.out.println("Số nhỏ nhất là " + min);
		System.out.println("Số lớn nhất là "  + max );
		
	}
	private static int getValidInput(String variable) {
		Scanner scanner = new Scanner(System.in);
		int number = -1;
		boolean validInput = false;
		
		while (!validInput) {
			System.out.println("Nhap " + variable + " (0 < " + variable + " < 20 ): ");
			String input = scanner.nextLine();
			try {
				number = Integer.parseInt(input);
				if( number >= 0 && number < 20) {
					validInput = true;
				}
				else {
					System.out.println("Biến " + variable + " phải là số nguyên trong khoảng [0,20), nhập lại");
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Lỗi, vui lòng nhập lại số nguyên hợp lệ");
			}
		}
		return number;
	}
}
