package String2;

import java.io.IOException;

public class String2_repeatSeperator {
	
	public static String repeatSeparator(String word, String sep, int count) {
		
		String line = "";
		
		for (int i = 0; i < count - 1; i ++) {
			
			line = line + word + sep;
			
		}
		
		if (count == 0) {
			
			return line;
			
		}
		
		return line + word;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String word = "hello";
		String sep = " ";
		int count = 4;
	
		System.out.println(repeatSeparator(word, sep, count)); 

	}

}
