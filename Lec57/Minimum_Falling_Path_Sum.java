package Lec57;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -100000);
		}
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, Falling_Path_Sum(grid, 0, i, dp));
		}
		System.out.println(ans);
	}
	public static int Falling_Path_Sum(int[][] grid, int cr, int cc, int[][] dp) {
		if (cc >= grid[0].length || cc < 0) {
			return Integer.MAX_VALUE;
		}
		if (cr == grid.length - 1) {
			return grid[cr][cc];
		}
		if (dp[cr][cc] != -100000) {
			return dp[cr][cc];

		}
		int ld = Falling_Path_Sum(grid, cr + 1, cc - 1, dp);
		int d = Falling_Path_Sum(grid, cr + 1, cc, dp);
		int rd = Falling_Path_Sum(grid, cr + 1, cc + 1, dp);
		return dp[cr][cc] = Math.min(d, Math.min(ld, rd)) + grid[cr][cc];
	}
}
