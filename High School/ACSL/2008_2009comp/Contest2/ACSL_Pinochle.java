package Contest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ACSL_Pinochle {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int uselesscount = 0; uselesscount < 5; uselesscount++) {
			
			System.out.println("Please enter the data:");
			
			String[] hand = in.readLine().split(", ");
			
			for (int i = 0; i < hand.length; i++)
				hand[i] = hand[i].trim();
			
			System.out.println(counter(hand));

		}
		
		in.close();
		
	}

	private static int counter(String[] hand) {

		return case16(hand) + caseAA(hand) + caseKK(hand) + caseQQ(hand) + caseJJ(hand);
		
	}
	
	private static int case16(String[] hand) {

		if(!hand[0].contains("J") || !hand[2].contains("Q"))
			return 0;
		
		if (hand[0].indexOf("J") == hand[0].lastIndexOf("J") || hand[2].indexOf("Q") == hand[2].lastIndexOf("Q"))
			return 4;
		
		return 38;
		
	}
	
	private static int caseAA(String[] hand) {
		
		boolean b = true;
		
		for (int i = 0; i < 4; i++) {
			
			if (!hand[i].contains("A"))
				return 0;
			
			if (hand[i].indexOf("A") == hand[i].lastIndexOf("A"))
				b = false;
			
		}
		
		if (b)
			return 120;

		return 10;
		
	}
	
	private static int caseKK(String[] hand) {
		
		boolean b = true;
		
		for (int i = 0; i < 4; i++) {
			
			if (!hand[i].contains("K"))
				return 0;
			
			if (hand[i].indexOf("K") == hand[i].lastIndexOf("K"))
				b = false;
			
		}
		
		if (b)
			return 96;

		return 8;
		
	}
	
	private static int caseQQ(String[] hand) {
		
		boolean b = true;
		
		for (int i = 0; i < 4; i++) {
			
			if (!hand[i].contains("Q"))
				return 0;
			
			if (hand[i].indexOf("Q") == hand[i].lastIndexOf("Q"))
				b = false;
			
		}
		
		if (b)
			return 72;

		return 6;
		
	}

	private static int caseJJ(String[] hand) {
	
	boolean b = true;
	
	for (int i = 0; i < 4; i++) {
		
		if (!hand[i].contains("J"))
			return 0;
		
		if (hand[i].indexOf("J") == hand[i].lastIndexOf("J"))
			b = false;
		
	}
	
	if (b)
		return 48;

	return 4;
	
}

}
