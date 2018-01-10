package Recursion1;

import java.io.IOException;

public class Recursion1_endX {
	
	public static String endX(String str) {
		
		if (str.length() == 0) {
			
			return "";
			
		} else if (str.charAt(0) == 'x') {
			
			if (str.length() > 1) {
				
				return endX(str.substring(1)) + "x";
				
			} else {
				
				return "x";
				
			}
			
		} else {
			
			return str.charAt(0) + endX(str.substring(1));
			
		}

	}
	
	public static void main(String[] args) throws IOException {

		String str = "hexlo";
		
		System.out.println(endX(str));

	}

}
