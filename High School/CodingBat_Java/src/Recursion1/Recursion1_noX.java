package Recursion1;

import java.io.IOException;

public class Recursion1_noX {
	
	public static String noX(String str) {
		
		if (str.contains("x")) {
			
			StringBuffer temp = new StringBuffer(str);
			
			temp.replace(str.indexOf("x"), str.indexOf("x") + 1, "");
			
			return noX(temp.toString());
			
		} else {
			
			return str;
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "x0xpx0xp";
		
		System.out.println(noX(str));

	}

}
