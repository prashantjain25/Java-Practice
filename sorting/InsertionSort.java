package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) throws IOException {
        int N = (new BufferedReader(new InputStreamReader(System.in))).read();
        int[] arr = new int[N];
        /*Arrays.stream(arr)
        .mapToObj(e->e.set((new BufferedReader(new InputStreamReader(System.in))).read()));*/
        int[] arr2= {2,1,3,9,4,6,5,8};
        doInsertionSort(arr2);
        for(int x:arr2) {
            System.out.print(x);
        }
        System.out.println();
        Arrays.stream(arr2).sequential().forEach(System.out::print);

    }

    private static void doInsertionSort(int[] arr2) {
        for(int i=1;i<arr2.length;++i) {
            int key=arr2[i];
            int j=i;
            while(j>0 && arr2[j-1]>key) {
                arr2[j]=arr2[j-1];
                j=j-1;
            }
            arr2[j]=key;
        }
        
    }

}
