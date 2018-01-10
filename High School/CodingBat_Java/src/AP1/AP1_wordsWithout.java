package AP1;

public class AP1_wordsWithout {
	
	public static String[] wordsWithout(String[] words, String target) {
		
		int count = 0;
		
		for (int i = 0; i < words.length; i++) {
			
			if (words[i].contentEquals(target)) {
				
				count++;
				
			}
			
		}
		
		String[] result = new String[words.length - count];
		int pos = 0;
		
		for (int i = 0; i < words.length; i++) {
			
			if (words[i].contentEquals(target)) {
				
				pos++;
				continue;
				
			}
			
			result[i - pos] = words[i];
			
		}
		
		return result;
		  
	}
	
	public static void main(String[] args) {

		String[] target = {"a", "b", "c"};
		String word = "b";
		
		System.out.println(wordsWithout(target, word));

	}

}
