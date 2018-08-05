package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Beautiful Strings
You are given an integer n and you have to find total number of strings of length n which are beautiful.
A string is called beautiful if it is lexicographically (alphabetically) sorted and only consists of vowels ('a','e','i','o','u') .
Since the number of beautiful strings of length n can be very large, you have to print answer modulo 1000000007.

Input Format:

First line contains an integer t, number of test cases.
Each of next t lines contains a single integer integer n, the length of the string.

Output format:

For each test case, print the answer in a new line.*/
/*Sample Input
2
1
2
Sample Output
5
15
*/
public class BeautifulStrings {
    static char[] vowels= {'a','e','i','o','u'};
    static Integer flag=0; 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {   flag=0;
            int n = Integer.parseInt(br.readLine().trim());
            
            int out_ = solve(n);
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
    }
    static int solve(int k){
        
        if(k==1) return vowels.length;
        String s = "";
        
        
        stringsCombination(k, vowels,"");    
        return flag%1000000007;
    }
    public static void stringsCombination(int maxLength, char[] alphabet, String curr) {
        
        if(curr.length() == maxLength) {
            flag++;//avoid outofmemory error not using List
            System.out.println(curr);
        } else {
            for(int i = 0; i < alphabet.length; i++) {
                String oldCurr = curr;
                if(curr.equals("")||lexCheck(curr,alphabet[i])) { //alphabet is to check beautiful strings[last character should be greeat, and within vowels]
                curr += alphabet[i];
                stringsCombination(maxLength,alphabet,curr);
                curr = oldCurr;
                }
                else continue;
            }
        }
        
    }
    private static boolean lexCheck(String curr, char c) {
          return  (char)curr.charAt(curr.length()-1)<=c;
    }
}
