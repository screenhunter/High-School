package String1;

import java.io.IOException;

public class String1_conCat {
	
	public static String conCat(String a, String b) {
		
		if (a.length() > 0 && b.length() > 0) {
			
			if (a.charAt(a.length()-1) == b.charAt(0)) {
				
				b = b.substring(1);
				
			}
			
		}
		
		return a + b;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String a = "Hello";
		String b = "Karina";
	
		System.out.println(conCat(a, b)); 

	}

}
