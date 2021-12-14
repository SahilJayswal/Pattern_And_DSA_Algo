package Pattern;

import java.util.Scanner;

public class Alphabet_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.print("Enter number of rows: ");
    	int n = sc.nextInt();
    	sc.close();
    	pattern1(n);
    	pattern2(n);
    	pattern3(n);
    	pattern4(n);
    	pattern5(n);
    	pattern6(n);
    	
	}
	
	static void pattern1(int n) {
		System.out.print("\n 1. Pattern1 \n");
		
		int alphabet = 65;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
		
	}
	
	static void pattern2(int n) {
		System.out.print("\n 2. Pattern2 \n");
		
		int alphabet = 65;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(alphabet+i)+" ");
			}
			System.out.println();
		}
		
	}
	
	static void pattern3(int n) {
		System.out.print("\n 3. Pattern3 \n");
		
		int alphabet = 65;
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print((char)(alphabet+n-i)+" ");
			}
			System.out.println();
		}
		
	}
	
	static void pattern4(int n) {
		System.out.print("\n 4. Pattern4 \n");
		
		int alphabet = 65;
		
		for(int i=0; i<n; i++) {
		  for(int j=i; j<n; j++){
		    System.out.print(" ");
		  }
			for(int j=0; j<=i; j++) {
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
		
	}
	
	static void pattern5(int n) {
		System.out.print("\n 5. Pattern5 \n");
		
		int alphabet = 65;
		
		for(int i=0; i<n; i++) {
		  for(int j=i; j<n; j++){
		    System.out.print(" ");
		  }
			for(int j=0; j<=i; j++) {
				System.out.print((char)(alphabet+i)+" ");
			}
			System.out.println();
		}
		
	}
	
	static void pattern6(int n) {
		System.out.print("\n 6. Pattern6 \n");
		
		int alphabet = 65;
		
		for(int i=0; i<n; i++) {
		  for(int j=0; j<=i; j++){
		    System.out.print(" ");
		  }
			for(int j=i; j<n; j++) {
				System.out.print((char)(alphabet+(n-1)-i)+" ");
			}
			System.out.println();
		}
		
	}

}
