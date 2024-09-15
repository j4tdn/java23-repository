package view;

import java.util.Arrays;

public class Ex03 {
	
	public static void main(String[] args) {
		String input = "Welcome to JAVA10 class";				
		System.out.println("trim -->" + trim(input));
		System.out.println("revert -->" + revert(trim(input)));
	}
	
	private static String trim (String s) {
		String trimmed = s.trim().replaceAll("\\s+", "");
		return trimmed.toString();
	}
	
	private static String revert (String s) {
		StringBuilder revert = new StringBuilder(s).reverse();
		return revert.toString();
	}	
}
