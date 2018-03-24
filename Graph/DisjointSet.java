import java.util.*;
public class DisjointSet {
	private Map<Long,Node> map=new HashMap<>();
	public class Node{
		long data;
		int rank;
		Node parent;
	}
	public void makeset(long data) {
		Node node=new Node();
		node.data=data;
		node.parent=node;
		node.rank=0;
		map.put(data, node);
	}
	public Node FindSet(Node node) {
		Node parent=node.parent;
		if(parent==node) {
			return parent;
		}
		node.parent=FindSet(node.parent);
		return node.parent;
	}
	public boolean union(long data1,long data2) {
		Node node1=map.get(data1);
		Node node2=map.get(data2);
		Node parent1=FindSet(node1);
		Node parent2=FindSet(node2);
		if(parent1==parent2) {
			return false;
		}
		if(parent1.rank>=parent2.rank) {
			if(parent1.rank==parent2.rank) {
				parent1.rank++;
			}
			parent2.parent=parent1;
		}
		else {
			parent1.parent=parent2;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//These type of inputs can be given :)
		/*
		 DisjointSet ds = new DisjointSet();
        ds.makeSet(1);
        ds.makeSet(2);
        ds.makeSet(3);
        ds.makeSet(4);
        ds.makeSet(5);
        ds.makeSet(6);
        ds.makeSet(7);

        ds.union(1, 2);
        ds.union(2, 3);
        ds.union(4, 5);
        ds.union(6, 7);
        ds.union(5, 6);
        ds.union(3, 7);

        System.out.println(ds.findSet(1));
        System.out.println(ds.findSet(2));
        System.out.println(ds.findSet(3));
        System.out.println(ds.findSet(4));
        System.out.println(ds.findSet(5));
        System.out.println(ds.findSet(6));
        System.out.println(ds.findSet(7));
		 */
	}

}
