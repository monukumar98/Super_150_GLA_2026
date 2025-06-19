package Lec77;

public class Path_Sum_III {

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
		public int pathSum(TreeNode root, int targetSum) {
			if (root == null) {
				return 0;
			}
			int c = countpath(root, targetSum, 0l);
			int left = pathSum(root.left, targetSum);
			int right = pathSum(root.right, targetSum);
			return c + left + right;

		}

		public int countpath(TreeNode root, int targetSum, long sum) {
			if (root == null) {
				return 0;
			}
			int c = 0;
			if (sum + root.val == targetSum) {
				c++;
			}
			int left = countpath(root.left, targetSum, sum);
			int right = countpath(root.right, targetSum, sum);
			return c + left + right;
		}
	}

}
