package Logic1;

import java.io.IOException;

public class Logic1_alarmClock {
	
	public static String alarmClock(int day, boolean vacation) {
		
		if ((vacation == false && (day == 0 || (day ==7 || day == 6))) || (vacation == true && (day > 0 && day < 6))) {
			
			return "10:00";
			
		} else if (vacation == true) {
			
			return "off";
			
		} else {
			
			return "7:00";
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int day = 7;
		boolean vacation = true;
		
		System.out.println(alarmClock(day, vacation));
		
	}

}
