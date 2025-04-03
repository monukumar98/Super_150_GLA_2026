package Lec74;

import java.util.Scanner;

public class Count_Good_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Count_Good_String(str);
	}

	public static void Count_Good_String(String str) {
		long[][] dp = new long[2][2];
		long odd = 0, even = 0;
		for (int i = 1; i <= str.length(); i++) {
			odd++;
			if (i % 2 != 0) {// odd
				char ch = str.charAt(i - 1);
				odd += dp[ch - 'a'][0];// odd-odd+1 = odd
				dp[ch - 'a'][0]++;
				even += dp[ch - 'a'][1];// odd-even+1=even
			} else {// even
				char ch = str.charAt(i - 1);
				odd += dp[ch - 'a'][1];// even-even+1 = odd
				dp[ch - 'a'][1]++;
				even += dp[ch - 'a'][0];// odd-even+1 = even
			}

		}
		System.out.println(even + " " + odd);
	}

}
