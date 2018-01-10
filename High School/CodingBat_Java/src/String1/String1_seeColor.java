package String1;

import java.io.IOException;

public class String1_seeColor {
	
	public static String seeColor(String str) {
		
		if (str.indexOf("red") == 0) {
			
			return str.substring(0, 3);
			
		} else if (str.indexOf("blue") == 0) {
			
			return str.substring(0, 4);
			
		} else {
			
			return "";
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "helbluelo";
	
		System.out.println(seeColor(str)); 

	}

}
