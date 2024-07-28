package view;

import java.util.Scanner;

public class Ex01MinFract {
	public static void main(String[] args) {
		double rNumber = 0;
		rNumber = input();
		System.out.println(getMinFract(rNumber));
	}
	private static double input() {
		Scanner ip = new Scanner(System.in);
		String text = "";
		System.out.println("Nhập vào số thực có phần thập phân khác 0 : ");
		int wrongTimes = 0;
		while(true) {
			text = ip.nextLine();
			if(isValidNumber(text)) {
				break;
			}
			if (++wrongTimes == 3) {
				System.out.println("Sai 3 lần, thoát chương trình\n");
				System.exit(0);
			}
			System.out.println("Số không hợp lệ (số lần thử: " + wrongTimes +"). Nhập lại: ");
		}
		return Double.parseDouble(text);
	}
	private static boolean isValidNumber (String input) {
		try {
			double rNumber = Double.parseDouble(input);
			return rNumber % 1 != 0;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	private static String getMinFract(double rNumber) {
		String rNumberToText = String.valueOf(rNumber);
		int decimal = rNumberToText.length() - 1 - rNumberToText.indexOf('.');
		int down = 1;
		for (int i = 0; i< decimal; i++) {
			rNumber *= 10;
			down *= 10;
		}
		int up = (int)rNumber;
//		System.out.println("up : " + up + "--- down : " + down);
		int gcd = findGCD(up, down);
		up /= gcd;
		down /= gcd;
		return "Phân số tối giản " + up + "/" + down;
	}
	private static int findGCD(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a %b;
			a = temp;
			
		}
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
		return a;
	}
	
	
}
