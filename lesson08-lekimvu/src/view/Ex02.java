package view;

import java.util.Scanner;

public class Ex02 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nhập họ tên: ");
		String s = sc.nextLine();
		InputName(s);
		String result = capitalizeWords(s);
		System.out.println("The right format name : " +result);
	}

	private static void InputName(String s) {
//	   boolean Number = false; 
//		try {
//		boolean Number = false;
//		while(Number) {
		for (char S : s.toCharArray()) {
			if (Character.isDigit(S)) {
//				Number = true;
				throw new NumberFormatException("The String does not have number");
			}
		}
		System.out.println("The name is: " + s);
	}

//	   }catch (Exception e) {
//		 TODO: handle exception
	private static String capitalizeWords(String s) {
		String[] words = s.split("\\s+"); // Split the input string by whitespace
		StringBuilder capitalizedString = new StringBuilder();

		for (String word : words) {
			if (word.length() > 0) {
				String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
				capitalizedString.append(capitalizedWord).append(" ");
			}
		}

		return capitalizedString.toString().trim();
	}

}

//}
//}
