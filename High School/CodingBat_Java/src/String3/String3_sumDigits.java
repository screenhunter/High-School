package String3;

import java.io.IOException;

public class String3_sumDigits {
	
	public static String sameEnds(String string) {
		  
		int count = 0;
		int len = string.length();
		String result = "";
		
		for (count = len/2; count > 0; count--) {
			
			if (string.substring(0,count).equals(string.substring(len - count, len))) {
		      
				result += string.substring(0, count);
		      
				break;
		    
			}
		  
		}
		     
		return result;
		
	}

	
	public static void main (String[] args) throws IOException {
		
		String string = "abcab";
	
		System.out.println(sameEnds(string)); 

	}

}
