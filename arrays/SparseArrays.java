package arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArrays {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      String[] input=new String[N];
      for(int i=0;i<N;i++){
        input[i]=sc.next();
      }
      int Q=sc.nextInt();
      String[] queries=new String[Q];
      for(int i=0;i<Q;i++){
        queries[i]=sc.next();
      }
      int[] count=new int[Q];
      for(int i=0; i<Q; i++){
               String str=queries[i];
               for(int j=0;j<N;j++){
                 if(str.equals(input[j])){
                 count[i]++;
                 }
               }
      }
      for(int x:count)
     System.out.println(x);
}
}