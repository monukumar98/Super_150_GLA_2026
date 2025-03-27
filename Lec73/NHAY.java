package Lec73;

import java.util.Scanner;

public class NHAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int len = sc.nextInt();
			String pat = sc.next();
			String text = sc.next();
			LPS(pat, text);
		}
	}

	public static void LPS(String pat, String text) {
		String s = pat + "#" + text;
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
		for (int j = pat.length() + 1; j < dp.length; j++) {
			if (dp[j] == pat.length()) {
				System.out.println(j - 2 * pat.length());
			}
		}

	}

}
