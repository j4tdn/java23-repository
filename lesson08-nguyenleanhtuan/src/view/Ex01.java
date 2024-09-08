package view;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập chuỗi");
		
		String chuoi = sc.nextLine();
		
		System.out.println("In ra mỗi ký tự 1 dòng: ");
		printEachCharacter(chuoi);
		
		System.out.println("In ra từng từ");
		printWord(chuoi);
		
		System.out.println("in ra ký tự đảo ngược");
		reveseCharacter(chuoi);
		
		System.out.println("\nchuỗi đảo ngược theo từ là :");
        System.out.println(reveseWord(chuoi));
	}
	
	private static void printEachCharacter (String chuoi) {
		for(int i = 0; i < chuoi.length();i++) {
			System.out.println(chuoi.charAt(i));
		}
	}
	
	private static void printWord (String chuoi) {
		String[] words = chuoi.split("\\s+");
		for(String word : words) {
			System.out.println(word);
		}
	}
	
	
	private static String reveseCharacter (String chuoi) {
		StringBuilder revesed = new StringBuilder(chuoi);
		return revesed.reverse().toString();
	}
	
	private static String reveseWord(String chuoi) {
		String[] words = chuoi.split("\\s+");
		StringBuilder reversed = new StringBuilder(chuoi);
		for(int i = words.length-1; i>=0 ; i--) {
			reversed.append(words[i]).append(" ");
		}
		return reversed.toString().trim();
	}
}
