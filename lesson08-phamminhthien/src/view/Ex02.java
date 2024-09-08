package view;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static utils.PrintUtils.*;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập tên người dùng: ");
		String fullName = ip.nextLine();
		if(check(fullName)) {
			capitalize(fullName);
		}
		else
		{
			System.out.println("Vui lòng chỉ nhập chữ cái và khoảng trắng.");
		}
		
	}
	
	private static boolean check(String fullName) {
		return fullName.matches("[A-Za-z ]+");
	}	
	
	private static void capitalize(String fullName) {
		String[] words = printSWords(fullName);
//		String[] words = fullName.split("\\s+");
		StringBuilder result = new StringBuilder();
		
		for(String word:words) {
			if(word.length()>0) {
				result.append(Character.toUpperCase(word.charAt(0)))
				.append(word.substring(1).toLowerCase())
				.append(" ");
			}
		}
		System.out.println("Tên đã được định dạng: " + result);
	}
	
}
