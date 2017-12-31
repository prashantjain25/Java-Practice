package binarySearchTree;

import java.util.LinkedList;
import java.util.List;

enum visit {
    yes, no;

};

class Node {
    String visited=visit.no.toString();
    int data;
    List<Node> nodes=new LinkedList<>();
}

 class Provider{
     List<Node> nodes=new LinkedList<>();
     List<Node> getNodes(){
	 Node e=new Node();
	 	Node e1=new Node();
	 	e1.data=7;
	 		Node e1a=new Node();
	 		e1a.data=6;
	 		Node e1b=new Node();
	 		e1b.data=5;
	 	e1.nodes.add(e1a);
	 	e1.nodes.add(e1b);
	 e.nodes.add(e1);
	 
	
	 	Node i1=new Node();
	 	i1.data=7;
	 		Node i1a=new Node();
	 		i1a.data=6;
	 		Node i1b=new Node();
	 		i1b.data=9;
	 	i1.nodes.add(i1a);
	 	i1.nodes.add(i1b);
	 e.nodes.add(i1);
	 nodes.add(e);
	return nodes;
    }
}
public class DFS {
    static boolean found;
    public static void main(String[] args) {
	int N = 5;
	Node root = new Node();
	//root.data=10;
	root.nodes.addAll(new Provider().getNodes());
	DFS dfs=new DFS();
		for(Node n:root.nodes)
		    {
		    dfs.search(n,9);
		    }
	    System.out.println(found );
	
    }

    private void search(Node current, int k) {
	current.visited = visit.yes.toString();
	if(current.data==k){
	    found=true;
	    return ;
	}
	    
	if (current != null) {
	    current.nodes.forEach(x -> search(x,k));
	}
	    return ;
    }
}
