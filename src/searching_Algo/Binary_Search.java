package searching_Algo;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		
		System.out.print("Time Complexity:- \n Best Case : O(1)  "
				+ "\n Worst Case : O(LogN) \n\n ");
		
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
		
		System.out.print("Enter target value: ");
		int target = sc.nextInt();
		
		int ans = binary(arr, target);
		System.out.println("Targer element is available at index: " +ans);
		sc.close();

	}
	
	static int binary(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start + (end - start) / 2;
			
			if(target<arr[mid]) {
				end = mid - 1;
			}
			if(target>arr[mid]) {
				start = mid + 1;
			}
			if(target==arr[mid]) {
				return mid;
			}
		}
		
		
		return -1;
	}

}
