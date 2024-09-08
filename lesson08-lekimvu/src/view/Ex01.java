	package view;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nhập vào một chuỗi bất kì: ");
		String s = sc.nextLine();
		System.out.println("Chuỗi tên là: " + s);
		printChar(s);
		printWord(s);
		printChar2("\n" +s);
		printChar3(s);
	}

	private static void printChar(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println("Kí tự trên mỗi dòng: " + c);
		}
	}

	private static void printWord(String s) {
		String[] word = s.split(" ");
		for (String words : word) {
			System.out.println("Từ trên mỗi dòng: " + words);
		}
	}
	
	private static void printChar2(String s) {
		String newWord = "";
		for (int i = s.length() -1 ; i >= 0; i--) {
			newWord = newWord + s.charAt(i);
			char c = s.charAt(i);
				System.out.println("Chuỗi đảo ngược : " + c);
		}
		System.out.println("Chuỗi đảo ngược : " + newWord);
	}
	
	private static void printChar3(String s) {
		String[] word = s.split(" ");
		String newWord = "";
		for (int i = word.length - 1  ; i >0; i--) {
			 newWord = newWord + word;
		}
		System.out.println("Chuỗi đảo ngược 2 : " +Arrays.toString(word));
	}
}
