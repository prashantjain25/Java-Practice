package maths;

import java.util.Arrays;

public class PrimeFactorization {

    public static void main(String[] args) {
       int[] sp=new int[Short.MAX_VALUE];
       boolean[] conditional=new boolean[Short.MAX_VALUE];
       for(short i=2;i<Short.MAX_VALUE-1;i+=2) { 
           sp[i]=2; 
           
           conditional[i]=true;
           }
       for(short i=3;i<Short.MAX_VALUE-1;i+=2) { //crux is to exclude processed numbers and include only prime
           if(!conditional[i]) {
               conditional[i]=true;
               sp[i]=i;
               for(int j=i;j*i<Short.MAX_VALUE-1;j+=2) {
                   if(!conditional[i*j]) {
                       conditional[i*j]=true;
                       sp[i*j]=i;
                   }
               }
           }
       }
       Arrays.stream(sp).forEach(System.out::println);

    }

}
