package String3;

import java.io.IOException;

public class String3_mirrorEnds {
	
	public static String mirrorEnds(String string) {
		
		String end = "";
		
		for (int i = 0; i < string.length(); i++) {
			
			if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
				
				end += string.charAt(i);
				
			} else {
				
				break;
				
			}
			
		}
		
		return end;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String string = "abcba";
	
		System.out.println(mirrorEnds(string)); 

	}

}
