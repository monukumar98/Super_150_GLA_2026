package Lec54;

import java.util.Arrays;

public class Longest_Common_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ace";
		String s2 = "abcde";
		int[][] dp = new int[s1.length()][s2.length()];
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[0].length; j++) {
//				dp[i][j]=-1;
//			}
//		}
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(LCS(s1, s2, 0, 0, dp));

	}

	public static int LCSBU(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					int f = dp[i - 1][j];
					int s = dp[i][j - 1];
					dp[i][j] = Math.max(f, s);
				}

			}
		}
		return dp[dp.length - 1][dp[0].length - 1];

	}

//i--> s1   and j--s2
	public static int LCS(String s1, String s2, int i, int j, int[][] dp) {
		if (i == s1.length() || j == s2.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = 1 + LCS(s1, s2, i + 1, j + 1, dp);
		} else {
			int f = LCS(s1, s2, i + 1, j, dp);
			int s = LCS(s1, s2, i, j + 1, dp);
			ans = Math.max(f, s);
		}
		return dp[i][j] = ans;

	}
}
