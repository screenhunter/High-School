package String1;

import java.io.IOException;

public class String1_firstHalf {
	
	public static String firstHalf(String str) {
		
		return str.substring(0, str.length()/2);
				
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "hohohohohohoho";
		
		System.out.println(firstHalf(str)); 

	}

}
