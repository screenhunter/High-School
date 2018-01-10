package Logic1;

import java.io.IOException;

public class Logic1_love6 {
	
	public static boolean love6(int a, int b) {
		
		if ((a == 6 || b == 6) || (Math.abs(a-b) == 6 || Math.abs(a + b) == 6)) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 50;
		int b = -34;
		
		System.out.println(love6(a, b));
		
	}

}
