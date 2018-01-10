package Logic1;

import java.io.IOException;

public class Logic1_shareDigit {
	
	public static boolean shareDigit(int a, int b) {
		
		if ((a % 10 == b % 10 || a / 10 == b / 10) || (a % 10 == b / 10 || a / 10 == b % 10)) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 92;
		int b = 21;
		
		System.out.println(shareDigit(a, b));
		
	}

}
