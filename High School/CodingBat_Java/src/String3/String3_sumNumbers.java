package String3;

import java.io.IOException;

public class String3_sumNumbers {
	
	public static int sumNumbers(String str) {
		  
		int sum = 0;
		  int power = 0;
		  
		  for (int i = str.length()-1; i >= 0; i--) {
		    
			  if(Character.isDigit(str.charAt(i))) {
		      
				  sum += Math.pow(10, power) * Integer.parseInt(str.substring(i, i+1));
				  power++;
		    
			  } else {
				  
				  power = 0;
				  
			  }
			  
		  }
		  
		  return sum;
		
	}

	public static void main (String[] args) throws IOException {
		
		String str = "hello";
	
		System.out.println(sumNumbers(str)); 

	}
	
}
