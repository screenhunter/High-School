package AP1;

public class AP1_sumHeights {

	public static int sumHeights(int[] heights, int start, int end) {
		
		int changeSum = 0;
		
		for (int i = start; i < end; i++) {
			
			changeSum += Math.abs(heights[i] - heights[i + 1]);
			
		}
		
		return changeSum;
		  
	}
	
	public static void main(String[] args) {

		int[] heights = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int start = 0;
		int end = 2;
		
		System.out.println(sumHeights(heights, start, end));

	}

}
