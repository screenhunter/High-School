package Warmup2;

import java.io.IOException;

public class Warmup2_stringX {
	
	public static String stringX(String str) {
		
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
				
				result = result + str.substring(i, i+1);
				
			}
			
		}
		
		return result;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "lalala";
		
		System.out.println(stringX(str)); 

	}

}
