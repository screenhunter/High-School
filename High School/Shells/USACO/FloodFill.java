

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FloodFill {

	public static char[][] grid;

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		System.out.print("Filename: ");
		String filename = sc.next();
		grid = read(filename);
		display(grid);
		System.out.print("\nEnter ROW COL to fill from: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		fill(grid, row, col, grid[row][col]); //row, col is starting point
		display(grid);
		sc.close();

	}

	public static char[][] read(String filename) throws FileNotFoundException {

		Scanner x = new Scanner(new File(filename + ".txt"));
		String s = x.nextLine();
		String[] nums = s.split(" ");
		char[][] array = new char[Integer.parseInt(nums[0])][Integer
				.parseInt(nums[1])];

		for (int i = 0; i < Integer.parseInt(nums[0]); i++) {

			s = x.nextLine();
			for (int j = 0; j < s.length(); j++)
				array[i][j] = s.charAt(j);

		}

		x.close();

		return array;

	}

	public static void display(char[][] g) {
		
		for (int i = 0; i < g.length; i++) {
			
			for (int j = 0; j < g[i].length; j++)
				System.out.print(g[i][j]);
			
			System.out.println();
			
		}
		
	}
	
	//recursive method
	public static void fill(char[][] g, int r, int c, char ch) {
		
		//bounds
		if (c >= g[0].length || c < 0)
			return;
		if (r >= g.length || r < 0)
			return;

		//conditions
		if (g[r][c] != ch)
			return;
		
		//Actual Problem, in this case, filling an area within the grid (refer to attached text file)
		if (g[r][c] == ch)
            g[r][c] = '*';

		// recursive calls
		fill(g, r + 1, c, ch);//move east
		fill(g, r, c + 1, ch);//move south
		fill(g, r - 1, c, ch);//move west
		fill(g, r, c - 1, ch);//move north
		
		/* For REFERENCE
		 * 
		 * fill(g, r + 1, c + 1, ch);//move southeast
	     * fill(g, r - 1, c + 1, ch);//move southwest
	     * fill(g, r - 1, c - 1, ch);//move northwest
	     * fill(g, r + 1, c - 1, ch);//move northeast
		 * 
		 */

	}

}
