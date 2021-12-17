package searching_Algo;

import java.util.Scanner;

public class Linear_Search_Char {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = sc.next();
		
		System.out.println("Enter a char to search position in string : ");
		char c = sc.next().charAt(0);
		
		int ans = linear(str, c);
		System.out.println("Character position is: "+ ans);
		
		sc.close();
	}

	static int linear(String str, char c) {
		
		if(str.length()==0) {
			return -1;
		}
		for(int i=0; i<str.length(); i++) {
			if(c==str.charAt(i)) {
				return i+1;
			}
		}
		return -1;
	}
}
