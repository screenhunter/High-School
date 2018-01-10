package Recursion1;

import java.io.IOException;

public class Recursion1_strCount {
	
	public static int strCount(String str, String sub) {
		
		if (str.contains(sub) == false) {
			
			return 0;
			
		} else {
			
			return 1 + strCount(str.replaceFirst(sub, ""), sub);
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String str = "hellohehe";
		String sub = "he";
		
		System.out.println(strCount(str, sub));

	}

}
