package String1;

import java.io.IOException;

public class String1_lastChars {
	
	public static String lastChars(String a, String b) {
		
		if (a.length() > 0) {
			
			a = a.substring(0, 1);
			
		} else {
			
			a = "@";
			
		}
		
		if (b.length() > 0) {
			
			b = b.substring(b.length()-1, b.length());
			
		} else {
			
			b = "@";
			
		}
		
		return a + b;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String a = "Hello";
		String b = "Karina";
	
		System.out.println(lastChars(a, b)); 

	}

}
