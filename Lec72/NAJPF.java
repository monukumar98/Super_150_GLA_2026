package Lec72;

import java.util.*;

public class NAJPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			String p = sc.next();
			Rabin_karp(s, p);
		}

	}

	public static void Rabin_karp(String s, String p) {
		int pr = 31;
		int pow = 1;
		long phv = 0;
		int mod = 1000_000_007;
		for (int i = 0; i < p.length(); i++) {
			phv = (phv + ((p.charAt(i) - 'a' + 1) * pow) % mod) % mod;
			pow = (pow * pr) % mod;
		}
		long[] dp = new long[s.length()];
		long[] dpow = new long[s.length()];
		dp[0] = s.charAt(0) - 'a' + 1;
		dpow[0] = 1;
		pow = 31;
		for (int i = 1; i < s.length(); i++) {
			dp[i] = (dp[i - 1] + ((s.charAt(i) - 'a' + 1) * pow) % mod) % mod;
			dpow[i] = pow;
			pow = (pow * pr) % mod;
		}
		ArrayList<Integer> ll = new ArrayList<>();
		for (int ei = p.length() - 1, si = 0; ei < s.length(); ei++, si++) {
			long currhv = dp[ei];
			if (si > 0) {
				currhv = (currhv - dp[si - 1] + mod) % mod;
			}
			if (currhv == (phv * dpow[si]) % mod) {
				ll.add(si + 1);
			}
		}
		if (ll.size() == 0) {
			System.out.println("Not Found");
			return;
		}
		System.out.println(ll.size());
		for (int v : ll) {
			System.out.print(v + " ");
		}
		System.out.println();
	}

}
