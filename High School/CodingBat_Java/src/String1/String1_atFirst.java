package String1;

import java.io.IOException;

public class String1_atFirst {
	
	public static String atFirst(String str) {
		
		if (str.length() >= 2) {
			
			return str.substring(0, 2);
			
		} else  {
			
			while (str.length() < 2) {
				
				str = str + "@";
				
			}
			
		}
		
		return str;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "";
	
		System.out.println(atFirst(str)); 

	}

}
