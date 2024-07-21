package bean;

import java.util.Scanner;

public class IoUtils {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean isNumberDouble(String n) {
		try {
			Double i = Double.parseDouble(n);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
	
	public static Double inputDouble(String variableName, int minInclusive, int maxInclusive) {
		Double n = 0d;
		String text = "";
		
		System.out.print("Enter "+ variableName +" = ");

		while (true) {
			text = sc.nextLine();
			if(isNumberDouble(text)) {
				n = Double.parseDouble(text);
				if(n>minInclusive && n<maxInclusive) {
					break;
				}
			}
			System.out.print("Invalid number, enter N ("+ minInclusive + ","+ maxInclusive + ") again: ");
		}
		
		return Double.parseDouble(text);
	}
	
	public static boolean isNumberInteger(String n) {
		try {
			int i = Integer.parseInt(n);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
	
	public static int inputInteger(String variableName) {
		int n = 0;
		String text = "";
		
		System.out.print("Enter "+ variableName +" = ");

		while (true) {
			text = sc.nextLine();
			if(isNumberInteger(text)) {
				n = Integer.parseInt(text);
				break;
			}
			System.out.println("Wrong type! Pls enter numbers!!");
		}
		return Integer.parseInt(text);
	}
}
