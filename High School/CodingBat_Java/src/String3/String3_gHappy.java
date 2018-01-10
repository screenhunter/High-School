package String3;

import java.io.IOException;

public class String3_gHappy {
	
	public static boolean gHappy(String str) {
		
		int count = 0;
		int gCount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == 'g') {
				
				gCount++;
				
				if (str.length() > 1) {
					
					if (i == 0) {
						
						if (str.charAt(i + 1) == 'g') {
							
							count++;
							
						}
						
					} else if (i == str.length() - 1) {
						
						if (str.charAt(i - 1) == 'g') {
							
							count++;
							
						}
						
					} else {

						if (str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g') {
							
							count++;
							
						}
						
					}
				
				}
				
			}
			
		}
		
		if (gCount == count) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "g";
	
		System.out.println(gHappy(str)); 

	}

}
