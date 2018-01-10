
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;

/*
 rkhanna
 Rajat Khanna
 2/9/2012
 PROG: crossings
 LANG: JAVA
 */

public class crossings {

	private static int N;

	public static void main(String[] args) throws Exception {

		// long startTime = System.nanoTime();

		BufferedReader in = new BufferedReader(new FileReader("crossings.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"crossings.out")));

		N = Integer.parseInt(in.readLine());

		int[][] points = new int[N][2];

		for (int i = 0; i < N; i++) {

			String[] line = in.readLine().split(" ");

			for (int j = 0; j < 2; j++)
				points[i][j] = Integer.parseInt(line[j]);

		}

		HashSet<Integer> cows = new HashSet<Integer>();

		int count = 0;

		for (int i = 0; i < N; i++) {

			boolean flag = false;

			if (cows.contains(i))
				continue;

			for (int j = 0; j < N; j++) {

				if (i == j)
					continue;

				int xi1 = points[i][0];
				int xi2 = points[i][1];
				int xj1 = points[j][0];
				int xj2 = points[j][1];
				if (xi1 > xj1) {

					xi1 = points[j][0];
					xi2 = points[j][1];
					xj1 = points[i][0];
					xj2 = points[i][1];

				}

				if (xi2 > xj2) {

					cows.add(i);
					cows.add(j);
					flag = true;

				}

			}

			if (!flag)
				count++;

		}

		out.println(count);

		// long endTime = System.nanoTime();
		// System.out.println("Took " + (endTime - startTime) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

}
