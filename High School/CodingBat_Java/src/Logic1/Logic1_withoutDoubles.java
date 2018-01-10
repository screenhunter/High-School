package Logic1;

import java.io.IOException;

public class Logic1_withoutDoubles {
	
	public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
		
		if (noDoubles == true) {
			
			if (die1 == die2) {
				
				if (die1 == 6) {
					
					die1 = 0;
					
				}
				
				die1++;
				
			}
			
		}
		
		return die1 + die2;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int die1 = 6;
		int die2 = 6;
		boolean noDoubles = true;
		
		System.out.println(withoutDoubles(die1, die2, noDoubles));
		
	}

}
