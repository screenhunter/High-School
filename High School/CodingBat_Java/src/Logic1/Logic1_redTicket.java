package Logic1;

import java.io.IOException;

public class Logic1_redTicket {
	
	public static int redTicket(int a, int b, int c) {
		
		if (a == b && b == c) {
			
			if (a == 2) {
				
				return 10;
				
			}
			
			return 5;
			
		}
		
		if (a != c && a != b) {
			
			return 1;
			
		}
		
		return 0;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 2;
		int b = 2;
		int c = 2;
		
		System.out.println(redTicket(a, b, c));
		
	}

}
