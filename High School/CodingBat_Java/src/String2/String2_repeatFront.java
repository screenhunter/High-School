package String2;

import java.io.IOException;

public class String2_repeatFront {
	
	public static String repeatFront(String str, int n) {
		
		String line = "";
		
		for (int i = n; i >= 0; i = i - 1) {
			
			line = line + str.substring(0, i);
			
		}
		
		return line;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "hello";
		int n = 4;
	
		System.out.println(repeatFront(str, n)); 

	}

}
