package Contest1;

import java.util.Scanner;

public class ACSL_Prints {
	
	public static void main(String[] args) {
		
		for (int abcdefg = 0; abcdefg < 5; abcdefg++) {
			
			Scanner in = new Scanner(System.in);
			
			String[] lame = in.nextLine().split(",");
			int[] nums = new int[lame.length];
			
			for (int i = 0; i < lame.length; i++)
				nums[i] = Integer.parseInt(lame[i].trim()) + 1;
			
			int pos = 0;
			int even = 0;
			int odd = 0;
			
			while(nums[pos] != 1) {
				
				int x = nums[pos] / 2;
				
				if (nums[pos] % 2 == 0)
					odd += Math.pow(2, 5 - x);
				else
					even += Math.pow(2, 5 - x);
				
				pos++;
				
			}
			
			System.out.println((even + 1) + "/" + (odd + 1));
			in.close();
			
		}
		
	}

}
