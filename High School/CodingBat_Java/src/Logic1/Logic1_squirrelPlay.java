package Logic1;

import java.io.IOException;

public class Logic1_squirrelPlay {
	
	public static boolean squirrelPlay(int temp, boolean isSummer) {
		
		if (temp >= 60) {
			
			if (isSummer == false && temp <= 90) {
				
				return true;
				
			} else if (isSummer == true && temp <= 100) {
				
				return true;
				
			}
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int temp = 50;
		boolean isSummer = false;
		
		System.out.println(squirrelPlay(temp, isSummer));
		
	}

}
