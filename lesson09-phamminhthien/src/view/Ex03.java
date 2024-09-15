package view;

import java.util.Arrays;

public class Ex03 {
	
	public static void main(String[] args) {
		String input = "Welcome to JAVA10 class";
		
		
		System.out.println("Input: " +input);
		System.out.println("Output: " + revert(input));
		
	}
	
	private static String[] getWord(String s) {
		int start = 0;
		String[]  result = new String[s.length()];
		int count = 0; 
		
		for(int i=0; i<s.length(); i++) {
			char letter = s.charAt(i);
			if(letter == ' ') {
				String word = s.substring(start,i);
				result[count++] = word;
				start=i+1;
			}
			else if(i == s.length() - 1) {
				String word = s.substring(start, s.length());
				result[count++] = word;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
		
	}
	
	private static String revert(String str) {
		str = str.trim().replaceAll("\\s+", "");
		
		String[] tokens = getWord(str);
		String result = "";
		for(int i=0; i< tokens.length; i++) {
			for(int j=tokens[i].length() - 1; j >= 0; j--) {
				result += tokens[i].charAt(j);
			}
			result += " ";
			
		}
		return result;
	}
}
