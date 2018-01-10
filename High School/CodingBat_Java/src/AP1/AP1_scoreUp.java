package AP1;

public class AP1_scoreUp {
	
	public static int scoreUp(String[] key, String[] answers) {
		
		int points = 0;
		
		for (int i = 0; i < key.length; i++) {
				
			if (key[i].contentEquals(answers[i])) {
					
				points += 4;
					
			} else if (answers[i].contentEquals("?")) {
					
			} else {
				
				points -= 1;
				
			}
			
		}
		
		return points;
		  
	}
	
	public static void main(String[] args) {

		String[] key = {"a", "b", "c"};
		String[] answers = {"b", "b", "c"};
		
		System.out.println(scoreUp(key, answers));

	}

}
