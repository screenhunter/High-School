package Contest2;

import java.util.Scanner;

public class Search {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the words:");
		String[] words = in.nextLine().split(",");
		
		for (int i = 0; i < words.length; i++)
			words[i] = words[i].trim();
		
		for (int waste = 0; waste < 5; waste++) {
			
			System.out.println("Please enter the search expression:");
			String ex = in.nextLine();
			
			int index1 = ex.indexOf("*");
			//int index2 = ex.indexOf("?");
			
			//if (index1 == -1 && index2 == -1) {
				
				//for (int i = 0; i < words.length; i++)
					//if (words[i].equals(ex)) {
						
						//System.out.print(words[i]);
						
						//if (i != words.length - 1)
							//System.out.print(", ");
						//else
							//System.out.println();
						
					//}
			//}
			
			star(words, ex, index1);
			
		}
		
		in.close();
		
	}
	
	private static void star(String[] words, String ex, int pos) {
		
		String ans = "";
		
		if (pos == 0) {
			
			for (int i = 0; i < words.length; i++)
				if (words[i].lastIndexOf(ex.substring(1)) == words[i].length() - ex.length() + 1)
					ans += words[i] + ", ";
					
			
		} else
			for (int i = 0; i < words.length; i++)
				if (words[i].indexOf(ex.substring(0, ex.length() - 1)) == 0)
					ans += words[i] + ", ";
		
		if (ans.equals("") == false)
			ans = ans.substring(0, ans.length() - 2);
		
		System.out.println(ans);
		
	}

}
