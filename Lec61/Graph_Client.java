package Lec61;

public class Graph_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.AddEdge(1, 2, 4);
		g.AddEdge(1, 4, 7);
		g.AddEdge(2, 3, 4);
		g.AddEdge(4, 3, 1);
		g.AddEdge(5, 4, 2);
		g.AddEdge(5, 6, 7);
		g.AddEdge(5, 7, 4);
		g.AddEdge(6, 7, 3);
		g.Display();
		g.removevertex(4);
		g.Display();
	}

}
