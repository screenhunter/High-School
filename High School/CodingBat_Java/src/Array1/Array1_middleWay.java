package Array1;

import java.io.IOException;

public class Array1_middleWay {
	
	public static int[] middleWay(int[] a, int[] b) {
		
		int[] nums = {a[1], b[1]};
		
		return nums;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] a = {7, 8, 9};
		int[] b = {9, 8, 7};
		
		System.out.println(middleWay(a, b)[0]);
		
	}

}
