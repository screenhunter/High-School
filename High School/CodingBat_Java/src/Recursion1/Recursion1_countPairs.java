package Recursion1;

import java.io.IOException;

public class Recursion1_countPairs {
	
	public static int countPairs(String str) {
		
		if (str.length() <= 2) {
			
			return 0;
			
		} else if (str.charAt(0) == str.charAt(2)) {
			
			return 1 + countPairs(str.substring(1));
			
		} else {
			
			return countPairs(str.substring(1));
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "axaxa";
		
		System.out.println(countPairs(str));

	}

}
