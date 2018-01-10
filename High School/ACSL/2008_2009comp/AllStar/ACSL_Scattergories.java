package AllStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ACSL_Scattergories {
	
	private static String[] line;
	private static int[] scores;
	
	public static void main(String[] args) throws IOException {
		
		line = new String[5];
		
		BufferedReader in = new BufferedReader(new InputStreamReader((System.in)));
		
		for (int count = 1; count < 6; count++) {
			
			System.out.println("Please enter line #" + count + " with or without spaces:");
			line[count-1] = in.readLine().replaceAll(" ", "");
			
		}
		

		
		ArrayList<String> words = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) { //round number
			
			for (int j = 0; j < 5; j++) { //player number
				
				for (int k = 0; k < 5; k++)
					if (j != k)
						words.add(line[j].split(",")[i]);
				
				//if (!words.contains(line[j].split(",")[i]))
					
				
				
			}
			
			
			
			words.clear();
			
		}
		
		
		
	}

}
