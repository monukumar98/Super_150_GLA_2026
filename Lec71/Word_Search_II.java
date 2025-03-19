package Lec71;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Word_Search_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] maze = { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' } };
		String[] words = { "oath", "pea", "eat", "rain" };
		Trie t = new Trie();
		for (String w : words) {
			t.insert(w);
		}
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (t.root.child.containsKey(maze[i][j])) {
					t.search(maze, i, j, t.root);
				}
			}
		}
		System.out.println(list);
	}

	static List<String> list = new ArrayList<String>();

	static class Trie {
		class Node {
			char ch;
			HashMap<Character, Node> child = new HashMap<>();
			String isterminal;
		}

		private Node root;

		public Trie() {
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
				} else {
					Node nn = new Node();
					nn.ch = ch;
					curr.child.put(ch, nn);
					curr = nn;
				}
			}
			curr.isterminal = word;

		}

		public void search(char[][] maze, int i, int j, Node root) {

			if (i < 0 || j < 0 || i >= maze.length || j >= maze[0].length || !root.child.containsKey(maze[i][j])) {
				return;
			}
			char ch = maze[i][j];
			root = root.child.get(ch);
			if (root.isterminal != null) {
				list.add(root.isterminal);
				root.isterminal = null;
			}
			maze[i][j] = '*';
			search(maze, i + 1, j, root);
			search(maze, i, j + 1, root);
			search(maze, i - 1, j, root);
			search(maze, i, j - 1, root);
			maze[i][j] = ch;
		}

	}
}
