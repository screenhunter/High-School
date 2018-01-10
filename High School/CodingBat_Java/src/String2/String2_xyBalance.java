package String2;

import java.io.IOException;

public class String2_xyBalance {
	
	public static boolean xyBalance(String str) {
		
		if (str.contains("x") && str.contains("y")) {
			
			if (str.lastIndexOf("x") < str.lastIndexOf("y")) {
				
				return true;
				
			}
			
			return false;
			
		} else if (str.contains("x")) {
			
			return false;
			
		}
		
		return true;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "dsafasdfbdbsga;rgjh;";
	
		System.out.println(xyBalance(str)); 

	}

}
