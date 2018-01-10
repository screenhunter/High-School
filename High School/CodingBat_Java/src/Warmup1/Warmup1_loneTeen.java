package Warmup1;

import java.io.IOException;

public class Warmup1_loneTeen {
	
	public static boolean loneTeen(int a, int b) {
		
		boolean answer = false;
		
		if (((a >= 13 && a <= 19) && (b < 13 || b > 19)) || ((a < 13 || a > 19) && (b >= 13 && b <= 19))) {
			
			answer = true;
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 13;
		int b = 88;
		
		System.out.println(loneTeen(a, b)); 

	}

}
