package Logic1;

import java.io.IOException;

public class Logic1_greenTicket {
	
	public static int greenTicket(int a, int b, int c) {
		
		if (a == b && b == c) {
			
			return 20;
			
		}
		
		if (a == b || (b == c || a == c)) {
			
			return 10;
			
		}
		
		return 0;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 1;
		int b = 2;
		int c = 2;
		
		System.out.println(greenTicket(a, b, c));
		
	}

}
