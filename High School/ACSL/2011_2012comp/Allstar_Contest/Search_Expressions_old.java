package Allstar_Contest;

import java.util.Scanner;

public class Search_Expressions_old {
	
	public static void main(String args[]) {
		
		Scanner Line = new Scanner(System.in);
		
		//String wordLine = Line.nextLine();
		
		//String[] words = wordLine.split("[,]+|\n");
		
		for (int i = 0; i < 10; i++) {
			
			String str = Line.nextLine();
			
			//String[] result = container(words, str);
			
			if (str.contains("[")) {
				
				//String[] newresult = container(words, str);
				
			} else if (str.contains("]")) {
				
				//String[] newresult = container(words, str);
				
			} else if (str.contains("?")) {
				
				//String[] newresult = container(words, str);
				
			} else if (str.contains("*")) {
				
				//String[] newresult = container(words, str);
				
			} else if (str.contains("+")) {
				
				//String[] newresult = container(words, str);
				
			} else if (str.contains("&")) {
				
				//String[] newresult = container(words, str);
				
			}
			
		}
		
		Line.close();
		
	}
	
	public static String[] container(String[] words, String str) {
		
		String answer = "";
		
		for (int i= 0; i < words.length; i++) {
			
			if (words[i].contains(str)) {
				
				answer += words[i] + ", ";
				
			}
			
		}
		
		if (answer.contentEquals("")) {
			
			return words;
			
		}
		
		String[] result = answer.split("[,]+|\n");
		
		return result;
		
	}

}
