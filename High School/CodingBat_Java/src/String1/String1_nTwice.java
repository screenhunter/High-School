package String1;

import java.io.IOException;

public class String1_nTwice {
	
	public static String nTwice(String str, int n) {
		
		String answer = "";
		
		String a = str.substring(0, n);
		String b = str.substring(str.length()-n, str.length());
		answer = a+b;
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "hello";
		int n = 2;
	
		System.out.println(nTwice(str, n)); 

	}

}
