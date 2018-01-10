package Recursion1;

import java.io.IOException;

public class Recursion1_stringClean {
	
	public static String stringClean(String str) {
		
		if (str.length() <= 1) {
			
			return str;
			
		} else if (str.charAt(0) == str.charAt(1)) {
			
			return stringClean(str.substring(1));
			
		} else {
			
			return str.charAt(0) + stringClean(str.substring((1)));
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "aabbcc";
		
		System.out.println(stringClean(str));

	}

}
