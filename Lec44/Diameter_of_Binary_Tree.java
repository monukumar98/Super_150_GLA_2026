package Lec44;

public class Diameter_of_Binary_Tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root);

		}

		public int diameter(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int ld = diameter(root.left);
			int rd = diameter(root.right);
			int sd = ht(root.left) + ht(root.right) + 2;
			return Math.max(sd, Math.max(ld, rd));
		}

		public int ht(TreeNode root) {
			if (root == null) {
				return -1;
			}
			int l = ht(root.left);
			int r = ht(root.right);
			return Math.max(l, r) + 1;
		}
	}

}
