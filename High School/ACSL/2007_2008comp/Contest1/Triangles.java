package Contest1;

//Rajat Khanna

import java.util.Arrays;
import java.util.Scanner;

public class Triangles {
	
	public static void main(String[] args) {
		
		for (int lame = 0; lame < 5; lame++) {
			
			System.out.println("Please enter the data");
			
			Scanner readLine = new Scanner(System.in);
			
			String[] nums = readLine.nextLine().split(",");
			double[] t1 = new double[3];
			double[] t2 = new double[3];
			
			for (int i = 0; i < 3; i++) {
				
				t1[i] = Double.parseDouble(nums[i].trim());
				t2[i] = Double.parseDouble(nums[i+3].trim());
				
			}
			
			Arrays.sort(t1);
			Arrays.sort(t2);
			
			int count = 0;
			
			for (int i = 0; i < 3; i++)
				for (int j = 0; j < 3; j++)
				if (t1[i] == t2[j]) {
					count++;
					t2[j] = 0;
				}
			
			System.out.println(count);
			
			readLine.close();
			
		}
		
	}

}
