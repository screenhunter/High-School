package String1;

import java.io.IOException;

public class String1_withoutX2 {
	
	public static String withoutX2(String str) {
		
		if (str.length() > 1) {
			
			if (str.charAt(0) == 'x'  || str.charAt(1) == 'x') {
				
				str = str.replaceFirst("x", "");
				
			}
			
			if (str.charAt(0) == 'x') {
				
				str = str.replaceFirst("x", "");
				
			}
			
		} else if (str.length() == 1) {
			
			if (str.contentEquals("x")) {
				
				str = "";
				
			}
			
		}
		
		return str;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "hxxhi";
	
		System.out.println(withoutX2(str)); 

	}

}
