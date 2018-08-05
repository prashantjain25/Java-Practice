package dynamicProgramming;

import java.util.Stack;

public class TowerOfHanoid {
    static Stack[] stack=new Stack[4];
    public static void main(String[] args) {
        for(int i=0;i<4;i++) {
            stack[i]=new Stack();
        }
        for(int i=3;i>0;i--) {
            stack[1].push(i);
        }
        tower(3,1,3,2);
        //towerString(a.size(),"a","c","b");
    }
    private static void tower(int n,int source,int dest, int aux) {
       
        if(n>1) {
           tower(n-1,1,2,3);
           
           stack[dest].push(stack[source].pop());
           System.out.println(source+"-> "+stack[source]+ aux+"-> "+stack[aux]+ dest+"-> "+stack[dest]);
           tower(n-1,2,3,1);
    }
    }
    private static void towerString(int n,String a, String c, String b) {
        
        if(n==1) {
          // c.push(a.pop());
        System.out.println("source-> "+a+" aux-> "+b+" dest-> "+c);
        return;
        }
        towerString(n-1,a,b,c);
           //c.push(b.pop());
           System.out.println("source-> "+a+" aux-> "+b+" dest-> "+c);
           towerString(n-1,b,c,a);
           //return;
    }
}
