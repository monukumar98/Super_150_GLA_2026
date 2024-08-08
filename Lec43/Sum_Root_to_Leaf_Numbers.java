package Lec43;

public class Sum_Root_to_Leaf_Numbers {

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
		public int sumNumbers(TreeNode root) {
			return Number(root, 0);
		}

		public int Number(TreeNode root, int sum) {

			if (root == null) {
				return 0;
			}
			if (root.left == null && root.right == null) {
				return sum * 10 + root.val;
			}
			int left = Number(root.left, sum * 10 + root.val);
			int right = Number(root.right, sum * 10 + root.val);
			return left + right;
		}
	}

}
