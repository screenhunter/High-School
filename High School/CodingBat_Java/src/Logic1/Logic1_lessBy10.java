package Logic1;

import java.io.IOException;

public class Logic1_lessBy10 {
	
	public static boolean lessBy10(int a, int b, int c) {
		
		if ((a + 10 <= b || a - 10 >= b) || ((b + 10 <= c || b - 10 >= c) || (c + 10 <= a || c - 10 >= a))) {
			
			return true;
			
		}
		
		return false;
	
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 12;
		int b = 12;
		int c = 11;
		
		System.out.println(lessBy10(a, b, c));
		
	}

}
