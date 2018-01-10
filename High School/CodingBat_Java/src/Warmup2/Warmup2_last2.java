package Warmup2;

import java.io.IOException;

public class Warmup2_last2 {
	
	public static int last2(String str) {
		
		int count = 0;
		
		if (str.length() > 3) {
			
			String last2 = str.substring(str.length()-2);
			String line = str.substring(0, str.length()-1);

			int pos = 0;
			while ((pos = line.indexOf(last2, pos)) != -1) {
				
				pos ++;
				count++;
				
			}
			
		}
		
		return count;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "aaaaaa";
		
		System.out.println(last2(str));

	}

}
