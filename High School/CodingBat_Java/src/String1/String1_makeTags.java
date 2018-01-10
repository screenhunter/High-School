package String1;

import java.io.IOException;

public class String1_makeTags {
	
	public static String makeTags(String a, String b) {
		
		return ("<" + a + ">" + b + "</" + a + ">");
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String a = "X";
		String b = "Y";
		
		System.out.println(makeTags(a, b)); 

	}

}
