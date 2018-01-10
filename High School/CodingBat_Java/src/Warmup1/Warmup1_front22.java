package Warmup1;

import java.io.IOException;

public class Warmup1_front22 {
	
	public static String front22(String str) {
		
		if (str.length() > 2) {
			
			str = str.substring(0, 2) + str + str.substring(0, 2);
			
		} else if (str.length() == 1) {
			
			str = str.charAt(0) + str + str.charAt(0);
			
		} else {
			
			str = str + str + str;
			
		}
		
		return str;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "ax";
		
		System.out.println(front22(str));

	}

}
