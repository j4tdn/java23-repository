package src;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhap vao mot chuoi ki tu:");
	        String input = scanner.nextLine();
	        
	        System.out.println("\n1. Mỗi ký tự trên một dòng:");
	        for (char c : input.toCharArray()) {
	            System.out.println(c);
	        }
	        
	        System.out.println("\n2. Moi tu tren mot dong:");
	        String[] words = input.split(" ");
	        for (String word : words) {
	            System.out.println(word);
	        }
	        
	        System.out.println("\n3. Chuoi dao nguoc theo ki tu:");
	        StringBuilder reversedByChar = new StringBuilder(input);
	        System.out.println(reversedByChar.reverse().toString());
	        
	        System.out.println("\n4. Chuoi dao nguoc theo tu:");
	        StringBuilder reversedByWord = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversedByWord.append(words[i]).append(" ");
	        }
	        System.out.println(reversedByWord.toString().trim());
	        
	        scanner.close();
		
	}
	
}
