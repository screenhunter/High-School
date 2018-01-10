package String2;

import java.io.IOException;

public class String2_catDog {
	
	public static boolean catDog(String str) {
		
		int catCount = 0;
		int dogCount = 0;
		
		for (int i = 0; i < str.length()-2; i++) {
			
			if (str.substring(i, i+3).contentEquals("cat")) {
				
				catCount++;
				
			}
			
			if (str.substring(i, i+3).contentEquals("dog")) {
				
				dogCount++;
				
			}
			
		}
		
		if (catCount == dogCount) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "cat is not a dog but it is a catdog";
	
		System.out.println(catDog(str)); 

	}

}
