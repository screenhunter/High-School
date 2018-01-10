package String1;

import java.io.IOException;

public class String1_extraFront {
	
	public static String extraFront(String str) {
		
		if (str.length() > 2) {
			
			str = str.substring(0, 2);
			
		}
		
		return str + str + str;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "aheofpalo";
	
		System.out.println(extraFront(str)); 

	}

}
