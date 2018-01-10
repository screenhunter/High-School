package Recursion1;

import java.io.IOException;

public class Recursion1_countHi {
	
	public static int countHi(String str) {
		
		if (str.length() <= 1) {
			
			return 0;
			
		} else if (str.substring(0, 2).contentEquals("hi")) {
			
			return 1 + countHi (str.substring(2));
			
		} else {
			
			return countHi(str.substring(1));
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "helhilo";
		
		System.out.println(countHi(str));

	}

}
