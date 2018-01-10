package String1;

import java.io.IOException;

public class String1_withouEnd2 {
	
	public static String withouEnd2(String str) {
		
		String answer = "";
		
		if (str.length() >= 3) {
			
			answer = str.substring(1, str.length()-1);
			
		}
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "Bombastic";
	
		System.out.println(withouEnd2(str)); 

	}

}
