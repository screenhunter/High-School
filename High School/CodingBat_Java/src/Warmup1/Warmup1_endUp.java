package Warmup1;

import java.io.IOException;

public class Warmup1_endUp {
	
	public static String endUp(String str) {
		
		if (str.length() >= 3) {
			
			String end = str.substring(str.length()-3);
			String newEnd = end.toUpperCase();
			
			str = str.replace(end, newEnd);
			
		} else if (str.length() >= 0 && str.length() < 3) {
			
			str = str.toUpperCase();
			
		}
		
		return str;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "";
		
		System.out.println(endUp(str)); 

	}

}
