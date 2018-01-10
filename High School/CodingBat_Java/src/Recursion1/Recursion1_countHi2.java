package Recursion1;

import java.io.IOException;

public class Recursion1_countHi2 {
	
	public static int countHi2(String str) {
		
		if (str.length() <= 2) {
			
			if (str.contentEquals("hi")) {
				
				return 1;
				
			}
			
			return 0;
			
		} else if (str.charAt(0) == 'x' && str.charAt(1) != 'x') {
			
			return countHi2(str.substring(2));
			
		} else if (str.substring(0, 2).contentEquals("hi")) {
			
			return 1 + countHi2(str.substring(2));
			
		} else {
			
			return countHi2(str.substring(1));
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "hihihi";
		
		System.out.println(countHi2(str));

	}

}
