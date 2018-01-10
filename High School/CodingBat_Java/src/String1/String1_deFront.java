package String1;

import java.io.IOException;

public class String1_deFront {
	
	public static String deFront(String str) {
		
		if (str.length() >= 2) {
			
			if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
				
				return str;
				
			} else if (str.charAt(0) == 'a' && str.charAt(1) != 'b') {
				
				return str.replaceFirst(str.charAt(1)+ "", "");
				
			} else if (str.charAt(0) != 'a' && str.charAt(1) == 'b') {
				
				return str.substring(1);
				
			} else {
				
				return str.substring(2);
				
			}
			
		} else if (str.length() == 1) {
			
			if (str.contentEquals("a")) {
				
				return "";
				
			} else {
				
				return str;
				
			}
			
		} else {
			
			return str;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "cd";
	
		System.out.println(deFront(str)); 

	}

}
