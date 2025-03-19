package Lec71;

public class Maximum_XOR_of_Two_Numbers_in_an_Array {
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

	public static void main(String[] args) {
		int[] arr = { 3, 10, 5, 25, 2, 8 };
		Trie t = new Trie();
		for (int val : arr) {
			t.Add(val);
		}
		int ans=0;
		for (int val : arr) {
			ans=Math.max(ans, t.GetMaxXor(val));
					
		}
		System.out.println(ans);
		
	}
}












