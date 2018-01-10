package Logic1;

import java.io.IOException;

public class Logic1_twoAsOne {
	
	public static boolean twoAsOne(int a, int b, int c) {
		
		if (a + b == c || (b + c == a || a + c == b)) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 12;
		int b = 13;
		int c = 25;
		
		System.out.println(twoAsOne(a, b, c));
		
	}

}
