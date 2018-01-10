package Contest1;

import java.util.Scanner;

public class ACSL_Poker {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Please enter the cards in the hand");
			
			Scanner readLine = new Scanner(System.in);
			
			String[] nums = readLine.nextLine().split(",");
			int[] cards = new int[nums.length];
			for (int j = 0; j < cards.length; j++)
				cards[j] = Integer.parseInt(nums[j].trim());
			
			int x = 0;
			
			for (int j = 0; j < 5; j++)
				for (int k = 0; k < 5; k++)
					if (Math.abs(cards[j] - cards[k])% 13 == 0) {
						
						x++;
						System.out.println(cards[j] + " " + cards[k]);
						
					}
			
			x -= 5;
			
			if (x == 2)
				System.out.println("PAIR");
			else if (x == 6)
				System.out.println("THREE OF A KIND");
			else if (x == 8)
				System.out.println("FULL HOUSE");
			else if (x == 12)
				System.out.println("FOUR OF A KIND");
			else
				System.out.println("NO RELATION");
			
			readLine.close();
			
		}				
		
	}
	
}
