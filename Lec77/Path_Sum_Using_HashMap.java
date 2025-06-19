package Lec77;

import java.util.HashMap;

public class Path_Sum_Using_HashMap {
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
		HashMap<Long, Integer> map = new HashMap<>();
		int c = 0;

		public int pathSum(TreeNode root, int targetSum) {
			CountPath(root, targetSum, 0);
			return c;
		}

		public void CountPath(TreeNode root, int targetSum, long sum) {
			if (root == null) {
				return;
			}
			sum += root.val;
			if (sum == targetSum) {
				c++;
			}
			c = c + map.getOrDefault(sum - targetSum, 0);
			map.put(sum, map.getOrDefault(sum , 0) + 1);
			CountPath(root.left, targetSum, sum);
			CountPath(root.right, targetSum, sum);
			map.put(sum, map.get(sum)-1);
		}
	}

}
