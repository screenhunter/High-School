package Logic2;

import java.io.IOException;

public class Logic2_closeFar {
	
	public static boolean closeFar(int a, int b, int c) {
		
		if ((Math.abs(a - b) <= 1 && (Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) || (Math.abs(a - c) <= 1 && (Math.abs(a - b) >= 2 && Math.abs(c - b) >= 2)))) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 13;
		int b = 23;
		int c = 23;
		
		System.out.println(closeFar(a, b, c));
		
	}

}
