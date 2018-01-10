package Logic1;

import java.io.IOException;

public class Logic1_answerCell {
	
	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		
		if (isAsleep == true) {
			
			return false;
			
		} else {
			
			if (isMorning == true && isMom == true) {
				
				return true;
				
			}
			
			if (isMorning == false) {
				
				return true;
				
			}
		
		}
		
		return false;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		boolean isMorning = true;
		boolean isMom = false;
		boolean isAsleep = false;
		
		System.out.println(answerCell(isMorning, isMom, isAsleep));
		
	}

}
