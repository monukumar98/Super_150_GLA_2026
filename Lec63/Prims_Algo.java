package Lec63;

import java.util.*;

public class Prims_Algo {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	class PrimsPair {
		int vtx;
		int acqvtx;
		int cost;

		public PrimsPair(int vtx, int acqvtx, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acqvtx = acqvtx;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return vtx + " " + acqvtx + " @ " + cost;
		}
	}

	public void Prims() {
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new PrimsPair(1, 1, 0));
		while (!pq.isEmpty()) {
			// 1. remove
			PrimsPair rp = pq.poll();

			// 2. Igonre
			if (visited.contains(rp.vtx)) {
				continue;
			}

			// 3. Marked Visited
			visited.add(rp.vtx);

			// 4. self work
			System.out.println(rp);

			// 5. Add unvisited
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new PrimsPair(nbrs, rp.vtx, cost));

				}
			}

		}
	}

	public static void main(String[] args) {
		Prims_Algo pa = new Prims_Algo(7);
		pa.AddEdge(1, 2, 4);
		pa.AddEdge(1, 4, 7);
		pa.AddEdge(2, 3, 2);
		pa.AddEdge(4, 3, 5);
		pa.AddEdge(4, 5, 1);
		pa.AddEdge(6, 5, 3);
		pa.AddEdge(7, 5, 7);
		pa.AddEdge(7, 6, 2);
		pa.Prims();
	}
}
