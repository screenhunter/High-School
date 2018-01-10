package Recursion1;

import java.io.IOException;

public class Recursion1_count11 {
	
	public static int count11(String str) {
		
		if (str.length() < 2) {
			
			return 0;
			
		} else if (str.substring(0, 2).contentEquals("11")) {
			
			return 1 + count11(str.substring(2));
			
		} else {
			
			return count11(str.substring(1));
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "11a11b11c11";
		
		System.out.println(count11(str));

	}

}
