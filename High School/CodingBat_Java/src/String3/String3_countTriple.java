package String3;

import java.io.IOException;

public class String3_countTriple {
	
	public static int countTriple(String str) {
		
		int count = 0;
		
		if (str.length() >= 3) {
			
			for (int i = 1; i < str.length() - 1; i++) {
				
				if (str.charAt(i - 1) == str.charAt(i) && str.charAt(i) == str.charAt(i + 1)) {
					
					count++;
					
				}
				
			}
			
		}
		
		return count;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "";
	
		System.out.println(countTriple(str)); 

	}

}
