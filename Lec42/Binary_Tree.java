package Lec42;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Binary_Tree() {
		// TODO Auto-generated constructor stub
		root = CreateTree();
	}

	Scanner sc = new Scanner(System.in);

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}
		return nn;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node node) {
		if (node == null) {
			return;
		}

		String s = "";
		s = "<--" + node.val + "-->";
		if (node.left != null) {
			s = node.left.val + s;
		} else {
			s = "." + s;
		}
		if (node.right != null) {
			s = s + node.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(node.left);
		Display(node.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int left = max(nn.left);
		int right = max(nn.right);
		return Math.max(left, Math.max(right, nn.val));
	}

	public boolean find(int item) {

		return find(root, item);
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}

		if (node.val == item) {
			return true;
		}
		boolean left = find(node.left, item);
		boolean right = find(node.right, item);
		return left || right;

	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		if (node == null) {
			return 0;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;
	}

	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);
	}

	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}

	private void INOrder(Node node) {
		if (node == null) {
			return;
		}

		INOrder(node.left);
		System.out.print(node.val + " ");
		INOrder(node.right);
	}

	public void POStOrder() {
		POStOrder(this.root);
		System.out.println();
	}

	private void POStOrder(Node node) {
		if (node == null) {
			return;
		}

		POStOrder(node.left);

		POStOrder(node.right);
		System.out.print(node.val + " ");
	}

	public void levelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node rv=q.poll();
			System.out.print(rv.val+" ");
		if(rv.left!=null) {
			q.add(rv.left);
		}
		if(rv.right!=null) {
			q.add(rv.right);
		}
			
		}
		System.out.println();

	}

}





