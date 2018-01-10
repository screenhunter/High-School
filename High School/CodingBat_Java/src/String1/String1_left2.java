package String1;

import java.io.IOException;

public class String1_left2 {
	
	public static String left2(String str) {
		
		String a = str.substring(0, 2);
		String b = str.substring(2);
		
		str = b + a;
		
		return str;
				
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "Sonia";
		
		System.out.println(left2(str)); 

	}

}
