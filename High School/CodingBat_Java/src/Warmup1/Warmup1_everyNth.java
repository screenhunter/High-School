package Warmup1;

import java.io.IOException;

public class Warmup1_everyNth {
	
	public static String everyNth(String str, int n) {
		
		String answer = "";
		
		for (int i = 0; i < str.length(); i = i + n) {
			
			answer = answer + str.charAt(i);
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "asdfaofjp";
		int n = 4;
		
		System.out.println(everyNth(str, n)); 

	}

}
