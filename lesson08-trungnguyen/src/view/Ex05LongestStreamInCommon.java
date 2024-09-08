package view;

import java.util.Scanner;

public class Ex05LongestStreamInCommon {

	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập xâu s1: ");
		String s1 = ip.nextLine();
		System.out.println("Nhập xâu s2: ");
		String s2 = ip.nextLine();
		String longestCommonStream = recursionLongestCommonStream(s1, s2, s1.length(), s2.length());
		System.out.println("Xâu con chung dài nhất: " + longestCommonStream);
	}
	
	private static String recursionLongestCommonStream(String s1, String s2, int m, int n) {
		if (m == 0 || n == 0) {
            return "";
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return recursionLongestCommonStream(s1, s2, m - 1, n - 1) + s1.charAt(m - 1);
        } else {
            String lcs1 = recursionLongestCommonStream(s1, s2, m - 1, n);
            String lcs2 = recursionLongestCommonStream(s1, s2, m, n - 1);
            return lcs1.length() > lcs2.length() ? lcs1 : lcs2;
        }
			
	}
}
