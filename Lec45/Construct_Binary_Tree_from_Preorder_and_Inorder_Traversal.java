package Lec45;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return CreateTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);

		}

		public TreeNode CreateTree(int[] pre, int[] ino, int plo, int phi, int ilo, int ihi) {
			if (plo > phi || ilo > ihi) {
				return null;
			}
			TreeNode node = new TreeNode(pre[plo]);

			int idx = Search(ino, ilo, ihi, pre[plo]);
			int c = idx - ilo;
			node.left = CreateTree(pre, ino, plo + 1, plo + c, ilo, idx - 1);
			node.right = CreateTree(pre, ino, plo + c + 1, phi, idx + 1, ihi);
			return node;
		}
	}

	public int Search(int[] in, int lo, int hi, int item) {
		for (int i = lo; i <= hi; i++) {
			if (in[i] == item) {
				return i;
			}
		}
		return 0;

	}
}
