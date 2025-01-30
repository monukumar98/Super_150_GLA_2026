package Lec66;

import java.util.*;

public class Nearest_Meeting_Cell {

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

	static class Pair {
		long dis;
		int vtx;

		public Pair(long dis, int vtx) {
			// TODO Auto-generated constructor stub
			this.dis = dis;
			this.vtx = vtx;
		}

	}

	public static int Nearest_Meeting(int n, int[] edges, int c1, int c2) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(i, new ArrayList<>());
		}
		for (int i = 0; i < edges.length; i++) {
			if (edges[i] != -1) {
				map.get(i).add(edges[i]);
			}
		}
		long[] A = Dijkstra(map, c1);
		long[] B = Dijkstra(map, c2);

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

	private static long[] Dijkstra(HashMap<Integer, List<Integer>> map, int c1) {
		// TODO Auto-generated method stub
		long[] dis = new long[map.size()];
		Arrays.fill(dis, Long.MAX_VALUE);
		PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				// TODO Auto-generated method stub
				return Long.compare(o1.dis, o2.dis);
			}

		});
		pq.add(new Pair(0, c1));
		while (!pq.isEmpty()) {
			Pair p = pq.poll();
			int node = p.vtx;
			long d = p.dis;
			if (dis[node] > d) {
				dis[node] = d;
			}
			for (int nbrs : map.get(node)) {
				if (dis[nbrs] == Long.MAX_VALUE) {
					pq.add(new Pair(d + 1, nbrs));
				}
			}

		}

		return dis;
	}

}
