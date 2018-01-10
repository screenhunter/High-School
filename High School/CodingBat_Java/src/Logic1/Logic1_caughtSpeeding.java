package Logic1;

import java.io.IOException;

public class Logic1_caughtSpeeding {
	
	public static int caughtSpeeding(int speed, boolean isBirthday) {
		
		if (isBirthday == true) {
			
			speed = speed - 5;
			
		}
		
		if (speed > 80) {
			
			return 2;
			
		} else if (speed < 61) {
			
			return 0;
			
		} else {
			
			return 1;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int speed = 50;
		boolean isBirthday = false;
		
		System.out.println(caughtSpeeding(speed, isBirthday));
		
	}

}
