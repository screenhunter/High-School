package Recursion1;

import java.io.IOException;

public class Recursion1_factorial {
	
	public static int factorial(int n) {
		
		if (n == 0) {
			
			return 1;
			
		}
		  
		
		return n * factorial(n-1);
	}
	
	public static void main (String[] args) throws IOException {
		
		int n = 4;
		
		System.out.println(factorial(n));
		
	}

}
