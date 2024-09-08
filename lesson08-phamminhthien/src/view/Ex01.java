package view;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập vào chuỗi kí tự: ");
		String words = ip.nextLine();
		printOneLine(words);
		printSWords(words);
		printReverseCharacter(words);
		printReverseWords(words);
		ip.close();
	}
	
	private static void printOneLine(String words) {
		System.out.println("\nIn ra mỗi kí tự trên một dòng:");
		for(int i=0; i< words.length(); i++) {
			System.out.println("-> " + words.charAt(i));
		}
	}
	
	private static void printSWords(String words) {
		System.out.println("\nIn ra mỗi từ trên mỗi dòng:");
		String[] S = words.split("[\\s-]+");
		for(int i=0; i< S.length; i++) {
			System.out.println("-> " + S[i]);
		}
	}
	
	private static void printReverseCharacter(String words) {
		System.out.println("\nIn ra chuỗi đảo ngược theo kí tự:");
		for(int i=words.length() - 1; i>= 0; i--) {
			System.out.println("-> " + words.charAt(i));
		}
	}
	
	private static void printReverseWords(String words) {
		System.out.println("\nIn ra chuỗi đảo ngược theo từ:");
		String[] S = words.split("[\\s-]+");
		for(int i=S.length - 1; i>= 0; i--) {
			System.out.println("-> " + S[i]);
		}
	}
}
