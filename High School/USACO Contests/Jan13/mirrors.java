
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class mirrors {

	@SuppressWarnings("unused")
	private static boolean check(int x, int y, int a, int b, int dir,
			ArrayList<Integer> x1, ArrayList<Integer> y1, int count) {

		if (dir == 0) {

			if (a > x && b == y)
				return true;

		}

		return false;

	}

	private static int checker(char[][] grid) {

		return grid.length - grid[0].length;

	}

	public static void main(String[] args) throws Exception {

		// long startTime = System.nanoTime();

		BufferedReader in = new BufferedReader(new FileReader("mirrors.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"mirrors.out")));

		String[] line = in.readLine().split(" ");

		char[][] grid = new char[Integer.parseInt(line[1].charAt(0) + "")][Integer
				.parseInt(line[2].charAt(0) + "")];

		for (int i = 0; i < Integer.parseInt(line[0].charAt(0) + ""); i++) {

			String[] inLine = in.readLine().split(" ");

			grid[0][0] = inLine[2].charAt(0);

		}

		out.println(checker(grid));

		// long endTime = System.nanoTime();
		// System.out.println("Took "+(endTime - startTime) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

	@SuppressWarnings("unused")
	private static void recur(int count, ArrayList<Integer> x,
			ArrayList<Integer> y, String[][] map, int dir, boolean flag, int a,
			int b) throws IOException {

		if (map[x.get(count)][y.get(count)].contains("/"))
			dir++;
		else
			dir--;

	}

}
