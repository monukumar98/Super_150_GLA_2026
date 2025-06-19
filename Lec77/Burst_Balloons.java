package Lec77;

import java.util.Arrays;

public class Burst_Balloons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 5, 8 };
		int[] a = new int[arr.length + 2];
		a[0] = a[a.length - 1] = 1;
		for (int i = 1; i < a.length - 1; i++) {
			a[i] = arr[i - 1];
		}
		int[][] dp = new int[a.length][a.length];
		for (int[] a1 : dp) {
			Arrays.fill(a1, -1);
		}
		System.out.println(maximum_coins(a, 0, a.length - 1, dp));
	}

	public static int maximum_coins(int[] a, int i, int j, int[][] dp) {
		if (i + 1 == j) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = Integer.MIN_VALUE;
		for (int k = i + 1; k < j; k++) {
			int left = maximum_coins(a, i, k, dp);
			int right = maximum_coins(a, k, j, dp);
			int self = a[i] * a[k] * a[j];
			ans = Math.max(ans, left + right + self);
		}
		return dp[i][j] = ans;
	}

}
