package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr2= {2,1,3,9,4,6,5,8};
        doInsertionSort(0, arr2.length-1, arr2);
        Arrays.stream(arr2).sequential().forEach(System.out::print);


    }

    private static void doInsertionSort(int low, int high,int[] arr2) {
        if(low<high) {
        int pi=partition(low,high,arr2);
        doInsertionSort(low,pi-1,arr2);
        doInsertionSort(pi+1,high,arr2);
        }
        
        
    }

    private static int partition(int low, int high, int[] arr2) {
        int pivot=arr2[high];
        int j=low-1;
        for(int i=low;i<high;i++) {
            if(arr2[i]<=pivot) {
                j++;
                swap(i,j,arr2);
                
            }
        }
        swap(j+1,high,arr2);
        return j+1;
    }

    private static void swap(int i, int j, int[] arr2) {
       int temp=arr2[i];
       arr2[i]=arr2[j];
       arr2[j]=temp;
    }

}
