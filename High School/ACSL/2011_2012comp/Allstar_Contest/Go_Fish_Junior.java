package Allstar_Contest;

import java.util.ArrayList;
import java.util.Scanner;

public class Go_Fish_Junior {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> opponentHand = new ArrayList<Integer>();
		ArrayList<Integer> playerHand = new ArrayList<Integer>();
		ArrayList<Integer> deck = new ArrayList<Integer>();
		
		System.out.println("Please Enter the Opponents Hand");
		String[] nums = in.nextLine().replaceAll(" ", "").split(",");
		for (int i = 0; i < 7; i++)
			opponentHand.add(Integer.parseInt(nums[i]));
		
		System.out.println("Please Enter the Your Hand");
		nums = in.nextLine().replaceAll(" ", "").split(",");
		for (int i = 0; i < 7; i++)
			playerHand.add(Integer.parseInt(nums[i]));
		
		System.out.println("Please Enter the Cards in the Deck");
		nums = in.nextLine().replaceAll(" ", "").split(",");
		for (int i = 0; i < 5; i++)
			deck.add(Integer.parseInt(nums[i]));
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Please enter the card number");
			int card = in.nextInt();
			
			int count = 0;
			
			for (int j = 0; j < opponentHand.size(); j++)
				if (opponentHand.get(j) == card) {
					
					opponentHand.remove(j);
					playerHand.add(card);
					
					j = j-1;
					count++;
					
				}
			
			if (count == 0) {
				
				playerHand.add(deck.get(0));
				deck.remove(0);
				
			}
			
			count = 0;
			
			for (int j = 0; j < playerHand.size(); j++)
				if (playerHand.get(j) == card)
					count++;
			
			if (count == 4) {
				
				count = 0;
				
				for (int j = 0; j < playerHand.size(); j++)
					if (playerHand.get(j) == card)
						playerHand.remove(j);
				
			}
			
			System.out.println(count);
			
		}
		
		in.close();
		
	}

}
