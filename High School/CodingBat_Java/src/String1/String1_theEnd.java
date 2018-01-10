package String1;

import java.io.IOException;

public class String1_theEnd {
	
	public static String theEnd(String str, boolean front) {
		
		if (front == true) {
			
			return str.substring(0, 1);
			
		}
		
		return str.substring(str.length()-1, str.length());
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "Hello";
		boolean front = false;
	
		System.out.println(theEnd(str, front)); 

	}

}
