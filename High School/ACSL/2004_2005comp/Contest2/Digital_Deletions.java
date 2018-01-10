package Contest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Digital_Deletions {
	
	public static void main(String[] args) throws Exception {
		
		for (int wastecount = 0; wastecount < 5; wastecount++) {
			
			System.out.println("Please Enter the data");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
			String[] line = in.readLine().split(",");
			int[] nums = new int[line.length - 1];
		
			for (int i = 1; i < line.length; i++)
				nums[i - 1] = Integer.parseInt(line[i].trim());
			
			System.out.println(counter(nums));
				
		}
		
	}
	
	private static int counter(int[] x) {
		
		int count = 0;
		
		while (!checker(x)) {
			
			int pos = -1;
			
			for (int i = 0; i < x.length; i++)
				if (x[i] == 0) {
					
					pos = i;
					
				}
			
			for (int i = 0; i <= pos; i++)
				x[i] = -1;
			
			if (pos < 0) {
			
				pos = max(x);
			
				if (x[pos] % 2 == 0)
					x[pos] -= 2;
				else
					x[pos] -= 1;
			
			}
			
			count++;
			
		}
		
		return count;
		
	}
	
	private static boolean checker(int[] x) {
		
		for (int num: x)
			if (num >= 0)
				return false;
		
		return true;
		
	}
	
	private static int max(int[] x) {
		
		int num = 0;
		
		for (int i = 0; i < x.length; i++)
			if (x[i] >= x[num])
				num = i;
		
		return num;
		
	}
	
}
