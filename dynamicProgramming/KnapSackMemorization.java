package dynamicProgramming;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Stream;

public class KnapSackMemorization {

    public static int recursiveVal(int n, int[] wt, int[] val, int W) {
        if(W==0||n==0) return 0;
        if(wt[n-1]>W) return recursiveVal(n-1, wt, val, W);
        else
            return Math.max(val[n-1]+recursiveVal(n-1,wt, val, W-wt[n-1]),
                    recursiveVal(n-1, wt, val, W));
     
    }
    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
    int  W = 50;
    int n = val.length;
    System.out.println(recursiveVal(n, wt, val, W));
    HashMap<Integer, String> map=new HashMap<>();
    map.put(1, "A");
    map.entrySet().stream().filter(x-> x.getValue().equals("A")).forEach(System.out::println);
   // ((Collection) map).stream().filter(x->((HashMap) x).get(1)).collect(System.out.println());
    }

}
