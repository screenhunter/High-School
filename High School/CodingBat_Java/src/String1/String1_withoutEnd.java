package String1;

import java.io.IOException;

public class String1_withoutEnd {
	
	public static String withoutEnd(String str) {
		
		str = str.substring(1, str.length()-1);
		
		return str;
				
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "hello";
		
		System.out.println(withoutEnd(str)); 

	}

}
