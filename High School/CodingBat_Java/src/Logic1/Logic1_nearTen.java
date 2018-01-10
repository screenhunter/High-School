package Logic1;

import java.io.IOException;

public class Logic1_nearTen {
	
	public static boolean nearTen(int num) {
		
		if (num % 10 <= 2 || num % 10 >= 8) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int num = 19;
		
		System.out.println(nearTen(num));
		
	}

}
