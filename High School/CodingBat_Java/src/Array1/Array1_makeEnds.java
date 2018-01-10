package Array1;

import java.io.IOException;

public class Array1_makeEnds {
	
	public static int[] makeEnds(int[] nums) {
		
		int[] answer = {nums[0], nums[nums.length-1]};
		
		return answer;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int[] nums = {3, 2};
		
		System.out.println(makeEnds(nums)[1]);
		
	}

}
