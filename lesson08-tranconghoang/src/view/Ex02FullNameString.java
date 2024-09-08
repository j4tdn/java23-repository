package view;

import java.util.Scanner;

public class Ex02FullNameString {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		String text;
		do {
			System.out.print("Nhập chuỗi:");
			text = ip.nextLine();
			if(!checkString(text))
				System.out.println("Chuỗi không hợp lệ, vui lòng nhập lại !");
		}
		while(!checkString(text));
		
		String[] words = text.split(" ");
		StringBuilder sb = new StringBuilder();
		
		System.out.println("==> " + UpperCaseFirstLetter(words, sb));
	}
	private static boolean checkString(String s) {
		for(int i = 0; i < s.length(); i++) {
			char t = s.charAt(i);
			if(t < 65 & t != 32 || t > 122 || t > 90 && t < 97)
				return false;
		}
		return true;
	}
	private static String UpperCaseFirstLetter(String[] words, StringBuilder sb) {
		for(String word: words)
			sb.append(Character.toUpperCase(word.charAt(0))) // viet hoa chu cai dau cua tu
			  .append(word.substring(1).toLowerCase()) 		// viet thuong chu cai con lai cua tu
			  .append(" "); 								// ngan cach boi dau	
		return sb.toString();
	}
}
