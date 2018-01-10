
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class truth {

	private static String checker(int[][] truths, int[][] lies) {

		for (int i = 0; i < truths.length; i++) {

			for (int j = 0; j < truths[0].length; j++) {

				if (truths[i][j] != 0) {

					for (int a = 0; a < lies.length; a++) {

						for (int b = 0; b < lies[0].length; b++) {

							if (lies[a][b] != 0) {

								if (i + 1 == lies[a][b]
										&& a + 1 == truths[i][j])
									return i + " " + j;

							}

						}

					}

				}

			}

		}

		return truths.length + "";

	}

	public static void main(String[] args) throws Exception {

		// long startTime = System.nanoTime();

		BufferedReader in = new BufferedReader(new FileReader("truth.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"truth.out")));

		String[] nums = in.readLine().split(" ");

		int N = Integer.parseInt(nums[0]);
		int M = Integer.parseInt(nums[1]);

		int[][] array = new int[N][N];
		int[][] grid = new int[N][N];

		String[][] lines = new String[M][3];

		for (int i = 0; i < M; i++) {

			String[] line = in.readLine().split(" ");
			lines[i] = line;

			if (line[2].contains("T")) {

				for (int j = 0; j < N; j++) {

					if (array[Integer.parseInt(line[0]) - 1][j] == 0) {

						array[Integer.parseInt(line[0]) - 1][j] = Integer
								.parseInt(line[1]) - 1;
						break;

					}

				}

			} else {

				for (int j = 0; j < N; j++) {

					if (grid[Integer.parseInt(line[0]) - 1][j] == 0) {

						grid[Integer.parseInt(line[0]) - 1][j] = Integer
								.parseInt(line[1]) - 1;
						break;

					}

				}

			}

		}

		String x = checker(array, grid);
		boolean b = false;

		for (int i = 0; i < M; i++) {

			if (x.contains(lines[i][0] + " " + lines[i][1])) {

				b = true;
				out.print(i);

			}

		}

		if (!b)
			out.println(M - 1);

		// long endTime = System.nanoTime();
		// System.out.println("Took "+(endTime - startTime) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

}