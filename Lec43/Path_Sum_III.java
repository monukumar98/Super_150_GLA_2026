package Lec43;

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
			return path(root, targetSum);
		}
		public int path(TreeNode root, long targetSum) {
			if (root == null) {
				return 0;
			}
			int c = CountPath(root, targetSum);
			int l = path(root.left, targetSum);
			int r = path(root.right, targetSum);
			return l + r + c;
		}

		public int CountPath(TreeNode root, long targetSum) {
			if (root == null) {
				return 0;
			}
			int count = 0;
			if (root.val - targetSum == 0) {
				count++;
			}

			int left = CountPath(root.left, targetSum - root.val);
			int right = CountPath(root.right, targetSum - root.val);
			return left + right + count;

		}
	}

}
