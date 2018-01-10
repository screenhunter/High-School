package String1;

import java.io.IOException;

public class String1_makeOutWord {
	
	public static String makeOutWord(String a, String b) {
		
		return (a.substring(0, 2) + b + a.substring(2));
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String a = "XXYY";
		String b = "ZZ";
		
		System.out.println(makeOutWord(a, b)); 

	}

}
