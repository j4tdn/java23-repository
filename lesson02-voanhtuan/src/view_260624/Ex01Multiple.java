package view_260624;

import java.util.Scanner;

import utils.IoUtils;

public class Ex01Multiple {

	public static void main(String[] args) {
		
		// 5 lan nhap sai toi da
		int number = IoUtils.input(5);
		
		System.out.println("Is " + number + " multiple of 2? --> " + isMultipleOf2(number));
	}

	private static boolean isNumber(String text) {
		if(text == null || text.isEmpty()) {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isMultipleOf2(int n) {
		return n % 2 == 0;
	}
}
