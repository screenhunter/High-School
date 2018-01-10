package Logic1;

import java.io.IOException;

public class Logic1_inOrderEqual {
	
	public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		
		if (a < b && b < c) {
			
			return true;
			
		} else if (equalOk == true && (a <= b && b <= c)) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 12;
		int b = 12;
		int c = 11;
		boolean equalOk = true;
		
		System.out.println(inOrderEqual(a, b, c, equalOk));
		
	}

}
