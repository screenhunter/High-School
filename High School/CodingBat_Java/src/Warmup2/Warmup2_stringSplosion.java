package Warmup2;

import java.io.IOException;

public class Warmup2_stringSplosion {
	
	public static String stringSplosion(String str) {
		
		String answer = "";
		
		for (int i = 0; i < str.length(); i ++) {
			
			answer = answer + str.substring(0, i+1);
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "ABCD";
		
		System.out.println(stringSplosion(str)); 

	}

}
