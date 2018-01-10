package Warmup1;

import java.io.IOException;

public class Warmup1_lastDigit {
	
	public static boolean lastDigit(int a, int b) {
		
		boolean answer = false;
		
		if ((a % 10) == (b % 10)) {
			
			answer = true;
			
		}
		
		return answer;
		  
	}

	public static void main (String[] args) throws IOException {
		
		int a = 19;
		int b = 9;
		
		System.out.println(lastDigit(a, b)); 

	}

}
