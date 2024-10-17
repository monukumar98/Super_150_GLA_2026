package Lec54;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit", t = "rabbit";
	}

	// s--> coin t--> amount i--> s j--->t
	public static int Change_II(String s, String t, int i, int j, int[][] dp) {
		if (j == t.length()) {
			return 1;
		}
		if (i == s.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = Change_II(s, t, i + 1, j + 1, dp);
		}

		exc = Change_II(s, t, i + 1, j, dp);

		return dp[i][j] = inc + exc;

	}
}
