package AP1;

import java.io.IOException;

public class AP1_wordsCount {

	public static int wordsCount(String[] words, int len) {

		int count = 0;

		for (int i = 0; i < words.length; i++) {

			if (words[i].length() == len) {

				count++;

			}

		}

		return count;

	}
	
	public static void main(String[] args) throws IOException {

		String[] words = {"a", "b"};
		int len = 2;
		System.out.println(wordsCount(words, len));

	}

}
