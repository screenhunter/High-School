package Warmup1;

import java.io.IOException;

public class Warmup1_intMax {
	
	public static int intMax(int a, int b, int c) {
		
		int[] x = new int[3];
		x[0] = a;
		x[1] = b;
		x[2] = c;
		
		int max = -909090;
		
		for (int i = 0; i < 3; i++) {
			
			if (x[i] > max) {
				
				max = x[i];
				
			}
			
		}
		
		return max;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 13454345;
		int b = 982984;
		int c = 138104;
		
		System.out.println(intMax(a, b, c)); 

	}

}
