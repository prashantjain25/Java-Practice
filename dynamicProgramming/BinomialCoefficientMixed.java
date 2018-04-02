package dynamicProgramming;

public class BinomialCoefficientMixed {

    static int n=5;
    static int k=3;
    int memory[][]=new int[n+1][k+1];
    public int binaomial(int n, int k){
        if(k==0||k==n) return 1;
        memory[n][k]=binaomial(n-1, k-1);
        return memory[n][k]+binaomial(n-1, k);
    }
    public static void main(String[] args) {
       System.out.println(new BinomialCoefficientMixed().binaomial(n, k));
    }

}