package Warmup1;

import java.io.IOException;

public class Warmup1_stringE {
	
	public static boolean stringE(String str) {
		
		boolean answer = false;
		
		int counter = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == 'e') {
				
				counter++;
				
			}
			
		}
		
		if (counter >= 1 && counter <= 3) {
			
			answer = true;
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "";
		
		System.out.println(stringE(str)); 

	}

}
