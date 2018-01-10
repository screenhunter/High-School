package String2;

import java.io.IOException;

public class String2_countCode {
	
	public static int countCode(String str) {
		
		int count = 0;
		
		for (int i = 0; i < str.length()-3; i++) {
			
			if (str.substring(i, i+2).contentEquals("co") && str.substring(i+3, i+4).contentEquals("e")) {
				
				count++;
				
			}
			
		}
		
		return count;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "codehellocode";
	
		System.out.println(countCode(str)); 

	}

}
