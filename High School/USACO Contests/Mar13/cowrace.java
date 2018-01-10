import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class cowrace {

	public static void main(String[] args) throws IOException {

		// long startTime = System.nanoTime();

		BufferedReader in = new BufferedReader(new FileReader("cowrace.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"cowrace.out")));

		String[] temp = in.readLine().split(" ");

		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);

		ArrayList<Integer> bessie = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 0; i < N; i++) {

			String[] temp2 = in.readLine().split(" ");

			int x = Integer.parseInt(temp2[0]);
			int y = Integer.parseInt(temp2[1]);

			for (int j = 0; j < y; j++) {

				sum += x;
				bessie.add(sum);

			}

		}

		sum = 0;
		Object[] b = bessie.toArray();
		ArrayList<Integer> elsie = new ArrayList<Integer>();

		for (int i = 0; i < M; i++) {

			String[] temp2 = in.readLine().split(" ");

			int x = Integer.parseInt(temp2[0]);
			int y = Integer.parseInt(temp2[1]);

			for (int j = 0; j < y; j++) {

				sum += x;
				elsie.add(sum);

			}

		}
		Object[] e = elsie.toArray();

		int prev = 0;
		int count = 0;

		for (int i = 0; i < b.length; i++) {

			int x = (Integer) b[i];
			int y = (Integer) e[i];

			if (x > y) {

				if (prev == 2)
					count++;

				prev = 1;

			} else if (y > x) {

				if (prev == 1)
					count++;

				prev = 2;

			}

		}

		out.println(count);

		// long endTime = System.nanoTime();
		// System.out.println("Took " + (endTime - startTime)/1000000000.0 +
		// " s");

		in.close();
		out.close();
		System.exit(0);

	}

}
