package view;

import java.util.Scanner;

public class Ex05HappyNumber {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập số: ");
		String numberInString = ip.nextLine().strip();
		
		while (true) {
			if (!isNumber(numberInString)) {
				System.out.println("Số không hợp lệ, Nhập lại : ");
				ip.nextLine();
				numberInString = ip.nextLine().strip();
			}
			else if (isNumber(numberInString)) {
				break;
			}
		}
//		double result = 0;
//		double number = Integer.valueOf(numberInString);
//		while(true) {
//			if (result == 1) {
//				System.out.println("số hạnh phúc");
//				break;
//			}
//			for (int i = 0; i < String.valueOf(number).length(); i++) {
////				System.out.println(" --> "+String.valueOf(number).charAt(i));
////				System.out.println("--> "+ Math.pow(Integer.valueOf(numberInString.charAt(i)), 2));
//				result = result + Math.pow(Integer.valueOf(numberInString.charAt(i)), 2);
//			}
//			System.out.println("result ==> " + result);
//			number = result;
//		}
		
	}
	private static boolean isNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
}
