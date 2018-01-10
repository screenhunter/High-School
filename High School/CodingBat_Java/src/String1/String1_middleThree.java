package String1;

import java.io.IOException;

public class String1_middleThree {
	
	public static String middleThree(String str) {
		
		str = str.substring((str.length()/2)-1, (str.length()/2)+2);
		
		return str;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "hello";
	
		System.out.println(middleThree(str)); 

	}

}
