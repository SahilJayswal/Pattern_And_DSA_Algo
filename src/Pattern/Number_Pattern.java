package Pattern;

import java.util.Scanner;

class Number_Pattern {
    public static void main(String args[] ) {
    	
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
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
	static void pattern2(int n) {
		System.out.print("\n 2. Pattern2 \n");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	
	static void pattern3(int n) {
		System.out.print("\n 3. Pattern3 \n");
		
		for(int i=1; i<=n; i++) {
			for(int j=i,p=0; j<=n; j++,p++) {
				System.out.print((n-p)+" ");
			}
			System.out.println();
		}
		
	}
	
		static void pattern4(int n) {
		System.out.print("\n 4. Pattern4 \n");
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
		static void pattern5(int n) {
		System.out.print("\n 5. Pattern5 \n");
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			} 
			int p=1;
			for(int j=1; j<=i; j++) {
				System.out.print(p+" ");
				p = p*(i-j)/(j);
			}
			System.out.println();
		}
		
	}
	
		static void pattern6(int n) {
		System.out.print("\n 6. Pattern6 \n");
		
		for(int i=1; i<=n; i++) {
		  for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=i,p=1; j<=n; j++,p++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
	}
}
