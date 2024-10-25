package Lec55;

public class Edit_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "FOOD";
		String t = "MONEY";
		System.out.println(Min_Oprs(s, t, 0, 0));

	}

	public static int Min_OprsBU(String s, String t) {
		int[][] dp = new int[s.length() + 1][t.length() + 1];
		for (int col = 1; col < dp[0].length; col++) {
			dp[0][col] = col;
		}
		for (int row = 1; row < dp.length; row++) {
			dp[row][0] = row;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					int D = dp[i - 1][j];
					int R = dp[i - 1][j - 1];
					int I = dp[i][j - 1];
					dp[i][j] = Math.min(R, Math.min(D, I)) + 1;
				}
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];

	}

	public static int Min_Oprs(String s, String t, int i, int j) {
		if (s.length() == i) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = Min_Oprs(s, t, i + 1, j + 1);
		} else {
			int D = Min_Oprs(s, t, i + 1, j);
			int R = Min_Oprs(s, t, i + 1, j + 1);
			int I = Min_Oprs(s, t, i, j + 1);
			ans = Math.min(R, Math.min(D, I)) + 1;
		}
		return ans;
	}

}
