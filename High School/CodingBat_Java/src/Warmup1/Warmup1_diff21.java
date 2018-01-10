package Warmup1;
public class Warmup1_diff21 {
	
	public int diff21(int n) {
		
		int diff = 0;
		
		if (n>=21) {
			
			diff=2*(n-21);
			
		} else {
			
			diff = 21-n;
			
		}
		
		return diff;
		  
	}


}
