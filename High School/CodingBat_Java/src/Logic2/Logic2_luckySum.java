package Logic2;

import java.io.IOException;

public class Logic2_luckySum {
	
	public static int luckySum(int a, int b, int c) {
		
		if (a == 13) {
			
			return 0;
			
		} else if (b == 13) {
			
			return a;
			
		} else if (c == 13) {
			
			return a + b;
			
		} else {
			
			return a + b + c;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 13;
		int b = 23;
		int c = 23;
		
		System.out.println(luckySum(a, b, c));
		
	}

}
