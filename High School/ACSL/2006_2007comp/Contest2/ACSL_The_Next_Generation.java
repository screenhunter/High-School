package Contest2;

/*Rajat Khanna
 * TJHSST
 * Task: 2006-2007 Contest 2 Programming Problem
 */


import java.util.Scanner;

public class ACSL_The_Next_Generation {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		for (int counter = 0; counter < 5; counter++) {
			
			System.out.println("Please enter the Input");
			
			String[] input = in.nextLine().split(",");
			
			int num = Integer.parseInt(input[input.length - 1].trim());
			
			String[] line = new String[input.length - 2];
			
			for (int i = 1; i < input.length - 1; i++)
				line[i - 1] = input[i].trim();
			
			for (int i = 0; i < num; i++)
				line = nextGen(line);
			
			for (int i = 0; i < line.length; i++)
				System.out.print(line[i]);
			
			System.out.println();
			
		}
		
		in.close();
		
	}
	
	private static String[] nextGen(String[] line) {
		
		String[] cells = new String[line.length];
		
		for (int i = 0; i < line.length; i++) {
			
			if (i == 0)
				if (line[i + 1].equalsIgnoreCase("A"))
					cells[i] = "A";
				else
					cells[i] = "D";
			else if (i == line.length - 1)
				if (line[i - 1].equalsIgnoreCase("A"))
					cells[i] = "A";
				else
					cells[i] = "D";
			else
				if (line[i - 1].equalsIgnoreCase(line[i + 1]))
					cells[i] = "D";
				else
					cells[i] = "A";
			
		}
		
		return cells;
		
	}

}
