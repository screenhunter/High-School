package String1;

import java.io.IOException;

public class String1_middleTwo {
	
	public static String middleTwo(String str) {
		
		return str.substring((str.length()/2) - 1, (str.length()/2) + 1);
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "1234";
	
		System.out.println(middleTwo(str)); 

	}

}
