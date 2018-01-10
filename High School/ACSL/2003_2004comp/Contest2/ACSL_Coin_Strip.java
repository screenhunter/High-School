package Contest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ACSL_Coin_Strip {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int uselesscount = 0; uselesscount < 5; uselesscount++) {
			
			System.out.println("Please Enter the data");
			
			String[] line = in.readLine().split(",");
			
			ArrayList<Integer> nums = new ArrayList<Integer>();
			
			for (int i = 2; i < line.length; i++)
				nums.add(Integer.parseInt(line[i].trim()));
			
			int[] counts = new int[5];
			
			l: for (int i = 0; i < nums.size(); i++)
				for (int j = 1; j <= 5; j++)
					if (nums.get(i) - j > 0 && nums.contains(nums.get(i) - j) == false)
						counts[j - 1]++;
					else if (nums.get(i) - j > 0 && nums.contains(nums.get(i) - j) == true)
						continue l;
			
			for (int i = 0; i < 5; i++)
				System.out.println(counts[i]);
			
		}
		
		in.close();		
		
	}

}
