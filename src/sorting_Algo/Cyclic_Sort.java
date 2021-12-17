package sorting_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Cyclic_Sort {

	public static void main(String[] args) {
		

		System.out.print("Time Complexity:- \n Best Case : O(N²)  "
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
		
		cyclic(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();

	}
	
	static void cyclic(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct = arr[i]-1;
			if(arr[i]!=arr[correct]) {
				int t = arr[i];
				arr[i] = arr[correct];
				arr[correct] = t;
			}
			else {
				i++;
			}
		}
	}

}
