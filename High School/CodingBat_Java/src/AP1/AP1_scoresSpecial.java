package AP1;

public class AP1_scoresSpecial {
	
	public static int scoresSpecial(int[] a, int[] b) {
		
		return specialFinder(a) + specialFinder(b);
		  
	}
	
	public static int specialFinder(int[] nums) {
		
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] % 10 == 0 && nums[i] > max) {
				
				max = nums[i];
				
			}
			
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {

		int[] a = {1, 10, 2};
		int[] b = {10, 20, 30};
		
		System.out.println(scoresSpecial(a, b));

	}

}
