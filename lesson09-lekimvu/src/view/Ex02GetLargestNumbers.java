package view;

import java.util.Arrays;

public class Ex02GetLargestNumbers {

	public static void main(String[] args) {
		String n = "01a2b3456cde478";
		System.out.println("Right Number: " +Arrays.toString(rightNumber(n)));
	}
	
	private static String[] rightNumber(String n) {
		String[] commonNumber = new String[n.length()];
		int count = 0;
		int start = -1;
		// duyệt nếu là số thì gán start = i và cứ để nó lặp và đến khi k là số nữa thì cắt ra 
		for(int i = 0;i<n.length();i++) {
           char number = n.charAt(i);
          if(getNumber(number)) {
             if(start == -1) {
					start = i;
				}
			}else 
				if(start != -1) {
					String rightCommonNumber = n.substring(start, i);
					commonNumber[count++] = rightCommonNumber;
				}
		}
		
		
		return Arrays.copyOfRange(commonNumber, 0, count);
		
	}
	
	private static boolean getNumber(char number) {
		if(Character.isDigit(number)) {
			return true;
		}
		return false;
	}
}
