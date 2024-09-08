package view;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String text = ip.nextLine();
		
		System.out.print("\nDuyệt in từng kí tự trên một dòng: ");
		printSLetters(text);
		
		System.out.println("\nDuyệt in từng từ trên mỗi dòng: ");
		printSWords(text);
		
		System.out.println("\nChuỗi đảo ngược theo kí tự: ");
	    System.out.println(reverseCharacter(text));
	    
	    System.out.println("\nChuỗi đảo ngược theo từ:");
        System.out.println(reverseWord(text));
	}
	
	private static void printSLetters(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
	}

	private static void printSWords(String s) {
		String[] words = s.split(" ");
		for (String word: words) {
			System.out.println(word);
		}
	}
	
	private static String reverseCharacter(String s) {
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		return result;
	}
	
	public static String reverseWord(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
        	result += words[i] + " ";
        }
        return result;
    }
}
