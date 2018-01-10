package Recursion1;

import java.io.IOException;

public class Recursion1_count7 {
	
	public static int count7(int n) {
		
		if (n == 0) {
			
			return 0;
			
		} else if (n % 10 == 7) {
			
			return 1 + count7 (n / 10);
			
		} else {
			
			return count7(n / 10);
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int n = 77777;
		
		System.out.println(count7(n));
		
	}

}
