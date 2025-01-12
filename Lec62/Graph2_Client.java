package Lec62;

import java.util.HashSet;

public class Graph2_Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph2 g = new Graph2(7);
		g.AddEdge(1, 2, 4);
		g.AddEdge(1, 4, 7);
		g.AddEdge(2, 3, 4);
		g.AddEdge(4, 3, 1);
		g.AddEdge(5, 4, 2);
		g.AddEdge(5, 6, 7);
		g.AddEdge(5, 7, 4);
		g.AddEdge(6, 7, 3);
		System.out.println(g.hasPath(1, 6, new HashSet<>()));
		g.PrintPath(1, 6, new HashSet<>(), "");
	}

}
