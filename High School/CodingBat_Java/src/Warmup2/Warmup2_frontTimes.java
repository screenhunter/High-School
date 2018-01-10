package Warmup2;

import java.io.IOException;

public class Warmup2_frontTimes {
	
	public static String frontTimes(String str, int n) {
		
		String answer = "";
		
		if (str.length() > 3) {
			
			for (int i = 0; i < n; i++) {
				
				answer = answer + str.substring(0, 3);
				
			}
			
		} else {
			
			for (int i = 0; i < n; i++) {
				
				answer = answer + str;
				
			}
			
		}
		  
		return answer;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "";
		int n = 9;
		
		System.out.println(frontTimes(str, n)); 

	}
}
