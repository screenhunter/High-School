package Warmup1;

import java.io.IOException;

public class Warmup1_startOz {
	
	public static String startOz(String str) {
		
		String chars = "";
		
		if (str.length() >= 2) {
			
			if (str.charAt(0) == 'o') {
				
				chars = chars + "o";
				
			}

			if (str.charAt(1) == 'z') {
				
				chars = chars + "z";
				
			}
			
		} else if (str.length() == 1) {
			
			if (str.charAt(0) == 'o') {
				
				chars = chars + "o";
				
			}
			
		}
		
		return chars;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "";
		
		System.out.println(startOz(str)); 

	}

}
