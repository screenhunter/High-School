package Warmup1;

import java.io.IOException;

public class Warmup1_backAround {
	
	public static String backAround(String str) {
		
		if (str.length() > 0) {
			
			str = str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
			
		}

		return str;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "a";
		
		System.out.println(backAround(str));

	}

}
