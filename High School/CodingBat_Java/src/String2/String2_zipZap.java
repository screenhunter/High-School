package String2;

import java.io.IOException;

public class String2_zipZap {
	
	public static String zipZap(String str) {
		
		String result = "";
		
		for (int index = 0 ; index < str.length() ; ++index)
		
			if (index < str.length() - 2 && str.charAt(index) == 'z' && str.charAt(index+2) == 'p' ) {
				
				result += "zp";
				index += 2 ;
		
			} else {

			result += str.charAt(index);
			
		}
		
		return result;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "zipzopzap";
	
		System.out.println(zipZap(str)); 

	}
	
}
