package Recursion1;

import java.io.IOException;

public class Recursion1_powerN {
	
	public static int powerN(int base, int n) {
		
		if (n == 0) {
			
			return 1;
			
		} else {
			
			return base * powerN(base, n - 1);
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int base = 2;
		int n = 5;
		
		System.out.println(powerN(base, n));
		
	}

}
