package String1;

import java.io.IOException;

public class String1_startWord {
	
	public static String startWord(String str, String word) {
		
		if (word.length() > str.length()) {
			
			return "";
			
		}
		
		if (word.substring(1).contentEquals(str.substring(1, word.length()))) {
			
			return str.substring(0, word.length());
			
		} else {
			
			return "";
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "hippo";
		String word = "i";
	
		System.out.println(startWord(str, word)); 

	}

}
