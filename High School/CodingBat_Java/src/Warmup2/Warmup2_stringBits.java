package Warmup2;

import java.io.IOException;

public class Warmup2_stringBits {
	
	public static String stringBits(String str) {
		
		String answer = "";
		
		if (str.length() > 0) {
			
			for (int i = 0; i < str.length(); i = i + 2) {
				
				answer = answer + str.charAt(i);
				
			}
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "";
		
		System.out.println(stringBits(str)); 

	}

}
