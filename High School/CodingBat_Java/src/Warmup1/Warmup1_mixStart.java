package Warmup1;

import java.io.IOException;

public class Warmup1_mixStart {
	
	public static boolean mixStart(String str) {
		
		boolean answer = false;
		
		StringBuffer newStr = new StringBuffer(str);
		
		if (str.length() > 0) {
			
			newStr = newStr.deleteCharAt(0);
			
			String line = newStr.toString();
			
			if (line.startsWith("ix") == true) {
				
				answer = true;
				
			}
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "";
		
		System.out.println(mixStart(str)); 

	}

}
