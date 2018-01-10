package Warmup1;

import java.io.IOException;

public class Warmup1_in3050 {
	
	public static boolean in3050(int a, int b) {
		
		boolean answer = false;
		
		if (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50))) {
			
			answer = true;
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 35;
		int b = 35;
		
		System.out.println(in3050(a, b)); 

	}

}
