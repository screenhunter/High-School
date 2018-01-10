package String2;

import java.io.IOException;

public class String2_repeatEnd {
	
	public static String repeatEnd(String str, int n) {
		
		String newLine = "";
		
		for (int i = 0; i < n; i++) {
			
			newLine = newLine + str.substring(str.length()-n);
			
		}
		
		return newLine;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "hello";
		int n = 4;
	
		System.out.println(repeatEnd(str, n)); 

	}

}
