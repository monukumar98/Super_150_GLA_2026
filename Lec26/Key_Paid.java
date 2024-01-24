package Lec26;

import java.util.*;

public class Key_Paid {
	static String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "23";
		List<String> ll = new ArrayList<>();
		KeyPaid(ques, "", ll);
		System.out.println(ll);

	}

	public static void KeyPaid(String ques, String ans, List<String> ll) {// 23,-
		if (ques.length() == 0) {
			// System.out.println(ans);
			ll.add(ans);
			return;
		}
		char ch = ques.charAt(0);// 2
		String press = map[ch - '0'];// abc
		for (int i = 0; i < press.length(); i++) {
			KeyPaid(ques.substring(1), ans + press.charAt(i), ll);

		}

	}
}
