package Logic1;

import java.io.IOException;

public class Logic1_blueTicket {
	
	public static int blueTicket(int a, int b, int c) {
		
		if (a + b == 10 || (b + c == 10 || a + c == 10)) {
			
			return 10;
			
		}
		
		if (a + b == b + c + 10 || a + b == a + c + 10) {
			
			return 5;
			
		}
		
		return 0;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 1;
		int b = 2;
		int c = 2;
		
		System.out.println(blueTicket(a, b, c));
		
	}

}
