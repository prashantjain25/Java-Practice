package dynamicProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NumberOfTrees {
   
    public static int numberOfPossibilities(int n, int[] sol){
        int bt=0;
        if(n==0||n==1) return 1;
        for(int i=1;i<=n;i++) {
            if(sol[i-1]==-1) {
                sol[i-1]=numberOfPossibilities(i-1, sol);
            }
            if(sol[n-i]==-1) {
                sol[n-i]=numberOfPossibilities(n-i, sol);
            }
            
            bt+=sol[i-1]*sol[n-i];
        }
//        Stream s=Arrays.stream(sol).boxed();
//        s.forEach(x->System.out.println(x));
        return bt;
    }
    public static void main(String[] args) {
        int n=3;
        int[] sol =new int[n];    
        for(int i=0;i<n;i++) {
                sol[i]=-1;
            }
         n=numberOfPossibilities(n, sol);
         System.out.println(n);
    }

}
