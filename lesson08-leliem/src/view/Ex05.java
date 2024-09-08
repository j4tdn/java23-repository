package view;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter the first string (S1):");
		String s1 = scanner.nextLine();
		System.out.println("Enter the second string (S2):");
		String s2 = scanner.nextLine();

		String result = findLongestCommonSubstring(s1, s2);
		System.out.println("Longest common substring:");
		System.out.println(result);

		scanner.close();
	}

	public static String findLongestCommonSubstring(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m + 1][n + 1];
		int maxLength = 0;
		int endIndex = 0;

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
					if (dp[i][j] > maxLength) {
						maxLength = dp[i][j];
						endIndex = i;
					}
				} else {
					dp[i][j] = 0;
				}
			}
		}

		return s1.substring(endIndex - maxLength, endIndex);
	}
}
