package Warmup1;
import java.io.IOException;

public class Warmup1_frontBack {
	
	public static String frontBack(String str) {
		
		if (str.length() >0) {
			
			String x = "" + str.charAt(0);
			String y = "" + str.charAt(str.length() - 1);
			
			StringBuffer newStr = new StringBuffer(str);
			
			newStr.replace(0, 1, y);
			newStr.replace(str.length() - 1, str.length(), x);
			
			str = newStr.toString();
			  
		}
		
		return str;
			
	}
		
	public static void main (String[] args) throws IOException {
		
		String str = "poopy";
		
		System.out.println(frontBack(str)); 

	}

}
