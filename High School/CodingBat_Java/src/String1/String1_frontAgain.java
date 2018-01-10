package String1;

import java.io.IOException;

public class String1_frontAgain {
	
	public static boolean frontAgain(String str) {
		
		if (str.length() >= 2 && str.substring(0, 2).contentEquals(str.substring(str.length()-2, str.length()))) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "e";
	
		System.out.println(frontAgain(str)); 

	}

}
