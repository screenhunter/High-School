package Recursion1;

import java.io.IOException;

public class Recursion1_countAbc {
	
	public static int countAbc(String str) {
		
		if (str.length() < 3) {
			
			return 0;
			
		} else if (str.substring(0, 3).contentEquals("abc") || str.substring(0, 3).contentEquals("aba")) {
			
			return 1 + countAbc(str.substring(1));
			
		} else {
			
			return countAbc(str.substring(1));
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "abcaba";
		
		System.out.println(countAbc(str));

	}

}
