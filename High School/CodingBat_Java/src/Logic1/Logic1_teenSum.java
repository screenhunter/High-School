package Logic1;

import java.io.IOException;

public class Logic1_teenSum {
	
	public static int teenSum(int a, int b) {
		
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
			
			return 19;
			
		}
		
		return a+b;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 50;
		int b = -34;
		
		System.out.println(teenSum(a, b));
		
	}

}
