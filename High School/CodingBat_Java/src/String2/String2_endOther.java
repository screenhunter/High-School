package String2;

import java.io.IOException;

public class String2_endOther {
	
	public static boolean endOther(String a, String b) {
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		if (a.contentEquals(b)) {
			
			return true;
			
		}
		
		if (a.length() > b.length()) {
				
			if (a.substring(a.length() - b.length()).contentEquals(b)) {
					
				return true;
				
			}
			
		} else if (a.length() < b.length()) {
				
			if (b.substring(b.length() - a.length()).contentEquals(a)) {
					
				return true;
				
			}
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String a = "codehellocode";
		String b = "code";
	
		System.out.println(endOther(a, b)); 

	}

}
