package Logic1;

import java.io.IOException;

public class Logic1_in1To10 {
	
	public static boolean in1To10(int n, boolean outsideMode) {
		
		if (outsideMode == true && (n <= 1 || n >= 10)) {
			
			return true;
			
		} else if (outsideMode == false && (n >= 1 && n <= 10)) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int n = 7;
		boolean outsideMode = true;
		
		System.out.println(in1To10(n, outsideMode));
		
	}

}
