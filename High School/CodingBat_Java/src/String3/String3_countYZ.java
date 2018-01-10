package String3;

import java.io.IOException;

public class String3_countYZ {
	
	public static int countYZ(String str) {
		
		str = str.toLowerCase();
		
		int count = 0;
		
		for (int i = 0; i < str.length() - 1; i++) {
			
			if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') && Character.isLetter(str.charAt(i + 1)) == false) {
				
				count++;
				
			}
			
		}
		
		if (str.charAt(str.length()- 1) == 'y' || str.charAt(str.length()- 1) == 'z') {
			
			count++;
			
		}
		
		return count;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "y bz";
	
		System.out.println(countYZ(str)); 

	}

}
