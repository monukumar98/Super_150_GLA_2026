package Lec60;

import java.util.Deque;
import java.util.LinkedList;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
	}

	public static int[] SlidingWindow(int[] arr, int k) {

		int[] ans = new int[arr.length - k + 1];
		Deque<Integer> dq = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && arr[dq.getLast()] < arr[i]) {
				dq.removeLast();
			}
			dq.add(i);
		}
		int j = 0;
		ans[j++] = arr[dq.getFirst()];
		for (int i = k; i < arr.length; i++) {
			// grow
			while (!dq.isEmpty() && arr[dq.getLast()] < arr[i]) {
				dq.removeLast();
			}
			dq.add(i);
			// shrink
			if (i - k == dq.getFirst()) {
				dq.remove();
			}

			// ans update
			ans[j++] = arr[dq.getFirst()];

		}
		return ans;

	}
}
