package AP1;

public class AP1_sumHeights2 {
	
	public static int sumHeights2(int[] heights, int start, int end) {
		
		int changeSum = 0;
		
		for (int i = start; i < end; i++) {
			
			if (heights[i] < heights[i + 1]) {
				
				changeSum += 2 * Math.abs(heights[i] - heights[i + 1]);
				
			} else {
				
				changeSum += Math.abs(heights[i] - heights[i + 1]);
			}
			
		}
		
		return changeSum;
		  
	}
	
	public static void main(String[] args) {

		int[] heights = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int start = 0;
		int end = 2;
		
		System.out.println(sumHeights2(heights, start, end));

	}

}
