package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03  {
	
	private static String[] word2016(String s) {
		int begin = 0 ;
		int count = 0 ;
		String[] result = new String[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			char textbook = s.charAt(i);
			if (textbook == ' ') {
				String word = s.substring(begin, i);
				result[count++] = word;
			} else if (i  == s.length() - 1) {
				String word = s.substring(begin, s.length());
				result[count++] = word;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static String revert(String str) {
		str = str.trim().replaceAll("\s+"," ");
		
		String[] words = word2016(str);
		String s = "";
		
		for (int j = 0; j < words.length; j++) {
			for (int i = words[j].length() - 1; i >= 0; i--) {
				s += words[j].charAt(i);
			}
			s += " ";
		}
		
		return s;
	}
	public static void main(String[] args) {
//		String text ;
//		Scanner sc = new Scanner(System.in);
//		text = sc.nextLine();
		System.out.println("enter a string upside down : ");
		String text = "Welcome                to java 10 class";		
		System.out.println("Input: " + text);
		System.out.println("result is: " + revert(text));
	}
}


