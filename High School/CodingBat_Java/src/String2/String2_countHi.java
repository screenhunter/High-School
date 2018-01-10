package String2;

import java.io.IOException;

public class String2_countHi {
	
	public static int countHi(String str) {
		
		int count = 0;
		
		for (int i = 0; i < str.length()-1; i++) {
			
			if (str.substring(i, i+2).contentEquals("hi")) {
				
				count++;
				
			}
			
		}
		
		return count;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "hihellohi";
	
		System.out.println(countHi(str)); 

	}

}
