package AP1;

import java.io.IOException;

public class AP1_wordsFront {
	
	public static String[] wordsFront(String[] words, int n) {
		
		String[] result = new String[n];
		
		for (int i = 0; i < n; i++) {
			
			result[i] = "";
			result[i] += words[i];
			
		}
		
		return result;
		  
	}
	
	public static void main(String[] args) throws IOException {

		String[] words = {"a", "b"};
		int n = 1;
		System.out.println(wordsFront(words, n));

	}

}
