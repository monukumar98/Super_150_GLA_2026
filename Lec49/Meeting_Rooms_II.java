package Lec49;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_Rooms_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 30 }, { 15, 20 }, { 5, 10 }, { 11, 15 } ,{12,20}};
		Arrays.sort(arr, (a, b) -> a[0] - b[0]);
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		int room = 1;
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
		pq.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (pq.peek()[1] > arr[i][0]) {
				pq.add(arr[i]);
				room = Math.max(room, pq.size());
			} else {
				pq.poll();
				pq.add(arr[i]);

			}
		}
		System.out.println(room);

	}

}
