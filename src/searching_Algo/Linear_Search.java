package searching_Algo;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		
		System.out.print("Time Complexity:- \n Best Case : O(1)  "
				+ "\n Worst Case : O(N) \n\n ");
		
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
		
		int ans = linear(arr, target);
		System.out.println("Targer element is available at index: " +ans);
		sc.close();

	}
	
	static int linear(int[] arr, int target) {
			
		if(arr.length==0) {
			return -1;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	

}
