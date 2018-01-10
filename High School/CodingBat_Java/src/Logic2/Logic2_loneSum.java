package Logic2;

import java.io.IOException;

public class Logic2_loneSum {
	
	public static int loneSum(int a, int b, int c) {
		
		if (a == b && b == c) {
			
			return 0;
			
		} else if (a == b) {
			
			return c;
			
		} else if (b == c) {
			
			return a;
			
		} else if (a == c) {
			
			return b;
			
		} else {
			
			return a + b + c;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 1;
		int b = 2;
		int c = 2;
		
		System.out.println(loneSum(a, b, c));
		
	}

}
