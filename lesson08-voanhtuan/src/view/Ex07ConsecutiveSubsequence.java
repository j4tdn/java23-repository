package view;

import java.util.Scanner;

public class Ex07ConsecutiveSubsequence {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập chuỗi S: ");
	        String s = sc.nextLine();

	        int maxLen = 1, minLen = s.length(), currentLen = 1;

	        for (int i = 1; i < s.length(); i++) {
	            if (s.charAt(i) == s.charAt(i - 1)) {
	                currentLen++;
	            } else {
	                maxLen = Math.max(maxLen, currentLen);
	                minLen = Math.min(minLen, currentLen);
	                currentLen = 1;
	            }
	        }
	        maxLen = Math.max(maxLen, currentLen);
	        minLen = Math.min(minLen, currentLen);

	        System.out.println("Độ dài lớn nhất của dãy con đúng: " + maxLen);
	        System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + minLen);
	    }
	
}
