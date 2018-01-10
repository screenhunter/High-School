package Contest3;

/*
 * Rajat Khanna
 * Thomas Jefferson High School for Science and Technology
 * Junior Division
 * Contest #3 2012-2013
 * ACSL Chess Queen
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rajat_Khanna_ACSL_Chess_Queen_Final {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int numTimes = 0; numTimes < 5; numTimes++) {
			
			System.out.println("Please enter Input #" + (numTimes + 1) + " seperated by commas and/or spaces");
			StringTokenizer st = new StringTokenizer(in.readLine(), ", ");
			
			int[][] grid = new int[5][5];
			int row = Integer.parseInt(st.nextToken()) - 1;
			int col = Integer.parseInt(st.nextToken()) - 1;
			int N = Integer.parseInt(st.nextToken());
			
			for (int i = 0; i <= N; i++) {
				
				if (row + i < 5)
					grid[row + i][col] = 1;
				
				if (row - i >= 0)
					grid[row - i][col] = 1;
				
				if (col + i < 5)
					grid[row][col + i] = 1;
				
				if (col - i >= 0)
					grid[row][col - i] = 1;
				
				if (row + i < 5 && col + i < 5)
					grid[row + i][col + i] = 1;
				
				if (row + i < 5 && col - i >= 0)
					grid[row + i][col - i] = 1;
				
				if (row - i >= 0 && col + i < 5)
					grid[row - i][col + i] = 1;
				
				if (row - i >= 0 && col - i >= 0)
					grid[row - i][col - i] = 1;
			
			}
			
			int count = 0;
			
			for (int i = 0; i < 5; i++)
				for (int j = 0; j < 5; j++)
					if (grid[i][j] == 0)
						count++;
			
			System.out.println((numTimes + 1) + ". " + count);
			
		}
		
		
	}

}
