package binarySearchTree;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

import binarySearchTree.LevelorderTraversal.Node;

public class LevelorderTraversal {

    static class Node{
       int data;
       List<Node> next=new LinkedList<Node>();
   }
    public Node createGraph(Node root){
	Node e =new Node();
	Node[] nodes=new Node[2];
		nodes[0]=new Node();
		nodes[0].data=7;
		nodes[0].next=new LinkedList<>();
		nodes[1]=new Node();
		nodes[1].data=9;
		nodes[1].next=new LinkedList<>();
	e.next.add(nodes[0]);
	e.next.add(nodes[1]);
	e.data=10;
	root.next.add(e);
	root.data=5;
	return root;
    }
    public static void main(String[] args) {
		LevelorderTraversal tr=new LevelorderTraversal();
		Node root=new Node();
		
		tr.createGraph(root);
		traverse(root);
		
    }
   static PriorityQueue<Node> pr=new PriorityQueue<>();
    public static void traverse(Node root){
	
		System.out.println(root.data);
		 List<Node> ls=root.next;
		 
		 if(ls.isEmpty()){
		      return;
		  }
		ls.forEach( node->{
		    pr.add(node);
		});
		if(!pr.isEmpty()){
		    traverse(pr.poll());
		    
		}
		  
    }

}
