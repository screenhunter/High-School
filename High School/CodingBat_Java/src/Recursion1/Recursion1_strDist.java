package Recursion1;

import java.io.IOException;

public class Recursion1_strDist {
	
	public static int strDist(String str, String sub) {
		
		if (str.contains(sub) == false) {
			
			return 0;
			
		} else if (str.indexOf(sub) == str.lastIndexOf(sub)) {
			
			return sub.length();
			
		} else {
			
			return str.substring(str.indexOf(sub), str.lastIndexOf(sub) + sub.length()).length();
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "iiijjj";
		String sub = "ii";
		
		System.out.println(strDist(str, sub));

	}

}
