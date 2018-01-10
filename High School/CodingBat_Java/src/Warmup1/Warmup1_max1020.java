package Warmup1;

import java.io.IOException;

public class Warmup1_max1020 {
	
	public static int max1020(int a, int b) {
		
		int val = 0;
		
		if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)){
			
			if (a >= b) {
				
				val = a;
				
			}
			
			if (a < b) {
				
				val = b;
				
			}
			
		}
		
		if ((a >= 10 && a <= 20) && (b < 10 || b > 20)) {
			
			val = a;
			
		}
		
		if ((a < 10 || a > 20) && (b >= 10 && b <= 20)) {
			
			val = b;
			
		}
		
		return val;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 19;
		int b = 10;
		
		System.out.println(max1020(a, b)); 

	}

}
