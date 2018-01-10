package Array3;

import java.util.ArrayList;
import java.util.List;

public class Array3_maxMirror {
	
	public static int maxMirror(int[] nums) {
		
		int ret = 0;
		int n = nums.length;
		
		if (nums.length == 1) {
			
			return 1;
			
		}
		
		for (int i = n; i >=2; i--) {
			
			for (int j = 0; j <= n-i; j++) {
				
				List<Integer> list = new ArrayList<Integer>();
				
				for (int k = j; k < j+i; k++) {
					
					list.add(nums[k]);
				
				}
				
				for (int k = 0; k <= n-i; k++) {
					
					boolean flg = true;
					
					for (int l = k; l < k+i; l++) {
						
						int pos = i-l+k-1;
						
						if (nums[l] != list.get(pos)) {
							
							flg = false;
						
						}
					
					}
					
					if (flg == true) {
						
						if (ret < list.size()) {
							
							ret = list.size();
						
						}
					
					}
				
				}
			
			}
		
		}
		
		return ret;
	
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 8, 9, 3, 2, 1};
		
		System.out.println(maxMirror(nums));
	}

}
