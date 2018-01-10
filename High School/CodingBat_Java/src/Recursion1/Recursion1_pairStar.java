package Recursion1;

import java.io.IOException;

public class Recursion1_pairStar {
	
	public static String pairStar(String str) {
		
		if (str.length() <= 1) {
			
			return str;
			
		} else if (str.charAt(0) == str.charAt(1)) {
			
			return str.charAt(0) + "*" + pairStar(str.substring(1));
			
		} else {
			
			return  str.charAt(0) + pairStar(str.substring(1));
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "hheelloo";
		
		System.out.println(pairStar(str));

	}

}
