package Contest1;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Rajat Khanna
 * Thomas Jefferson High School for Science and Technology
 * Junior Division
 * Contest #1 2012-2013
 * Time Sheets
 */

public class Time_Sheets_old {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		DecimalFormat d = new DecimalFormat("$#.00");
		
		String[] timings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H"};
		
		Scanner in = new Scanner(System.in);
		
		for (int counter = 1; counter < 5; counter++) {
			
			String[] lineA = in.nextLine().split(",");
			String t1 = lineA[1].trim();
			String t2 = lineA[2].trim();
			
			double x = 0;
			double y = 0;
			
			for (int i = 0; i < timings.length; i++) {
				
				if (t1.equalsIgnoreCase(timings[i]))
					x = i;
				
				if (t2.equalsIgnoreCase(timings[i]))
					y = i;
				
			}
			
			int money = calculator(Integer.parseInt(lineA[0].trim()), (y-x)/2);
			
			System.out.println(counter + ". " + d.format(money));
			
			sum += money;
				
		}
		
		System.out.println("5. " + d.format(sum));
		
		in.close();
		
	}
	
	private static int calculator(int loc, double z) {
		
		int money = 0;
		
		if (loc < 10)
			money = (int)(10*z);
		else if (loc < 20)
			if (z <= 4)
				money = (int)(8*z);
			else
				money = 8*4 + (int)(12*(z-4));
		else
			if (z <= 4)
				money = (int)(12*z);
			else
				money = (int)(12*4 + (24*(z-4)));
		
		return money;
		
	}

}
