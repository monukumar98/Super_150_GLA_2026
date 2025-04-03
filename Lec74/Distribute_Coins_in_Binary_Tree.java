package Lec74;

public class Distribute_Coins_in_Binary_Tree {

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
		int ans = 0;

		public int distributeCoins(TreeNode root) {
			distribute_Coins(root);
			return ans;
		}

		public int distribute_Coins(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int left = distribute_Coins(root.left);
			int right = distribute_Coins(root.right);
			ans = ans + Math.abs(left) + Math.abs(right);
			return left + right + root.val - 1;

		}
	}

}







