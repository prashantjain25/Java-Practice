package arrays;

import java.util.Arrays;

public class ShiftArrayByK {

    public static void main(String[] args) {
        int k=3;
            int[] arrShift=new int[k];
            int[] arr= {1,4,6,2,8,4,9,12,10};
            Arrays.stream(arr).forEach(x->System.out.print(x+" "));

            arrShift=Arrays.copyOfRange(arr, 0, k);

            for(int i=0; i<arr.length-k;i++) {
                arr[i]=arr[i+3];
            }
           //Arrays.stream(arr).forEach(x->System.out.print(x+" "));
           System.out.println();
            for(int i=arr.length-k,j=0;i<arr.length;j++,i++) {
                arr[i]=arrShift[j];
            }
            Arrays.stream(arr).forEach(x->System.out.print(x+" "));
    }

}
