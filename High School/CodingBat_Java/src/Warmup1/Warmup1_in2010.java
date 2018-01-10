package Warmup1;

import java.io.IOException;

public class Warmup1_in2010 {
	
	public static boolean in1020(int a, int b) {
		
		boolean answer = false;
		
		if ((a <= 20 && a >= 10) || (b <= 20 && b >= 10)) {
			
			answer = true;
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 10;
		int b = 20;
		
		System.out.println(in1020(a, b)); 

	}

}
