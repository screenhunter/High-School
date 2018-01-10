package Logic1;

import java.io.IOException;

public class Logic1_inOrder {
	
	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		
		if (bOk == false && (a < b && b <c)) {
			
			return true;
			
		}
		
		if (bOk == true && b < c) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 7;
		int b = 5;
		int c = 6;
		boolean bOk = true;
		
		System.out.println(inOrder(a, b, c, bOk));
		
	}

}
