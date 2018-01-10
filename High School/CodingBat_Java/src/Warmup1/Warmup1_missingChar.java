package Warmup1;
import java.io.IOException;

public class Warmup1_missingChar {
	
	public static String missingChar(String str, int n) {
		
		StringBuffer newStr = new StringBuffer (str);
		
		newStr.deleteCharAt(n);
		
		str = newStr.toString();
		
		return str;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "kitten";
		int n = 0;
		
		System.out.println(missingChar(str, n)); 

	}

}
