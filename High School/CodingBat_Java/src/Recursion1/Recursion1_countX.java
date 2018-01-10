package Recursion1;

import java.io.IOException;

public class Recursion1_countX {

	public static int countX(String str) {
		
		if (str.length() == 0) {
			
			return 0;
			
		} else if (str.charAt(0) == 'x') {
			
			if (str.length() > 1) {
				
				return 1 + countX(str.substring(1));
				
			} else {
				
				return 1;
				
			}
			
		} else {
			
			return countX(str.substring(1));
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "hello";
		
		System.out.println(countX(str));

	}

}
