package Logic1;

import java.io.IOException;

public class Logic1_lastDigit {
	
	public static boolean lastDigit(int a, int b, int c) {
		
		if (a % 10 == b % 10 || (b % 10 == c % 10 || a % 10 == c % 10)) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 12;
		int b = 12;
		int c = 11;
		
		System.out.println(lastDigit(a, b, c));
		
	}

}
