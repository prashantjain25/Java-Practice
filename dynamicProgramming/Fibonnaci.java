package dynamicProgramming;

public class Fibonnaci {
    static int number=3;
    static int lookup[] = new int[number+1];
    public static void main(String[] args) {
     System.out.println(  fib(number+1));
     _initialize();
     fibMemo(number);
     fibTab(number);
for(int i=0;i<=number;i++) {
    System.out.println(lookup[i]);
}
    }
    /*Tabulation way of DP*/
    static int fibTab(int n)
    {
      int f[] = new int[n+1];
      f[0] = 0;
      f[1] = 1;
      for (int i = 2; i <= n; i++)
            f[i] = f[i-1] + f[i-2];
      return f[n];
    }
    /* simple recursive program for Fibonacci numbers */
    static  int  fib(int n)
    {
       if ( n <= 1 )
          return n;
       return fib(n-1) + fib(n-2);
    }
    static void _initialize()
    {
      for (int i = 0; i <=number; i++)
          lookup[i] = -1;
    }
    static int fibMemo(int n) {
        /* function for nth Fibonacci number */
      //  int z=n-1<=-1?0:n-1;
          if (lookup[n] == -1)
          {
            if (n <= 1)
                lookup[n] = 1;
            else
                lookup[n] = fibMemo(n-1) + fibMemo(n-2);
          }
          return lookup[n];
        }
}
