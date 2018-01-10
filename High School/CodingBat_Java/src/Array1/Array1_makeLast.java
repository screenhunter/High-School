package Array1;

import java.io.IOException;

public class Array1_makeLast {
	
	public static int[] makeLast(int[] nums) {
		
		int[] answer = new int[nums.length*2];
		
		answer[answer.length-1] = nums[nums.length-1];
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {2,3};
		
		System.out.println(makeLast(nums)[1]);
		
	}

}
