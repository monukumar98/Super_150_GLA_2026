package Lec63;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Is_Graph_Bipartite {
	class Solution {
		public boolean isBipartite(int[][] graph) {
			Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			for (int vtx = 0; vtx < graph.length; vtx++) {
				if (visited.containsKey(vtx)) {
					continue;
				}
				// BFS
				q.add(new BipartitePair(vtx, 0));
				while (!q.isEmpty()) {
					// 1. romve
					BipartitePair rp = q.poll();
					// 2. Ignore
					if(visited.containsKey(rp.vtx)) {
						if(visited.get(rp.vtx)!=rp.dis) {// odd length ki cycle mil gya
							return false;
						}
						continue;
					}
					
					// 3. Add visited
					visited.put(rp.vtx, rp.dis);

					// 5. Add unvisited nbrs
                    for(int nbrs: graph[rp.vtx]) {
                    	if(!visited.containsKey(nbrs)) {
                    		q.add(new BipartitePair(nbrs, rp.dis+1));
                    	}
                    }
				}
			}
			return true;
		}
	}

	class BipartitePair {
		int vtx;
		int dis;

		public BipartitePair(int vtx, int dis) {
			// TODO Auto-generated constructor stub
			this.dis = dis;
			this.vtx = vtx;
		}
	}
}
