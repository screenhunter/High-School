package Contest1;

import java.util.Scanner;

public class ACSL_Bridge {
	
	public static void main(String[] args) {
		
		for (int abcd = 0; abcd < 5; abcd++) {
			
			System.out.println("Please enter the the data:");
			
			Scanner in = new Scanner(System.in);
			
			String[] line = in.nextLine().split(",");
			
			int bid = Integer.parseInt(line[0].trim());
			int tricks = Integer.parseInt(line[1].trim());
			String suit = line[2].trim().toUpperCase();
			
			if (suit.equals("N"))
				System.out.println((40 + (bid- 1) * 30) + ", " + (tricks-bid - 6)*30);
			else if (suit.equals("H") || suit.equals("S"))
				System.out.println((bid * 30) + ", " + (tricks-bid - 6)*30);
			else if (suit.equals("C") || suit.equals("D"))
				System.out.println((bid * 20) + ", " + (tricks-bid - 6)*20);
			
			in.close();
			
		}
		
	}

}
