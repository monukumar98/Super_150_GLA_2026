package Lec64;

import java.util.*;


public class Dijkstra_Algorithm {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algorithm(int v) {
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

	class DijkstraPair {
		int vtx;
		String acqpath;
		int cost;

		public DijkstraPair(int vtx, String acqpath, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.cost = cost;
			this.acqpath = acqpath;
		}

		@Override
		public String toString() {
			return vtx + " " + acqpath + " @ " + cost;
		}
	}

	public void Dijskra(int src) {
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}

		});
		pq.add(new DijkstraPair(src, "" + src, 0));
		while (!pq.isEmpty()) {
			// 1 . remove
			DijkstraPair rp =pq.poll();
			// 2. Ignore
			if(visited.contains(rp.vtx)){
				continue;
			}
			// 3. Marked visited
			visited.add(rp.vtx);
			// 4. Seld work
			System.out.println(rp);
			// 5. Add unvisited nbrs
			for(int nbrs:map.get(rp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DijkstraPair(nbrs, rp.acqpath+nbrs, rp.cost+cost));
				}
			}
		}
	}

}









