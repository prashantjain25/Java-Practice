package dynamicProgramming;

import java.util.Arrays;
import java.util.stream.Stream;

public class CoinChangeTabulation {

    // m is size of coins array
    // (number of different coins)
    static int minCoins(int coins[], int m, int V) {
        // table[i] will be storing
        // the minimum number of coins
        // required for i value. So
        // table[V] will have result
        int table[] = new int[V + 1];
        int tableCoins[] = new int[m+1];

        // Base case (If given value V is 0)
        table[0] = 0;

        // Initialize all table values as Infinite
        for (int i = 1; i <= V; i++) 
            table[i] = Integer.MAX_VALUE;
       
        for(int i=0;i<m;i++)
            tableCoins[i]=0;

        // Compute minimum coins required for all
        // values from 1 to V
        for (int i = 1; i <= V; i++) {
            // Go through all coins smaller than i
            for (int j = 0; j < m; j++)
                if (coins[j] <= i) {
                    int sub_resCoins = table[i - coins[j]];
                    if (sub_resCoins != Integer.MAX_VALUE && sub_resCoins + 1 < table[i]) { //an assumption is made
                        tableCoins[j]+=1;
                        table[i] = sub_resCoins + 1;
                    }

                }

        }
       Arrays.stream(tableCoins).forEach(x->System.out.println(" "+x ));
        return table[V];

    }

    // Driver program
    public static void main(String[] args) {
        int coins[] = { 9, 5, 3 };
        int m = coins.length;
        int V = 12;
        System.out
                .println("Minimum coins required is " + minCoins(coins, m, V));
    }

}
