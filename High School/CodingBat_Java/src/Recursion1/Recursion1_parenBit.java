package Recursion1;

import java.io.IOException;

public class Recursion1_parenBit {
	
	public static String parenBit(String str) {
		
		if (str.length() == 0) {
			
			return "";
			
		} else if (str.charAt(0) == '(') {
			
			return str.substring(0, str.indexOf(")") + 1);
			
		} else {
			
			return parenBit(str.substring(1));
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "hihi(hello)hi";
		
		System.out.println(parenBit(str));

	}

}
