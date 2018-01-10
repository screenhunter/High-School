
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 rkhanna
 Rajat Khanna
 2/9/2012
 PROG: perimeter
 LANG: JAVA
 */

public class perimeter {

	public static char[][] grid = new char[100][100];
	private static int N;
	private static int count;

	// recursive method
	public static void borderfill(int r, int c) {

		// bounds
		if (c >= grid[0].length || c < 0)
			return;
		if (r >= grid.length || r < 0)
			return;

		// conditions
		if (grid[r][c] == 'X' || grid[r][c] == 'A')
			return;

		// Actual Problem, in this case, filling an area within the grid (refer
		// to attached text file)
		grid[r][c] = 'A';

		// recursive calls
		borderfill(r + 1, c);// move east
		borderfill(r, c + 1);// move south
		borderfill(r - 1, c);// move west
		borderfill(r, c - 1);// move north
		// borderfill(r + 1, c + 1);// move southeast
		// borderfill(r - 1, c + 1);// move southwest
		// borderfill(r - 1, c - 1);// move northwest
		// borderfill(r + 1, c - 1);// move northeast

	}

	// recursive method
	public static boolean fill(int r, int c) {

		/*
		 * for (int i = 4; i < 9; i++) System.out.println(grid[i]);
		 * System.out.println();
		 */

		// bounds
		if (c >= grid[0].length || c < 0)
			return false;
		if (r >= grid.length || r < 0)
			return false;

		// conditions
		if (grid[r][c] == 'O')
			return true;
		else if (grid[r][c] == 'A')
			return false;
		else if (grid[r][c] != 'X')
			return true;

		grid[r][c] = 'O';

		// recursive calls
		boolean b4 = fill(r + 1, c);// move east
		boolean b6 = fill(r, c + 1);// move south
		boolean b8 = fill(r - 1, c);// move west
		boolean b2 = fill(r, c - 1);// move north
		boolean b5 = fill(r + 1, c + 1);// move southeast
		boolean b7 = fill(r - 1, c + 1);// move southwest
		boolean b1 = fill(r - 1, c - 1);// move northwest
		boolean b3 = fill(r + 1, c - 1);// move northeast

		// System.out.println("***" + r + " " + c);

		// Checks
		if (!b2 && (!b1 || !b3)) {

			// System.out.println(r + " " + c);
			count++;

		} else if (!b2 && (b1 && b3)) {

			if (grid[r][c - 1] == 'A')
				// System.out.println(r + " " + c);
				count++;

		}
		if (!b4 && (!b3 || !b5)) {

			count++;
			// System.out.println(r + " " + c);

		} else if (!b4 && (b3 && b5)) {

			if (grid[r + 1][c] == 'A')
				count++;
			// System.out.println(r + " " + c);

		}
		if (!b6 && (!b5 || !b7)) {

			// System.out.println(r + " " + c);
			count++;

		} else if (!b6 && (b5 && b7)) {

			if (grid[r][c + 1] == 'A')
				// System.out.println(r + " " + c);
				count++;

		}
		if (!b8 && (!b7 || !b1)) {

			// System.out.println(r + " " + c);
			count++;

		} else if (!b8 && (b7 && b1)) {

			if (grid[r - 1][c] == 'A')
				// System.out.println(r + " " + c);
				count++;

		}

		return true;

	}

	public static void main(String[] args) throws IOException {

		long startTime = System.nanoTime();

		BufferedReader in = new BufferedReader(new FileReader("perimeter.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"perimeter.out")));

		N = Integer.parseInt(in.readLine());

		int[] pos = new int[2];

		for (int i = 0; i < N; i++) {

			String[] line = in.readLine().split(" ");
			grid[Integer.parseInt(line[0]) - 1][Integer.parseInt(line[1]) - 1] = 'X';

			if (i == 0) {

				pos[0] = Integer.parseInt(line[0]) - 1;
				pos[1] = Integer.parseInt(line[1]) - 1;

			}

		}

		for (int i = 0; i < 100; i++) {
			borderfill(0, i);
			borderfill(i, 0);
			borderfill(0, 99 - i);
			borderfill(99 - i, 0);
		}
		fill(pos[0], pos[1]);

		out.println(count);

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

}
