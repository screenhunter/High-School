package String2;

import java.io.IOException;

public class String2_doubleChar {
	
	public static String doubleChar(String str) {
		
		String line = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			line = line + str.charAt(i) + str.charAt(i);
			
		}
		
		return line;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "hello";
	
		System.out.println(doubleChar(str)); 

	}

}
