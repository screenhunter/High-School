package String2;

import java.io.IOException;

public class String2_wordEnds {
	
	public static String wordEnds(String str, String word) {
		
		String result = "";
		
		for (int i = 0; i < str.length(); i++) { 
		
			if (word.length() == str.length()) {
		
				return "";
		
			} else if (i + word.length() == str.length() && str.substring(i, i + word.length()).equals(word)) {
		
				result += Character.toString(str.charAt(str.length() - word.length() - 1));
		
				return result;
		
			} else if (i + word.length() < str.length() && str.substring(i, i + word.length()).equals(word)) {
		
				if (i == 0) {
		
				} else {
		
					result += Character.toString(str.charAt(i - 1));
		
				}
		
				result += Character.toString(str.charAt(i + word.length()));
		
			}
		
		}
		
		return result;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "xhelloxhello";
		String word = "x";
	
		System.out.println(wordEnds(str, word)); 

	}

}
