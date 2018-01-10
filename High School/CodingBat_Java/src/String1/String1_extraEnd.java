package String1;

import java.io.IOException;

public class String1_extraEnd {
	
	public static String extraEnd(String str) {
		
		return (str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2));
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "hello";
		
		System.out.println(extraEnd(str)); 

	}

}
