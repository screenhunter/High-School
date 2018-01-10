package Recursion1;

import java.io.IOException;

public class Recursion1_sumDigits {
	
	public static int sumDigits(int n) {
		
		if (n == 0) {
			
			return 0;
			
		} else {
			
			return n % 10 + sumDigits(n/10);
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int n = 99;
		
		System.out.println(sumDigits(n));
		
	}

}
