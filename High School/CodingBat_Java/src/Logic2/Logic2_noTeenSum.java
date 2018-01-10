package Logic2;

import java.io.IOException;

public class Logic2_noTeenSum {
	
	public static int noTeenSum(int a, int b, int c) {
		
		
		return fixTeen(a) + fixTeen(b) + fixTeen(c);
		  
	}
	
	public static int fixTeen(int n) {
		
		if ((n >= 13 && n <= 14) || (n >= 17 && n <= 19)) {
			
			return 0;
			
		} else {
			
			return n;
			
		}
		
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 13;
		int b = 23;
		int c = 23;
		
		System.out.println(noTeenSum(a, b, c));
		
	}

}
