package Array3;

import java.io.IOException;

public class Array3_linearIn {
	
	public static boolean linearIn(int[] outer, int[] inner) {
		
		String newOuter = "";
		
		for (int i = 0; i < outer.length; i++) {
			
			newOuter += outer[i];
			
		}
		
		for (int i = 0; i < inner.length; i++) {
			
			if (newOuter.contains(inner[i] + "") == true) {
				
			} else {
				
				return false;
				
			}
			
		}
		
		return true;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] outer = {1, 2, 2, 2, 4, 3, 4, 5};
		int[] inner = {2, 3};
		
		System.out.println(linearIn(outer, inner));
		
	}

}
