package String3;

import java.io.IOException;

public class String3_equalIsNot {
	
	public static boolean equalIsNot(String str) {
		
		int isCount = 0;
		int notCount = 0;
		
		for (int i = 0; i < str.length() - 1; i++) {
			
			if (str.substring(i, i+2).contentEquals("is")) {
				
				isCount++;
				
			}
			
		}
		
		for (int i = 0; i < str.length() - 2; i++) {
			
			if (str.substring(i, i+3).contentEquals("not")) {
				
				notCount++;
				
			}
			
		}
		
		if (isCount == notCount) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "is is not notnotis";
	
		System.out.println(equalIsNot(str)); 

	}

}
