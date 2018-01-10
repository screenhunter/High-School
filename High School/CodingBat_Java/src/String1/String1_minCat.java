package String1;

import java.io.IOException;

public class String1_minCat {
	
	public static String minCat(String a, String b) {
		
		while (a.length() > b.length()) {
			
			a = a.replaceFirst(a.charAt(0) + "", "");
			
		}
		
		while (b.length() > a.length()) {
			
			b = b.replaceFirst(b.charAt(0) + "", "");
			
		}
		
		return a + b;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String a = "aheofpalo";
		String b = "fagfhi";
	
		System.out.println(minCat(a, b)); 

	}

}
