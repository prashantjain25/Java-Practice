package arrays;


public class ReversalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		   leftRotate(arr, 2, 7);
		   printArray(arr, 7);
	}
	private static void printArray(int[] arr, int x) {
		int i;
		  for(i = 0; i < x; i++)
		    System.out.println(arr[i]);
		
		
	}
	static void leftRotate(int arr[], int d, int n)
	{ 
	  /* Return If number of elements to be rotated is 
	    zero or equal to array size */ 
	  if(d == 0 || d == n)
	    return;
	     
	  /*If number of elements to be rotated is exactly 
	    half of array size */ 
	  if(n-d == d)
	  {
	    swap(arr, 0, n-d, d);   
	    return;
	  }  
	     
	 /* If A is shorter*/             
	  if(d < n-d)
	  {  
	    swap(arr, 0, n-d, d);
	    leftRotate(arr, d, n-d);    
	  }    
	  else /* If B is shorter*/             
	  {
	    swap(arr, 0, d, n-d);
	    int[] arr2=new int[n-d];
	    System.arraycopy(arr, n-d, arr2, 0, n-d);
	    System.out.println(arr2.length);
	    leftRotate(arr2, 2*d-n, d); /*This is tricky*/
	  }
	}
	static void swap(int arr[], int fi, int si, int d)
	{
	   int i, temp;
	   for(i = 0; i<d; i++)   
	   {
	     temp = arr[fi + i];
	     arr[fi + i] = arr[si + i];
	     arr[si + i] = temp;
	   }     
	}     
}
