package Lec74;

public class Binary_Tree_Cameras {

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
		int Camera = 0;

		public int minCameraCover(TreeNode root) {
			int x = minCamera(root);
			if (x == -1) {
				Camera++;
			}
			return Camera;
		}

		public int minCamera(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int left = minCamera(root.left);
			int right = minCamera(root.right);
			if (left == -1 || right == -1) {
				Camera++;
				return 1;// Camera setup kra hai
			} else if (left == 1 || right == 1) {
				return 0;// already child se covered hai
			} else {
				return -1; // Node pe Camera ki need hai
			}
		}
	}

}
