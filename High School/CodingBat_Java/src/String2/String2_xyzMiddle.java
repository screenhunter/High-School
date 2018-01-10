package String2;

import java.io.IOException;

public class String2_xyzMiddle {
	
	public static boolean xyzMiddle(String str) {
		
		for (int i = 0; i < str.length(); i++) {
		
			if (i + 3 > str.length()) {
		
			} else {
		
				if (str.substring(i, i + 3).equals("xyz") && (i == str.length() - (i + 3) || i - 1 == str.length() - (i + 3) || i + 1 == str.length() - (i + 3))) {
		
					return true;
		
				}
		
			}
		
		}
		
		return false;
		
	}

	public static void main (String[] args) throws IOException {
		
		String str = "abxyzbask";
	
		System.out.println(xyzMiddle(str)); 

	}

}
