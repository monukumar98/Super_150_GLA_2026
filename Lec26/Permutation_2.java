package Lec26;

public class Permutation_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abca";
		Print(ques, "");
	}

	public static void Print_Spac(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		boolean[] visited = new boolean[26];
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (visited[ch - 'a'] == false) {
				visited[ch - 'a'] = true;
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				Print(s1 + s2, ans + ch);
			}
		}

	}

	public static void Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			boolean val = false;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ques.charAt(j) == ch) {
					val = true;
					break;
				}
			}
			if (val == false) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				Print(s1 + s2, ans + ch);
			}
		}

	}
}
