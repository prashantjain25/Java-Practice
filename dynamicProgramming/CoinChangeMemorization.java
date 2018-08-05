package dynamicProgramming;

import java.util.Arrays;

import sun.security.krb5.internal.rcache.MemoryCache;

public class CoinChangeMemorization {
    int[] combinations=new int[10];
    int[] coins= {2,1};
    static int V=4; //amount to be achieved
    static int[] memory=new int[V+1];
    public int getMinChange(int valueLeft) {
       if(valueLeft==0) return 0;
        if(memory[valueLeft]!=0)
            return memory[valueLeft];
        int res=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++) {
            if(valueLeft>=coins[i]) {
               
                res=Math.min(getMinChange(valueLeft-coins[i])+1,res); //crux create result for storing into memory
            }
        }
        memory[valueLeft]=res;
       //Arrays.stream(memory).forEach(System.out::println);
        return res;
    }
    
    
    
    public static void main(String[] args) {
   
    System.out.println("Minimum coins required is "
            + new CoinChangeMemorization().getMinChange(V));
    for(int r=0;r<memory.length;r++) {
        if(memory[r]==Integer.MAX_VALUE)
        System.out.print(r+" residual "); //residuals testing purposes
    }
   // Arrays.stream(memory).forEach(x->System.out.print(x));
    }

}
