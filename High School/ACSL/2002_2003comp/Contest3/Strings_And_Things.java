package Contest3;

import java.io.*;
import java.util.Arrays;

public class Strings_And_Things {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Please enter the string");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String line = in.readLine();
		String[] words = line.split(" ");
		
		System.out.println("1. " + words.length);
		
		int length = 0;
		
		for (int i = 0; i < words.length; i++)
			if (words[i].length() > length)
				length = words[i].length();
		
		System.out.print("2. ");
		
		boolean b = false;
		
		for (int i = 0; i < words.length; i++) {
			
			if (words[i].length() == length) {
				
				if (b)
					System.out.println(" ");
				
				System.out.println(words[i]);
			
			}
			
		}
		
		char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int[] counts = new int[26];
		
		for (int i = 0; i < words.length; i++)
			for (int j = 0; j < words[i].length(); j++) {
				
				int index = Arrays.binarySearch(letters, words[i].charAt(j));
				counts[index]++;
				
			}
		
		int count = 0;
		
		for (int i = 0; i < 26; i++)
			if (counts[i] > 0)
				count++;
		
		System.out.println("3. " + count);
		
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < 26; i++)
			if (counts[i] > max) {
				
				index = i;
				max = counts[i];
				
			}
		
		System.out.println("4. " + letters[index]);
				
		index = 0;
		count = 0;
		
		for (int i = 0; i < words.length; i++) {
			
			int temp = 0;
			
			for (int j = 0; j < words.length; j++)
				if (words[i].equals(words[j]) && words[i].equals("THE") == false)
					temp++;
			
			if (temp > count) {
				
				index = i;
				count = temp;
				
			}
			
		}
		
		System.out.println("5. " + words[index]);
		
	}

}
