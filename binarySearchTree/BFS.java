package binarySearchTree;

import java.util.LinkedList;
import java.util.List;

enum visitBFS {
    yes, no;
};
class NodeBFS {
    String visited = visitBFS.no.toString();
    int data;
    List<NodeBFS> nodes = new LinkedList<>();
}
class ProviderBFS {
    List<NodeBFS> nodes = new LinkedList<>();
List<NodeBFS> getNodes() {
	NodeBFS e = new NodeBFS();
	NodeBFS e1 = new NodeBFS();
	e1.data = 7;
	NodeBFS e1a = new NodeBFS();
	e1a.data = 6;
	NodeBFS e1b = new NodeBFS();
	e1b.data = 5;
	e1.nodes.add(e1a);
	e1.nodes.add(e1b);
	e.nodes.add(e1);

	NodeBFS i1 = new NodeBFS();
	i1.data = 7;
	NodeBFS i1a = new NodeBFS();
	i1a.data = 6;
	NodeBFS i1b = new NodeBFS();
	i1b.data = 9;
	i1.nodes.add(i1a);
	i1.nodes.add(i1b);
	e.nodes.add(i1);
	nodes.add(e);
	return nodes;
}
}
public class BFS {
    static boolean found;
    
    public static void main(String[] arg){
	NodeBFS root = new NodeBFS();
	root.nodes.addAll(new ProviderBFS().getNodes());
	int level=0;
	BFS dfs = new BFS();
	for (NodeBFS n : root.nodes) {
	    dfs.search(n, 9,level);
	    
	}
	System.out.println(found);
    }
    private void search(NodeBFS current, int k,int level) {
	
	current.visited = visitBFS.yes.toString();
	if (current.data == k) {
	    found = true;
	    return;
	}

	if (current != null) {
	   List<NodeBFS> childs=current.nodes;
	   //level++;
	   for(NodeBFS n:childs){
	       	
	   }
	}
	return;
    }
}
