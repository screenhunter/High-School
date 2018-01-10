package String1;

import java.io.IOException;

public class String1_without2 {
	
	public static String without2(String str) {
		
		if (str.length() >=2) {
			
			if (str.substring(0, 2).contentEquals(str.substring(str.length()-2, str.length()))) {
				
				str = str.substring(2);
				
			}
			
		}
		
		return str;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "KarinaKa";
	
		System.out.println(without2(str)); 

	}

}
