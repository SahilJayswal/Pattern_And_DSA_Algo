package sorting_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
    	System.out.print("Time Complexity:- \n Best Case : O(N*LogN)  "
				+ "\n Worst Case : O(N²) \n\n ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array Size: ");
		System.out.println();
		//taking array size
		int n = sc.nextInt();
		//Initialize array with size n
		int[] arr = new int[n];
		
		System.out.print("Enter value of Array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		quick(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		sc.close();
    }
    //s=start e=end 
    static void quick(int[] a, int s, int e) {
    	if(s<e) {
    		int p= partition(a, s, e);
    		quick(a, s, p-1);
    		quick(a, p+1, e);
    	}
    }
    
    static int partition(int[] a, int s, int e) {
    	int pivot = a[e];
    	int i =s-1;
    	
    	for(int j=s; j<=e; j++) {
    			if(a[j]<pivot) {
    				i++;
    				int t = a[i];
    				a[i] = a[j];
    				a[j] = t;
    			}
    	}
    	
    	int t = a[i+1];
    	a[i+1] = a[e];
    	a[e] = t;
    	
    	return (i+1);
    }
}