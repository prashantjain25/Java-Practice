package binarySearchTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

import binarySearchTree.LevelorderTraversal.Node;

public class NodeDeletionCounting {
    static Node root;
    static class Node{
        int data;
        Node p; //this is a parent node
        Node left;
        Node right;
        int level;
        Node(int data,int level,Node p){
            this.data=data;
            this.level=level;
            if(level!=-1) {
            this.p=p;
            }
            
        }
    }
    public static void createTree(int count,int level){
        if(level==-1) {
            root =new Node(count,level,null);
        }
        else{
            lastNode(count,level);
        }
    }
    
    /**
     * This adds node for left and right child of the tree.
     *
     * @param count the count
     * @param level the level
     */
    public static void lastNode(int count,int level) {
        Node n=null;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(queue!=null) {
            n=queue.remove();
            if(n.left==null) {
                n.left=new Node(count,level,n);
                //n.left.p=n;
               break; 
            }
            else queue.add(n.left);
             if(n.right==null)  {
                n.right=new Node(count,level,n);
                //n.right.p=n;
                break;
            }
            else queue.add(n.right);
        }
        
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        // Reading data using readLine
          int N= Integer.parseInt(reader.readLine());
      int[] treeNodes=new int[N];
      String[] str=reader.readLine().split(" ");
      AtomicInteger counter = new AtomicInteger(-1);
    Arrays.stream(str).forEach(x->{
        counter.addAndGet(1);
          treeNodes[counter.get()]=Integer.parseInt(x); 
          
      });
      int delN=Integer.parseInt(reader.readLine());
      for(int i=0;i<N;i++)
      createTree(i,treeNodes[i]);
      //Arrays.stream(treeNodes).forEach(x->System.out.println(x));
      Node delNode=searchData(delN);
      if(delNode!=null) {
          deletion(delNode);
      }
      int p=(searchLevel(treeNodes[treeNodes.length-1]));
      System.out.println(p>0?p:0);
          
    }
    public static int searchLevel(int level) {
        Node n=null;
        int count=0;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(queue.size()>0) {
            n=queue.remove();
            if(n.left==null && n.right==null) {
                count++;
                
            }
            
            if(n.left!=null) {
                queue.add(n.left);
            }
            if(n.right!=null) {
                queue.add(n.right);
            }
        }
        return count;
    }
    
    /**
     * Search data, retrieves the whole node from tree.
     *
     * @param count the count
     * @return the node
     */
    public static Node searchData(int count) {
        Node n=null;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(queue.size()>0) {
            n=queue.remove();
            if(n.data==count) {
                return n;
            }
            if(n.left!=null) {
                queue.add(n.left);
            }
            if(n.right!=null) {
                queue.add(n.right);
            }
        }
        return null;
    }
    
    /**
     * Replacer a.k.a Transplant node.
     * keep level and parent intact
     * @param u the u
     * @param v the v
     */
    public static void replacer(Node u, Node v) {
        if(u.p==null) {
            root=v;
            u.level=-1;
        }
        else if(u.p.left==u) {
            v.level=u.level;
            u.p.left=v;
        }
        else {
            v.level=u.level;
            u.p.right=v;
        }
        if(v!=null) {
            v.p=u.p;
        }
    }
    
    /**
     * Find Minimum on the leftmost side of tree.
     *
     * @param z the z
     * @return the node
     */
    public static Node minimum(Node z) {
        if(z.left!=null) {
            z=minimum(z.left);
        }
        return z;
    }
    
    /**
     * Deletion of actual node received from tree.
     *
     * @param z the z
     * @return the node
     */
    public static Node deletion(Node z) {
        Node y=null;
        Node lastode=null;
        if(z.right==null && z.left==null) {
           if(z.p.left==z)
               z.p.left=null;
           if(z.p.right==z)
               z.p.right=null;
           return root;
        }
        if(z.left==null )
            replacer(z,z.right);
        else if(z.right==null )
            replacer(z,z.left);
        else {
            y=minimum(z.right); //successor of the z
            lastode=y.p;
        }
        // crux of the problem is y being on the right,
        //solve for y as right then update y.left
         if(y.p!=z ) {
             if(y.right!=null)
                 replacer(y,y.right);
             
            y.right=z.right;
            y.right.p=y;
         }
            replacer(z,y);
            y.left=z.left;
            y.left.p=y;
            lastode.left=null; // will remain null in both case I and case II
            return root;
    }

}
