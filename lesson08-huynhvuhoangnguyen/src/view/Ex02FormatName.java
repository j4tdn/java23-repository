package view;

import java.util.Scanner;

public class Ex02FormatName {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		String name = ip.nextLine();
		
		String formattedName = capitalizeEachWord(name);
		
		System.out.println("Tên đã định dạng: " + formattedName);
		
		ip.close();
	}
	
	public static String capitalizeEachWord(String name) {
		String[] words = name.toLowerCase().split(" ");
		StringBuilder formattedName = new StringBuilder();
		
		for(String word : words) {
			if(!word.isEmpty()) {
				formattedName.append(Character.toUpperCase(word.charAt(0)))
				.append(word.substring(1))
				.append(" ");
			}
		}
		
		return formattedName.toString().trim();
	}
	
}