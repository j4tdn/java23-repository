package view;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s;
		
		do {
            System.out.println("Nhập vào họ tên (chỉ gồm các kí tự [A-Za-z ]): ");
            s = ip.nextLine();
        } while (!isValidName(s));
		
		System.out.println("===================================");
		System.out.println("--> Formatted Name: " + formatName(s));
	}
	
	public static boolean isValidName(String s) {
        return s.matches("[A-Za-z ]+");
    }
	
	public static String formatName(String name) {
        String[] words = name.toLowerCase().split("\\s+");
        String result = "";

        for (String word : words) {
            if (!word.isEmpty()) {
            	result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }
        return result;
    }
}
