package String1;

import java.io.IOException;

public class String1_makeAbba {
	
	public static String makeAbba(String a, String b) {
		
		return (a + b + b + a);
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String a = "X";
		String b = "Y";
		
		System.out.println(makeAbba(a, b)); 

	}

}
