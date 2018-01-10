package Recursion1;

import java.io.IOException;

public class Recursion1_strCopies {
	
	public static boolean strCopies(String str, String sub, int n) {
		
		if (n == 0) {
			
			return true;
			
		} else if (str.contains(sub) == false) {
			
			return false;
			
		} else {
			
			return strCopies(str.replaceFirst(sub, sub.substring(1)), sub, n - 1);
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "iiijjj";
		String sub = "i";
		int n = 4;
		
		System.out.println(strCopies(str, sub, n));

	}

}
