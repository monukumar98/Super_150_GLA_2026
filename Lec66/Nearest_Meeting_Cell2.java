package Lec66;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Nearest_Meeting_Cell2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] edges = new int[n];
		for (int i = 0; i < edges.length; i++) {
			edges[i] = sc.nextInt();
		}
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		System.out.println(Nearest_Meeting(n, edges, c1, c2));
	}

	public static int Nearest_Meeting(int n, int[] edges, int c1, int c2) {
		long[] A = Distance(n, edges, c1);
		long[] B = Distance(n, edges, c2);
		int ans = -1;
		long dis = Long.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (A[i] == Long.MAX_VALUE || B[i] == Long.MAX_VALUE) {
				continue;
			}
			if (dis > A[i] + B[i]) {
				ans = i;
				dis = A[i] + B[i];
			}

		}
		return ans;

	}

	public static long[] Distance(int n, int[] edges, int c1) {
		int dis = 0;
		long[] A = new long[n];
		Arrays.fill(A, Long.MAX_VALUE);
		Queue<Integer> q = new LinkedList<>();
		q.add(c1);
		while (!q.isEmpty()) {
			int r = q.poll();
			if (A[r] > dis) {
				A[r] = dis;
			}
			int nbrs = edges[r];
			if (A[nbrs] == Long.MAX_VALUE) {
				q.add(nbrs);
				dis++;
			}
		}
		return A;
	}

}
