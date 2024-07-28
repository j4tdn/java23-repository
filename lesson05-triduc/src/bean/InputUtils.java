package bean;

import java.util.Scanner;

public class InputUtils {
	public static boolean isDoubleNumber(String n) {
		try {
			Double a = Double.parseDouble(n);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public static boolean isIntegerNumber(String n) {
		try {
			Integer a = Integer.parseInt(n);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public static Double inputDouble(String title, Integer wrongTimes) {
		Scanner sc = new Scanner(System.in);
		System.out.print(title);
		int count = 0;
		do {
			String input = sc.nextLine();
			if(InputUtils.isDoubleNumber(input)) {
				Double number = Double.parseDouble(input);
				return number;
			}
			else {
				System.out.println("Wrong type of input --> You have " + (3 - count) + " times to reinput");
				count ++;
			}
		}
		while(count<=wrongTimes);
		return null;
	}
	
	public static Integer inputInteger(String title, Integer wrongTimes) {
		Scanner sc = new Scanner(System.in);
		System.out.print(title);
		int count = 0;
		do {
			String input = sc.nextLine();
			if(InputUtils.isDoubleNumber(input)) {
				Integer number = Integer.parseInt(input);
				return number;
			}
			else {
				System.out.println("Wrong type of input --> You have " + (3 - count) + " times to reinput");
				count ++;
			}
		}
		while(count<=wrongTimes);
		return null;
	}
}
