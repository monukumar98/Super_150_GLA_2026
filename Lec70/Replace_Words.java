package Lec70;

import java.util.HashMap;

public class Replace_Words {
	static class Trie {
		static class Node {
			char ch;
			HashMap<Character, Node> child = new HashMap<>();
			boolean isterminal;
		}

		private static Node root;

		public Trie() {
			// TODO Auto-generated constructor stub
			root = new Node();
			root.ch = '*';
		}

		public static void insert(String word) {
			Node curr = root;
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (curr.child.containsKey(ch)) {
					curr = curr.child.get(ch);
				} else {
					Node nn = new Node();
					nn.ch = ch;
					curr.child.put(ch, nn);
					curr = nn;
				}
			}
			curr.isterminal = true;

		}
		public static String getString(String str) {
			StringBuilder sb = new StringBuilder();
			Node curr = root;
			for (int i = 0; i < str.length(); i++) {
				char ch =str.charAt(i);
				if(curr.child.containsKey(ch)) {
					sb.append(ch);
					curr = curr.child.get(ch);
					if(curr.isterminal) {
						return sb.toString();
					}
				}
				else {
					return str;
				}
			}
			return str;
		}
	}

	public static void main(String[] args) {
		String[] dictionary = { "cat", "bat", "rat" };
		String sentence = "the cattle was rattled by the battery";
		String[] arr = sentence.split(" ");
		Trie t = new Trie();
		for(String s:dictionary) {
			t.insert(s);
		}
		String ans="";
		for(String str: arr) {
			ans+= t.getString(str);
		}

	}
}





