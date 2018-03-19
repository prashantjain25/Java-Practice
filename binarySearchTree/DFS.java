package binarySearchTree;

import java.util.LinkedList;
import java.util.List;

enum visitDFS {
    yes, no;

};

class NodeDFS {
    String visited = visitDFS.no.toString();
    int data;
    List<NodeDFS> nodes = new LinkedList<>();
}

class Provider {
    List<NodeDFS> nodes = new LinkedList<>();

    List<NodeDFS> getNodes() {
	NodeDFS e = new NodeDFS();
	NodeDFS e1 = new NodeDFS();
	e1.data = 7;
	NodeDFS e1a = new NodeDFS();
	e1a.data = 6;
	NodeDFS e1b = new NodeDFS();
	e1b.data = 5;
	e1.nodes.add(e1a);
	e1.nodes.add(e1b);
	e.nodes.add(e1);

	NodeDFS i1 = new NodeDFS();
	i1.data = 7;
	NodeDFS i1a = new NodeDFS();
	i1a.data = 6;
	NodeDFS i1b = new NodeDFS();
	i1b.data = 9;
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
	NodeDFS root = new NodeDFS();
	root.nodes.addAll(new Provider().getNodes());
	DFS dfs = new DFS();
	for (NodeDFS n : root.nodes) {
	    dfs.search(n, 9);
	}
	System.out.println(found);

    }

    private void search(NodeDFS current, int k) {
	current.visited = visitDFS.yes.toString();
	if (current.data == k) {
	    found = true;
	    return;
	}

	if (current != null) {
	    current.nodes.forEach(x -> search(x, k));
	}
	return;
    }
}
