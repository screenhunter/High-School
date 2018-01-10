package String2;

import java.io.IOException;

public class String2_plusOut {
	
	public static String plusOut(String str, String word) {
	
		String result = "";
	
		for (int i = 0; i < str.length(); i++) {
	
			if (i + word.length() > str.length()) {
	
				break;
	
			}
	 
	
			if (str.substring(i, i + word.length()).equals(word))
	
			{
	
				result += word;
				i += (word.length() - 1);
	
			} else {
	
				result += "+" ;
	
			}
	
		}
	
		if (result.length() != str.length()) {
	
			while (result.length() != str.length()) {
	
				result += "+";
	
			}
	
		}
	
		return result;
	
	}

	
	public static void main (String[] args) throws IOException {
		
		String str = "xhelloxhello";
		String word = "x";
	
		System.out.println(plusOut(str, word)); 

	}

}
