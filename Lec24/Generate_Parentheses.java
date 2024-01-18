package Lec24;

import java.util.*;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> ll = new ArrayList<>();
		Parentheses(n, 0, 0, "", ll);
		System.out.println(ll);
	}
	public static void Parentheses(int n, int open, int close, String ans, List<String> ll) {
		if (open == n && close == n) {
			// System.out.println(ans);
			ll.add(ans);
			return;
		}
		if (open > n || close > open) {
			return;
		}
		Parentheses(n, open + 1, close, ans + "(", ll);
		Parentheses(n, open, close + 1, ans + ")", ll);
	}

}
