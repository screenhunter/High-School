package String1;

import java.io.IOException;

public class String1_endsLy {
	
	public static boolean endsLy(String str) {
		
		
		if (str.length() >= 2) {
			
			if (str.substring(str.length()-2, str.length()).contentEquals("ly")) {
				
				return true;
				
			}
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "hello";
	
		System.out.println(endsLy(str)); 

	}

}
