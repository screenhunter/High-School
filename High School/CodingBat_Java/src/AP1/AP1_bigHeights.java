package AP1;

public class AP1_bigHeights {
	
	public static int bigHeights(int[] heights, int start, int end) {
		
		int count = 0;
		
		for (int i = start; i < end; i++) {
			
			if (heights[i] + 5 <= heights[i + 1] || heights[i] >= heights[i + 1] + 5) {
				
				count++;
				
			}
			
		}
		
		return count;
		  
	}
	
	public static void main(String[] args) {

		int[] heights = {1, 7, 2, 4, 5, 6, 7, 8, 9};
		int start = 0;
		int end = 2;
		
		System.out.println(bigHeights(heights, start, end));

	}

}
