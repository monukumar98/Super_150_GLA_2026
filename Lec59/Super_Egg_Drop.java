package Lec59;

import java.util.Arrays;

public class Super_Egg_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int e = 3;
		int[][] dp = new int[n + 1][e + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Egg_Drop(n, e, dp));
	}

	public static int Egg_Drop(int n, int e, int[][] dp) {
		if (n == 0 || n == 1 || e == 1) {
			return n;
		}
		if (dp[n][e] != -1) {
			return dp[n][e];
		}
		int ans = Integer.MAX_VALUE;
		for (int f = 1; f <= n; f++) {
			int b = Egg_Drop(f - 1, e - 1, dp);
			int ub = Egg_Drop(n - f, e, dp);
			int t = Math.max(b, ub) + 1;
			ans = Math.min(ans, t);
		}
		return dp[n][e] = ans;
	}

}
