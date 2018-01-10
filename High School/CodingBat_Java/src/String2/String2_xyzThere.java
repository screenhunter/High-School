package String2;

import java.io.IOException;

public class String2_xyzThere {
	
	public static boolean xyzThere(String str) {
		
		int pos = 0;
		
		while ((pos = str.indexOf("xyz")) >= 0) {
		
			if (pos == 0){
				
				return true;
				
			}
		
			if (str.charAt(pos-1) != '.') {
				
				return true;
				
			}
			
		str = str.substring(pos+1);
		
		}

		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "codxyz.xyzehelxyzlocode";
	
		System.out.println(xyzThere(str)); 

	}

}
