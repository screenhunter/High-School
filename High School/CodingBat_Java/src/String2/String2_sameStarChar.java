package String2;

import java.io.IOException;

public class String2_sameStarChar {
	
	public static boolean sameStarChar(String str) {
		
		for (int i = 0; i < str.length(); i++) {
		
			if (i != str.length() - 1 && Character.toString(str.charAt(i)).equals("*")) {
		
				if(i != 0 && Character.toString(str.charAt(i - 1)).equals(Character.toString(str.charAt(i + 1)))) {
		
				} else if (i == 0) {
		
				} else {
		
					return false;
		
				}
		
			}
		
		}
		
		return true;
	
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "b*a*b";
	
		System.out.println(sameStarChar(str)); 

	}

}
