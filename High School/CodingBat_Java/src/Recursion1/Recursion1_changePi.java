package Recursion1;

import java.io.IOException;

public class Recursion1_changePi {
	
	public static String changePi(String str) {
		
		if (str.length() == 0) {
			
			return "";
			
		} else if (str.length() >= 2 && str.substring(0, 2).contentEquals("pi")) {
			
			return "3.14" + changePi(str.substring(2));
			
		} else {
			
			return str.charAt(0) + changePi(str.substring(1));
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "piopi";
		
		System.out.println(changePi(str));

	}

}
