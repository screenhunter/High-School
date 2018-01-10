package Warmup2;

import java.io.IOException;

public class Warmup2_StringTimes {
	
	public static String stringTimes(String str, int n) {
		
		String answer = "";
		
		for (int i = 0; i < n; i++) {
			
			answer = answer + str;
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "";
		int n = 9;
		
		System.out.println(stringTimes(str, n)); 

	}

}
