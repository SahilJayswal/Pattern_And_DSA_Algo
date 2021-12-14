package sorting_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		System.out.print("Time Complexity:- \n Best Case : O(N) If array is sorted "
				+ "\n Worst Case : O(N²) If arrays is sorted descending order \n\n ");
		
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
		
		bubble(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();

	}

	private static void bubble(int[] arr) {
		boolean swapped;
		
		for(int i=0; i<arr.length; i++) {
			swapped = false;
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		
	}

}
