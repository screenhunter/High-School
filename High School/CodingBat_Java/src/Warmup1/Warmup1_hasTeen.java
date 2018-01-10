package Warmup1;

import java.io.IOException;

public class Warmup1_hasTeen {
	
	public static boolean hasTeen(int a, int b, int c) {
		
		boolean answer = false;
		
		if ((a >= 13 && a <= 19) || (b >= 13 && b<= 19) || (c >= 13 && c <= 19)) {
			
			answer = true;
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 1;
		int b = 103;
		int c = 19;
		
		System.out.println(hasTeen(a, b, c)); 

	}

}
