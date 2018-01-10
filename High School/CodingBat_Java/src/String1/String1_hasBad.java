package String1;

import java.io.IOException;

public class String1_hasBad {
	
	public static boolean hasBad(String str) {
		
		if (str.contains("bad")) {
			
			if (str.startsWith("bad") || str.indexOf("bad") == 1) {
				
				return true;
				
			}
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "helbadlo";
	
		System.out.println(hasBad(str)); 

	}

}
