package Recursion1;

import java.io.IOException;

public class Recursion1_fibonacci {
	
	public static int fibonacci(int n) {
		
		if (n == 0) {
			
			return 0;
			
		} else if (n == 1) {
			
			return 1;
			
		} else {
			
			return fibonacci(n - 1) + fibonacci(n - 2);
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int n = 5;
		
		System.out.println(fibonacci(n));
		
	}

}
