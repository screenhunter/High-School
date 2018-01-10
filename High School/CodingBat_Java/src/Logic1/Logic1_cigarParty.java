package Logic1;

import java.io.IOException;

public class Logic1_cigarParty {
	
	public static boolean cigarParty(int cigars, boolean isWeekend) {
		
		if (isWeekend == false && (cigars >= 40 && cigars <= 60)) {
			
			return true;
			
		}
		
		if (isWeekend == true && cigars >= 40) {
			
			return true;
			
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int cigars = 50;
		boolean isWeekend = false;
		
		System.out.println(cigarParty(cigars, isWeekend));
		
	}

}
