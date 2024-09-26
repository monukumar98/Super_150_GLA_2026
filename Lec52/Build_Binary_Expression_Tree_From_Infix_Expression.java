package Lec52;

import java.util.Stack;
public class Build_Binary_Expression_Tree_From_Infix_Expression {

	class Node {
		char val;
		Node left;
		Node right;

		Node() {
			this.val = ' ';
		}

		Node(char val) {
			this.val = val;
		}

		Node(char val, Node left, Node right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public Node expTree(String s) {
			s = getPostfix(s);
			Stack<Node> st = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch >= '0' && ch <= '9') {
					st.push(new Node(ch));
				}
				else {
					Node right=st.pop();
					Node left=st.pop();
					Node nn = new Node(ch);
					nn.left=left;
					nn.right=right;
					st.push(nn);
				}
			}
			return st.peek();
		}

		public String getPostfix(String s) {
			StringBuilder sb = new StringBuilder();
			Stack<Character> st = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch >= '0' && ch <= '9') {
					sb.append(ch);
				} else if (ch == '(') {
					st.push(ch);
				} else if (ch == ')') {
					while (st.peek() != '(') {
						sb.append(st.pop());
					}
					st.pop();// '(' removed
				} else {
					while (!st.isEmpty() && getValue(st.peek()) >= getValue(ch)) {
						sb.append(st.pop());
					}
					st.push(ch);
				}
			}
			while (!st.isEmpty()) {
				sb.append(st.pop());
			}
			return sb.toString();
		}

		public int getValue(char ch) {
			if (ch == '*' || ch == '/') {
				return 2;
			} else if (ch == '+' || ch == '-') {
				return 1;
			} else {
				return -1;
			}
		}
	}

}
