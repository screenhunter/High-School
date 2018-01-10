package Warmup1;
import java.io.IOException;

public class Warmup1_notString {
	
	public static String notString(String str) {
		
		if (str.startsWith("not")) {
			
		} else {
			
			str = "not " + str;
			
		}
		
		return str;
		
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "not bad";
		
		System.out.println(notString(str)); 

	}

}
