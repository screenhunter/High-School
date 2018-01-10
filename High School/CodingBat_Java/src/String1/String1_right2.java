package String1;

import java.io.IOException;

public class String1_right2 {
	
	public static String right2(String str) {
		
		String a = str.substring(0, str.length()-2);
		String b = str.substring(str.length()-2);
		
		str = b + a;
		
		return str;
				
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "Sonia";
		
		System.out.println(right2(str)); 

	}

}
