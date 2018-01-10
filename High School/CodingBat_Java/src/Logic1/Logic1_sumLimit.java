package Logic1;

import java.io.IOException;

public class Logic1_sumLimit {
	
	public static int sumLimit(int a, int b) {
		
			  String first = String.valueOf(a);
			  int plus = (a + b);
			  String second = String.valueOf(plus);
			  
			  if (first.length() == second.length()) {

				   return plus;
				  
			  }
			  
			  return a;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int a = 92;
		int b = 21;
		
		System.out.println(sumLimit(a, b));
		
	}

}
