package Lec45;

public class Validate_Binary_Search_Tree {
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
		public boolean isValidBST(TreeNode root) {
			return ValidBST(root).isBst;

		}

		public BstPair ValidBST(TreeNode root) {
			if (root == null) {
				return new BstPair();
			}

			BstPair lbp = ValidBST(root.left);
			BstPair rbp = ValidBST(root.right);
			BstPair sbp = new BstPair();
			sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
			sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
			sbp.isBst = lbp.isBst && rbp.isBst && root.val > lbp.max && root.val < rbp.min;
			return sbp;

		}

		class BstPair {
			long min = Long.MAX_VALUE;
			long max = Long.MIN_VALUE;
			boolean isBst = true;
		}
	}
}
