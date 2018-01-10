package String1;

import java.io.IOException;

public class String1_withoutX {
	
	public static String withoutX(String str) {
		
		if (str.length() > 0) {
			
			if (str.charAt(0) == 'x') {
				
				str = str.substring(1);
				
			}
			
		}
		
		if (str.length() >= 1) {
			
			if (str.charAt(str.length()-1) == 'x') {
				
				str = str.substring(0, str.length()-1);
				
			}
			
		}
		
		return str;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "xhxix";
	
		System.out.println(withoutX(str)); 

	}

}
