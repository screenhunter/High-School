package Contest1;

import java.util.Scanner;

public class Change_Digits {
	
	public static void main(String[] args) {
		
		for (int a = 0; a < 5; a++) {
			
			System.out.println("Please enter the number");
			
			Scanner read = new Scanner(System.in);
			
			char[] nums = read.nextLine().toCharArray();
			
			int max = 0;
			int pos = 0;
			
			for (int i = 0; i < nums.length; i++)
				if (Integer.parseInt(nums[i] + "") > max)
					max = Integer.parseInt(nums[i] + "");
			
			for (int i = 0; i < nums.length; i++)
				if (Integer.parseInt(nums[i] + "") == max) {
					pos = i;
					break;
				}
			
			if (max % 2 == 1)
				nums[pos] = '0';
			else {
				
				int x = Integer.parseInt(nums[pos] + "") + 4;
				x = x % 10;
				nums[pos] = (x + "").toCharArray()[0];
				
			}
			
			for (int i = 0; i < nums.length; i++)
				if (i == 0)
					if (nums[i] == '0')
						continue;
					else
						System.out.println(nums[i]);
				else
					System.out.println(nums[i]);
			
			read.close();
		}
	}
}
