package Warmup1;

import java.io.IOException;

public class Warmup1_startHi {
	
	public static boolean startHi(String str) {
		
		boolean answer = false;
		
		if (str.length() >= 2) {
			
			StringBuffer hi = new StringBuffer("hi");
			
			if (str.substring(0, 2).contentEquals(hi) == true) {
				
				answer = true;
				
			}
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "";
		
		System.out.println(startHi(str));

	}

}
