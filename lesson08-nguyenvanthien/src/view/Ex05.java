package view;

import java.util.Scanner;

public class Ex05 {
	/*
	 * Bài 5: Xâu s1 có dộ dài m và s2 có độ dài n ( m,n là hai số tự nhiên; n,m<250)
	   Biết rằng s1,s2 chỉ chứa các kí tự ‘A’...’Z’.
	   Yêu cầu: Hãy viết phương trình tìm xâu con chung dài nhất của xâu s1 và s2.

	   Dữ liệu vào: Nhập từ bàn phím 2 xâu s1 và s2.
	   Kết quả: Xuất ra màn hình xâu con chung của 2 xâ s1 và s2.
	   Example:
	   Input: S1:ABCEDEABC
	   S2:ABCEDCBBCK
	   Output: ABCED
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập Chuỗi s1");
		String s1 =sc.nextLine();
		
		System.out.println("Nhập Chuỗi s2");
		String s2 =sc.nextLine();
		
		
	}
//			public static String findlcs(String s1,String s2) {
//			int a = s1.length();
//			int b =s2.length();
//			
//			int [][] dp = new int [a+1][b+1];
//			
//			  for (int i = 1; i <= a; i++) {
//		            for (int j = 1; j <= b; j++) {
//		                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
//		                    dp[i][j] = dp[i - 1][j - 1] + 1;
//		                } else {
//		                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
//		                }
//		            }
//			  }
			  
	

}