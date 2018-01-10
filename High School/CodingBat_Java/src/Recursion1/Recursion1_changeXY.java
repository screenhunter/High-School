package Recursion1;

import java.io.IOException;

public class Recursion1_changeXY {
	
	public static String changeXY(String str) {
		
		if (str.length() == 0) {
			
			return "";
			
		} else if (str.charAt(0) == 'x') {
			
			return "y" + changeXY(str.substring(1));
			
		} else {
			
			return str.charAt(0) + changeXY(str.substring(1));
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "o";
		
		System.out.println(changeXY(str));

	}

}
