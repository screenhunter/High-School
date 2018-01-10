package String2;

import java.io.IOException;

public class String2_bobThere {
	
	public static boolean bobThere(String str) {
		
		for (int i = 0; i < str.length()-2; i++) {
			
			if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b'){
				
				return true;
				
			}
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "dsafasdfbdbsga;rgjh;";
	
		System.out.println(bobThere(str)); 

	}

}
