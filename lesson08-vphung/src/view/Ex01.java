package view;

import java.util.Scanner;

public class Ex01 {

	private static Scanner scanner = new Scanner(System.in);
	
    public static void main(String[] args) {
        System.out.println("Nhập một chuỗi ký tự:");
        String input = scanner.nextLine();
        
        System.out.println("\n1. Mỗi ký tự trên một dòng:");
        for (char c : input.toCharArray()) {
            System.out.println(c);
        }
        
        System.out.println("\n2. Mỗi từ trên một dòng:");
        String[] words = input.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        
        System.out.println("\n3. Chuỗi đảo ngược theo ký tự:");
        StringBuilder reverseByCharacter = new StringBuilder(input);
        System.out.println(reverseByCharacter.reverse().toString());
        
        System.out.println("\n4. Chuỗi đảo ngược theo từ:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}