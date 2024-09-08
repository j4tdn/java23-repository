package view;

import java.util.Scanner;

public class Ex01PrintString {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập chuỗi kí tự tiếng Việt: ");
		
		String input = ip.nextLine();
		
		System.out.println("\nMỗi kí tự trên một dòng:");
        printCharacter(input);
        
        System.out.println("\nMỗi từ trên một dòng:");
        printWord(input);
        
        System.out.println("\nChuỗi đảo ngược theo kí tự:");
        reverseByCharacters(input);
        
        System.out.println("\nChuỗi đảo ngược theo từ:");
        reverseByWords(input);
        
		ip.close();
	}
	
	public static void printCharacter(String input) {
		for(int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i) + " ");
		}
	}
	
	public static void printWord(String input) {
		String[] words = input.split(" ");
		for(String word : words) {
			System.out.println(word);
		}
	}
	
	public static void reverseByCharacters(String input) {
		StringBuilder reversed = new StringBuilder(input).reverse();
		System.out.println(reversed);
	}
	
	public static void reverseByWords(String input) {
		String[] words = input.split(" ");
		StringBuilder reversed = new StringBuilder();
		for(int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]).append(" ");
		}
		System.out.println(reversed.toString().trim());
	}
	
}