package String2;

import java.io.IOException;

public class String2_starOut {
	
	public static String starOut(String str) {
		
		String result = ""; 
		
		for (int i = 0; i < str.length(); i++) {
		
			if ((str.substring(i, i + 1)).equals("*")) {
		
			} else if (i != 0 && Character.toString(str.charAt(i - 1)).equals("*")) {
		
			} else if (i != str.length() - 1 && Character.toString(str.charAt(i + 1)).equals("*")) {
		
			} else {
		
				result += str.charAt(i);
		
			}
		
		}
		
		return result;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "x*****o";
	
		System.out.println(starOut(str)); 

	}

}
