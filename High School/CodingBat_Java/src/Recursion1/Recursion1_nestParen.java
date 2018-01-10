package Recursion1;

import java.io.IOException;

public class Recursion1_nestParen {
	
	public static boolean nestParen(String str) {
		
		if (str.length() == 0) {
			
			return true;
			
		} else if (str.length() == 1) {
			
			return false;
			
		} else if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
			
			return nestParen(str.substring(1, str.length() - 1));
			
		} else {
			
			return false;
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "(())";
		
		System.out.println(nestParen(str));

	}

}
