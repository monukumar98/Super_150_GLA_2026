package Lec72;

import java.util.*;

public class Longest_Duplicate_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "banana";
		System.out.println(Longest_Duplicate(s));
	}

	public static String Longest_Duplicate(String s) {
		int lo = 1;
		int hi = s.length();
		String ans = "";
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			String str = Rolling_Hash(s, mid);
			if (str.length() > 0) {
				ans = str;
				lo = mid + 1;
			}

			else {
				hi = mid - 1;
			}
		}
		return ans;
	}

	private static String Rolling_Hash(String s, int mid) {
		// TODO Auto-generated method stub
		int pr = 31;
		long pow = 1;
		long rhv = 0;
		int mod = 1000_000_007;
		for (int i = mid - 1; i >= 0; i--) {
			rhv = (rhv + ((s.charAt(i) - 'a' + 1) * pow) % mod) % mod;
			if (i > 0) {
				pow = (pow * pr) % mod;
			}
		}
		HashMap<Long, ArrayList<Integer>> map = new HashMap<>();
		map.put(rhv, new ArrayList<>());
		map.get(rhv).add(0);
		for (int ei = mid, si = 0; ei < s.length(); ei++, si++) {
			rhv = ((rhv - ((s.charAt(si) - 'a' + 1) * pow)%mod) + mod) % mod;
			rhv = ((rhv * pr) % mod + (s.charAt(ei) - 'a' + 1)) % mod;
			if (map.containsKey(rhv)) {
				for (int st : map.get(rhv)) {
					String curr = s.substring(si + 1, ei + 1);
					String prev = s.substring(st, st + mid);
					if (curr.equals(prev)) {
						return curr;
					}

				}

				map.get(rhv).add(si + 1);

			} else {
				map.put(rhv, new ArrayList<>());
				map.get(rhv).add(si + 1);
			}
		}
		return "";
	}

}
