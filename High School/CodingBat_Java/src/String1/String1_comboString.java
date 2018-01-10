package String1;

import java.io.IOException;

public class String1_comboString {
	
	public static String comboString(String a, String b) {
		
		String answer = "";
		
		if (a.length() > b.length()) {
			
			answer = b + a + b;
			
		}
		
		if (b.length() > a.length()) {
			
			answer = a + b + a;
			
		}
		
		return answer;
				
	}
	
	public static void main (String[] args) throws IOException {
		
		String a = "Hello";
		String b = "Karina";
		
		System.out.println(comboString(a, b)); 

	}

}
