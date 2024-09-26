package Lec52;

import java.util.HashMap;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		System.out.println(Longest_Consecutive(arr));
	}

	public static int Longest_Consecutive(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i] - 1)) {
				map.put(arr[i], false);
			} else {
				map.put(arr[i], true);
			}
			if (map.containsKey(arr[i] + 1)) {
				map.put(arr[i] + 1, false);
			}
		}
		int ans = 0;
		for (int v : map.keySet()) {
			if (map.get(v)) {
				int count = 0;
				while (map.containsKey(v)) {
					v++;
					count++;
				}
				ans = Math.max(ans, count);

			}
		}
		return ans;
	}
}
