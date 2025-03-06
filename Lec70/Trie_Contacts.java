package Lec70;

import java.util.HashMap;

import Lec70.Trie.Node;

public class Trie_Contacts {
	class Node {
		char ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isterminal;
		int count = 1;
	}

	private Node root;

	public Trie_Contacts() {
		// TODO Auto-generated constructor stub
		root = new Node();
		root.ch = '*';
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.count++;
			} else {
				Node nn = new Node();
				nn.ch = ch;
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.isterminal = true;

	}
	public int  search(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}
		}
		return curr.count;
	}
}
