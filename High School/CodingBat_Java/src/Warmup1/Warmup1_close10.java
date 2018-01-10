package Warmup1;

import java.io.IOException;

public class Warmup1_close10 {
	
	public static int close10(int a, int b) {
		
		int x = 0;
		
		if (Math.abs(a - 10) < Math.abs(b - 10)) {
			
			x = a;
			
		} else if (Math.abs(a - 10) > Math.abs(b - 10)) {
			
			x = b;
			
		}
		
		return x;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 103;
		int b = 103;
		
		System.out.println(close10(a, b)); 

	}

}
