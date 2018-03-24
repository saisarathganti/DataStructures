import java.util.*;
public class Graph {
	List<Edge> G[];
	public Graph(int n){
		G=new LinkedList[n];
		for(int i=0;i<n;i++) {
			G[i]=new LinkedList<Edge>();
		}
		
	}
	public void addEdge(int u,int v,int weight) {
		G[u].add(0,new Edge(v,weight));
	}
	 class Edge{
		int v,weight;
		Edge(int v,int weight){
			this.v=v;
			this.weight=weight;
		}
		public String toString() {
			return "("+v+","+weight+")";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g=new Graph(10);
		g.addEdge(0, 3, 15);
	}

}
