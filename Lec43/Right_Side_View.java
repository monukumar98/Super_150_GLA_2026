package Lec43;

import java.util.ArrayList;
import java.util.List;

public class Right_Side_View {
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
		int maxdepth = 0;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ans  =  new ArrayList<Integer>();
			rightView(root, 1, ans);
			return ans;
		}

		public void rightView(TreeNode root, int curr_level, List<Integer> ans) {
			if (root == null) {
				return;
			}
			if (curr_level > maxdepth) {
				ans.add(root.val);
				maxdepth = curr_level;
			}

			rightView(root.right, curr_level + 1, ans);
			rightView(root.left, curr_level + 1, ans);
		}
	}
}




