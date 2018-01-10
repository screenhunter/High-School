package AP1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AP1_wordsWithoutList {
	
	public static List<String> wordsWithoutList(String[] words, int len) {
		
		ArrayList<String> result = new ArrayList<String>();
		
		for (int i = 0; i < words.length; i++) {
			
			if (words[i].length() != len) {
				
				result.add(words[i]);
				
			}
			
		}
		
		return result;
		  
	}
	
	public static void main(String[] args) throws IOException {

		String[] words = {"a", "b"};
		int len = 2;
		System.out.println(wordsWithoutList(words, len));

	}

}
