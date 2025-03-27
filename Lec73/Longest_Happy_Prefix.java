package Lec73;

public class Longest_Happy_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabaacfaabaa";
		System.out.println(LPS(s));
	}
	public static String LPS(String s) {
		int[] dp = new int[s.length()];
		int len = 0;
		int i = 1;
		while (i < s.length()) {
			if (s.charAt(i) == s.charAt(len)) {
				dp[i] = ++len;
				i++;
			} else {
				if (len > 0) {
					len = dp[len - 1];

				} else {
					dp[i] = 0;
					i++;
				}
			}
		}
		return s.substring(0, dp[dp.length - 1]);
	}

}
