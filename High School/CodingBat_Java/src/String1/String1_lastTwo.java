package String1;

import java.io.IOException;

public class String1_lastTwo {
	
	public static String lastTwo(String str) {
		
		if (str.length() >= 2) {
			
			return (str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2));
			
		}
		
		return str;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "o";
	
		System.out.println(lastTwo(str)); 

	}

}
