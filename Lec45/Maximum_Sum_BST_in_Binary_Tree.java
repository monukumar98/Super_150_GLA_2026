package Lec45;

public class Maximum_Sum_BST_in_Binary_Tree {
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

	public BstPair ValidBST(TreeNode root) {
		if (root == null) {
			return new BstPair();
		}

		BstPair lbp = ValidBST(root.left);
		BstPair rbp = ValidBST(root.right);
		BstPair sbp = new BstPair();
		sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
		sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
		sbp.sum = lbp.sum + rbp.sum + root.val;
		sbp.isBst = lbp.isBst && rbp.isBst && root.val > lbp.max && root.val < rbp.min;
		if (sbp.isBst) {
			sbp.ans = Math.max(lbp.ans, Math.max(rbp.ans, sbp.sum));
		} else {
			sbp.ans = Math.max(lbp.ans, rbp.ans);
		}

		return sbp;

	}

	class BstPair {
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		boolean isBst = true;
		int sum = 0;// current Tree ki Sum
		int ans = 0;// current bst me maximum sum
	}

}
