package Array3;

import java.io.IOException;

public class Array3_squareUp {
	

	public static int[] squareUp(int index) {
		
		int[] ret = new int[index*index];
		
		for (int i = 0; i < index; i++) {
			
			for (int j = 0; j < index; j++) {
				
				ret[index*i + j] = 0;
			
			}
		
		}

		for (int i = 0; i < index; i++) {
			
			int k = 1;
			
			for (int j = 0; j <= i; j++) {
				
				ret[i*index + index-1-j] = k++;
			
			}
		
		}
		
		return ret;
	
	}
	
	public static void main (String[] args) throws IOException {
		
		int n = 3;
		
		System.out.println(squareUp(n));
		
	}

}
