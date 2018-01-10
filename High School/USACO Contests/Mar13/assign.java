import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class assign {

	private static void checker(int[][] grid, int x, int y, int c,
			BufferedReader in, PrintWriter out) throws IOException {

		if (x == y)
			return;

		if (c == -1)
			if (grid[x][y] == 1 || grid[y][x] == 1) {

				out.println(0);

				in.close();
				out.close();
				System.exit(0);

			}

		if (c == 1)
			if (grid[x][y] == -1 || grid[y][x] == -1) {

				out.println(0);

				in.close();
				out.close();
				System.exit(0);

			}

		return;

	}

	public static void main(String[] args) throws IOException {

		// long startTime = System.nanoTime();

		BufferedReader in = new BufferedReader(new FileReader("assign.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"assign.out")));

		String[] temp = in.readLine().split(" ");

		int N = Integer.parseInt(temp[0]);
		int K = Integer.parseInt(temp[1]);

		int[][] comparisons = new int[N][N];

		for (int i = 0; i < N; i++)
			comparisons[i][i] = 1;

		for (int i = 0; i < K; i++) {

			String line[] = in.readLine().split(" ");
			int[] cow = { Integer.parseInt(line[1]) - 1,
					Integer.parseInt(line[2]) - 1 };

			if (line[0].equals("S")) {

				checker(comparisons, cow[0], cow[1], 1, in, out);

				comparisons[cow[0]][cow[1]] = 1;
				comparisons[cow[1]][cow[0]] = 1;

				for (int j = 0; j < N; j++) {

					if (comparisons[cow[0]][j] == 1
							|| comparisons[j][cow[0]] == 1) {

						checker(comparisons, cow[1], j, 1, in, out);

						comparisons[cow[1]][j] = 1;
						comparisons[j][cow[1]] = 1;

					}

					if (comparisons[cow[1]][j] == 1
							|| comparisons[j][cow[1]] == 1) {

						checker(comparisons, cow[0], j, 1, in, out);

						comparisons[cow[0]][j] = 1;
						comparisons[j][cow[0]] = 1;

					}

				}

			}

			if (line[0].equals("D")) {

				checker(comparisons, cow[0], cow[1], -1, in, out);

				comparisons[cow[0]][cow[1]] = -1;
				comparisons[cow[1]][cow[0]] = -1;

				for (int j = 0; j < N; j++) {

					if (comparisons[cow[0]][j] == 1
							|| comparisons[j][cow[0]] == 1) {

						checker(comparisons, cow[1], j, -1, in, out);

						comparisons[cow[1]][j] = -1;
						comparisons[j][cow[1]] = -1;

					}

					if (comparisons[cow[1]][j] == 1
							|| comparisons[j][cow[1]] == 1) {

						checker(comparisons, cow[0], j, -1, in, out);

						comparisons[cow[0]][j] = -1;
						comparisons[j][cow[0]] = -1;

					}

				}

			}

		}

		int product = 1;
		boolean b1 = false;
		boolean b2 = false;
		for (int i = 0; i < N; i++) {

			if (comparisons[0][i] == 0 || comparisons[i][0] == 0)
				product *= 3;

			if ((comparisons[0][i] == 1 || comparisons[i][0] == 1) && !b1) {

				product *= 3;
				b1 = true;

			}

			if ((comparisons[0][i] == -1 || comparisons[i][0] == -1) && !b2) {

				product *= 2;
				b2 = true;

			}

		}

		out.println(product);

		// long endTime = System.nanoTime();
		// System.out.println("Took " + (endTime - startTime)/1000000000.0 +
		// " s");

		in.close();
		out.close();
		System.exit(0);

	}

}