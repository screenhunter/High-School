package AP1;

import java.io.IOException;

public class AP1_hasOne {
	
	public static boolean hasOne(int n) {
		
		String nString = "" + n;
		
		if (nString.contains("1")) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main(String[] args) throws IOException {

		int n = 242352123;
		System.out.println(hasOne(n));

	}

}
