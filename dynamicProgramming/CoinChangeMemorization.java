package dynamicProgramming;

public class CoinChangeMemorization {
    int[] coins= {9,5,3,1};
    static int V=11;
    int[] memory=new int[V+1];
    public int getMinChange(int valueLeft) {
       if(valueLeft==0) return 0;
        if(memory[valueLeft]!=0)
            return memory[valueLeft];
        int res=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++) {
            if(valueLeft>=coins[i]) {
                res=Math.min(getMinChange(valueLeft-coins[i])+1,res);
            }
        }
        memory[valueLeft]=res;
        return res;
    }
    public static void main(String[] args) {
   
    System.out.println("Minimum coins required is "
            + new CoinChangeMemorization().getMinChange(V));
    }

}
