package String2;

import java.io.IOException;

public class String2_prefixAgain {
	
	public static boolean prefixAgain(String str, int n) {
		
		if (str.substring(n).contains(str.substring(0, n))) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "vsdvgsrfa";
		int n = 0;
	
		System.out.println(prefixAgain(str, n)); 

	}

}
