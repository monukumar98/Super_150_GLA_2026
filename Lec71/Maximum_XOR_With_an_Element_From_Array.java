package Lec71;

import java.util.Arrays;
import java.util.Comparator;

import Lec71.Maximum_XOR_of_Two_Numbers_in_an_Array.Trie.Node;

public class Maximum_XOR_With_an_Element_From_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] queries = { { 3, 1 }, { 1, 3 }, { 5, 6 } };
		Pair[] p = new Pair[queries.length];
		for (int i = 0; i < p.length; i++) {
			p[i] = new Pair(queries[i][0], queries[i][1], i);
		}
		Arrays.sort(p, new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				// TODO Auto-generated method stub
				return o1.mi - o2.mi;
			}
		});
		Arrays.sort(arr);
		int j = 0;// array ka index
		Trie t = new Trie();
		int[] ans = new int[queries.length];
		for (Pair q : p) {
			while (j < arr.length && q.mi >= arr[j]) {
				t.Add(arr[j]);
				j++;
			}
			if (j == 0) {
				ans[q.i] = -1;
			} else {
				ans[q.i] = t.GetMaxXor(q.xi);
			}
		}
	}

	static class Trie {
		class Node {
			int val;
			Node zero;
			Node one;
		}

		private Node root;

		public Trie() {
			// TODO Auto-generated constructor stub
			root = new Node();
		}

		public void Add(int val) {
			Node curr = root;
			for (int i = 31; i >= 0; i--) {
				int bit = (val & (1 << i));
				if (bit == 0) {
					if (curr.zero != null) {
						curr = curr.zero;
					} else {
						Node nn = new Node();
						nn.val = 0;
						curr.zero = nn;
						curr = nn;
					}
				} else {
					if (curr.one != null) {
						curr = curr.one;
					} else {
						Node nn = new Node();
						nn.val = 1;
						curr.one = nn;
						curr = nn;
					}
				}
			}
		}

		public int GetMaxXor(int val) {
			Node curr = root;
			int ans = 0;
			for (int i = 31; i >= 0; i--) {
				int bit = (val & (1 << i));
				if (bit == 0) {
					if (curr.one != null) {
						ans = ans + (1 << i);
						curr = curr.one;
					} else {
						curr = curr.zero;
					}
				} else {
					if (curr.zero != null) {
						ans = ans + (1 << i);
						curr = curr.zero;
					} else {
						curr = curr.one;
					}
				}
			}
			return ans;
		}
	}

	static class Pair {
		int xi, mi, i;

		public Pair(int xi, int mi, int i) {
			// TODO Auto-generated constructor stub
			this.xi = xi;
			this.mi = mi;
			this.i = i;
		}
	}

}
