package Recursion1;

import java.io.IOException;

public class Recursion1_allStar {
	
	public static String allStar(String str) {
		
		if (str.length() <= 1) {
			
			return str;
			
		} else {
			
			return str.charAt(0) + "*" + allStar(str.substring(1));
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "hello";
		
		System.out.println(allStar(str));

	}

}
