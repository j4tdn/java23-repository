package view;

import java.util.Arrays;

public class Ex03Revert {

	public static void main(String[] args) {
		String s = "Welcome  to JAVA10   class";
		 printString(s);
	}
	
	private static void printString(String s) {
        s = s.replaceAll("\\s+", " ");
		String newString = "";
		for(int i = s.length()-1 ;i >= 0;i-- ) {
//			char c = s.charAt(i);
            newString = newString + s.charAt(i);

		}
		System.out.println("Chuỗi đảo ngược là:" +newString);
	}
	
	
	
	
}
