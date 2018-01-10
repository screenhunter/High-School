package Contest1;

import java.util.Scanner;

public class ACSL_Post_Office {
	
	public static void main (String[] args) {
		
		for (int a = 0; a < 5; a++) {
			
			System.out.println("Please enter the dimensions");
			
			Scanner readLine = new Scanner(System.in);
			
			String[] waste = readLine.nextLine().split(",");
			double[] nums = new double[waste.length];
			
			for (int i = 0; i < waste.length; i++)
				nums[i] = Double.parseDouble(waste[i].trim());
			
			if ((nums[0] >= 3.5 && nums[0] <= 4.25) && (nums[1] >= 3.5 && nums[1] <= 6) && (nums[2] >= 0.007 && nums[2] <= 0.016))
				System.out.println("REGULAR POST CARD");
			else if ((nums[0] > 4.25 && nums[0] < 6) && (nums[1] > 6 && nums[1] < 11.5) && (nums[2] >= 0.007 && nums[2] <= 0.016))
				System.out.println("LARGE POST CARD");
			else if ((nums[0] >= 3.5 && nums[0] <= 6.125) && (nums[1] >= 5 && nums[1] <= 11.5) && (nums[2] > 0.016 && nums[2] < 0.25))
				System.out.println("ENVELOPE");
			else if ((nums[0] > 6.125 && nums[0] < 24) && (nums[1] >= 11 && nums[1] <= 18) && (nums[2] > 0.25 && nums[2] < 0.5))
				System.out.println("LARGE ENVELOPE");
			else if (nums[0] + 2 * (nums[1] + nums[2]) <= 84)
				System.out.println("PACKAGE");
			else if (nums[0] + 2 * (nums[1] + nums[2]) > 84 && nums[0] + 2 * (nums[1] + nums[2]) <= 130)
				System.out.println("LARGE PACKAGE");
			else
				System.out.println("UNAVAILABLE");
			
			readLine.close();
				
		}
		
	}

}
