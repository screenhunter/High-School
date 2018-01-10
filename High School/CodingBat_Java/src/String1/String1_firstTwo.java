package String1;

import java.io.IOException;

public class String1_firstTwo {
	
	public static String firstTwo(String str) {
		
		if (str.length() > 2) {
			
			str = str.substring(0, 2);
			
		}
		
		return str;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "hello";
		
		System.out.println(firstTwo(str)); 

	}

}
