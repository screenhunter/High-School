package Contest2;

import java.util.*;

public class Sudoku {
	
	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		
		int[][] grid = new int[9][9];
		
		for (int i = 0; i < 9; i++) {
			
			String[] line = in.nextLine().split(", ");
			
			for (int j = 0; j < 9; j++)
				grid[i][j] = Integer.parseInt(line[j].trim());
			
		}
		
		for (int counter = 0; counter < 5; counter++) {
			
			String[] line = in.nextLine().split(", ");
			
			CellChecker(grid, Integer.parseInt(line[0].trim()) - 1, Integer.parseInt(line[1].trim()) - 1, RCChecker(grid, Integer.parseInt(line[0].trim()) - 1, Integer.parseInt(line[1].trim()) - 1));
			
			
		}
		
		in.close();
		
	}
	
	private static ArrayList<Integer> RCChecker(int[][] grid, int x, int y) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (int i = 1; i < 10; i++)
			nums.add(i);
		
		for (int i = 0; i < 9; i++) {
			
			if (i != x && nums.contains(grid[i][y]))
				nums.remove(nums.indexOf(grid[i][y]));
			
			if (i != y && nums.contains(grid[x][i]))
				nums.remove(nums.indexOf(grid[x][i]));
			
		}
		
		return nums;
		
	}
	
	private static void CellChecker(int[][] grid, int x, int y, ArrayList<Integer> nums) {
		
		l: for (int xc = 3; xc < 10; xc += 3)
			for (int yc = 3; yc < 10; yc += 3)
				if (x < xc && y < yc) {	
					for (int i = xc - 3; i < xc; i++)
						for (int j = yc - 3; j < yc; j++)
							if ((i != x || j != y) && nums.contains(grid[i][j]))
									nums.remove(nums.indexOf(grid[i][j]));
					break l;
					
				}
	
		for (int i = 0; i < nums.size(); i++) {
			
			System.out.print(nums.get(i));
			
			if (i + 1 < nums.size())
				System.out.print(",");
			
		}
		
		System.out.println();
		
	}

}
