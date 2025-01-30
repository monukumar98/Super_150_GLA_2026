package Lec66;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Largest_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] edges = new int[n];
		for (int i = 0; i < edges.length; i++) {
			edges[i] = sc.nextInt();
		}
		System.out.println(LargestSum(edges, n));
	}

	public static int LargestSum(int[] edges, int n) {
		int[] in = new int[n];
		for (int i = 0; i < in.length; i++) {
			if (edges[i] != -1) {
				in[edges[i]]++;
			}
		}
		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[n];
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		while (!q.isEmpty()) {
			int rv = q.poll();
			visited[rv] = true;
			if (edges[rv] != -1) {
				in[edges[rv]]--;
				if (in[edges[rv]] == 0) {
					q.add(edges[rv]);
				}
			}
		}
		int ans = -1;
		for (int i = 0; i < n; i++) {
			if (visited[i] == false) {
				int sum = i;
				visited[i] = true;
				int nbrs = edges[i];
				while (nbrs != i) {
					sum += nbrs;
					visited[nbrs] = true;
					nbrs = edges[nbrs];
				}
				ans = Math.max(ans, sum);
			}
		}
		return ans;

	}

}
