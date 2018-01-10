package Contest1;

import java.util.Scanner;

public class ACSL_Golf {
	
	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i = 0; i < 4; i++) {
			
			System.out.println("Please enter the 2 integers");
			
			Scanner read = new Scanner(System.in);
			
			String[] nums = read.nextLine().split(",");
			
			int[] num = new int[2];
			
			num[0] = Integer.parseInt(nums[0].trim());
			num[1] = Integer.parseInt(nums[1].trim());
			
			count += num[1] - num[0];
			
			if (num[1] - num[0] == 0)
				System.out.println("par");
			else if(num[1] - num[0] == 1)
				System.out.println("bogey");
			else if(num[1] - num[0] == 2)
				System.out.println("double bogey");
			else if(num[1] - num[0] == -1)
				System.out.println("birdie");
			else if(num[1] - num[0] == -2)
				System.out.println("eagle");
			else
				System.out.println("case not resolved");
			
			read.close();
			
		}
		
		if (count > 0)
			System.out.println(count + " over par");
		else if (count < 0)
			System.out.println(Math.abs(count) + " under par");
		else
			System.out.println("Par");
		
	}

}
